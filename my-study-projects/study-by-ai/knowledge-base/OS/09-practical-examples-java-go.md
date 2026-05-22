# Practical Java and Go Examples | Exemplos Práticos Java e Go

## Java 21 Virtual Threads with Limits | Virtual Threads com Limites

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.*;

public class JavaIoBoundExample {
    private static final Semaphore BULKHEAD = new Semaphore(100);
    private static final HttpClient CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(200))
            .build();

    public static void main(String[] args) throws Exception {
        List<String> urls = List.of("https://example.com/a", "https://example.com/b");
        try (var exec = Executors.newVirtualThreadPerTaskExecutor()) {
            var futures = urls.stream().map(u -> exec.submit(() -> call(u))).toList();
            for (Future<Integer> f : futures) {
                System.out.println(f.get(500, TimeUnit.MILLISECONDS));
            }
        }
    }

    static int call(String url) throws Exception {
        if (!BULKHEAD.tryAcquire(50, TimeUnit.MILLISECONDS)) {
            throw new TimeoutException("bulkhead saturated");
        }
        try {
            var req = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofMillis(300))
                    .GET().build();
            return CLIENT.send(req, HttpResponse.BodyHandlers.ofString()).statusCode();
        } finally {
            BULKHEAD.release();
        }
    }
}
```

EN | Pattern: high concurrency with bounded dependency pressure.
PT-BR | Padrão: alta concorrência com pressão de dependência limitada.

## Java CPU-Bound Example | Exemplo CPU-Bound em Java

```java
import java.util.stream.LongStream;

public class JavaCpuBoundExample {
    public static void main(String[] args) {
        long result = LongStream.range(1, 50_000_000)
                .parallel()
                .map(JavaCpuBoundExample::mix)
                .sum();
        System.out.println(result);
    }

    static long mix(long x) {
        x ^= (x << 13);
        x ^= (x >>> 7);
        x ^= (x << 17);
        return x;
    }
}
```

EN | Use for pure compute; avoid remote IO inside parallel stream.
PT-BR | Use para computação pura; evite IO remoto dentro de parallel stream.

## Go IO-Bound with Backpressure | Go IO-Bound com Backpressure

```go
package main

import (
    "context"
    "net/http"
    "sync"
    "time"
)

func main() {
    urls := []string{"https://example.com/a", "https://example.com/b"}
    sem := make(chan struct{}, 100)
    client := &http.Client{Timeout: 300 * time.Millisecond}

    ctx, cancel := context.WithTimeout(context.Background(), 2*time.Second)
    defer cancel()

    var wg sync.WaitGroup
    for _, u := range urls {
        wg.Add(1)
        go func(url string) {
            defer wg.Done()
            select {
            case sem <- struct{}{}:
                defer func() { <-sem }()
            case <-ctx.Done():
                return
            }

            req, _ := http.NewRequestWithContext(ctx, http.MethodGet, url, nil)
            resp, err := client.Do(req)
            if err == nil {
                _ = resp.Body.Close()
            }
        }(u)
    }
    wg.Wait()
}
```

EN | Pattern: bounded goroutines plus deadline propagation.
PT-BR | Padrão: goroutines limitadas com propagação de deadline.

## Incident Example | Exemplo de Incidente

EN | Incident: p99 jumped from 200ms to 4s after traffic spike in a Java aggregator.
PT-BR | Incidente: p99 subiu de 200ms para 4s após pico de tráfego em agregador Java.

EN | Root cause: unbounded queue + aggressive retries + downstream pool saturation.
PT-BR | Causa raiz: fila sem limite + retries agressivos + saturação de pool downstream.

EN | Fixes: bounded queue, retry budget, stricter timeout, per-dependency bulkhead.
PT-BR | Correções: fila limitada, budget de retry, timeout mais rígido, bulkhead por dependência.

EN | Outcome: p99 back below 300ms with controlled degradation.
PT-BR | Resultado: p99 voltou para abaixo de 300ms com degradação controlada.
