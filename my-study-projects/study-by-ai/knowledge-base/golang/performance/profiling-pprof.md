# 🔬 Profiling with pprof (CPU, Memory, Goroutine, Mutex)

`pprof` helps you understand where time and memory are spent, and where contention appears.

## 📋 Summary

- [Enable pprof in your service](#enable-pprof-in-your-service)
- [Collect CPU profile](#collect-cpu-profile)
- [Inspect memory allocations](#inspect-memory-allocations)
- [Inspect goroutines and blocking](#inspect-goroutines-and-blocking)
- [Inspect mutex contention](#inspect-mutex-contention)
- [Common optimization workflow](#common-optimization-workflow)

## Enable pprof in your service

```go
package main

import (
    "log"
    "net/http"

    _ "net/http/pprof"
)

func main() {
    go func() {
        // Exposes /debug/pprof endpoints in localhost:6060
        log.Println(http.ListenAndServe("localhost:6060", nil))
    }()

    // Start your main server/application logic
    select {}
}
```

## Collect CPU profile

1. Run workload while service is under realistic traffic.
2. Capture profile:

```bash
go tool pprof http://localhost:6060/debug/pprof/profile?seconds=30
```

Useful commands inside pprof shell:

```text
top
list functionName
web
```

## Inspect memory allocations

Heap profile:

```bash
go tool pprof http://localhost:6060/debug/pprof/heap
```

Allocation profile (who allocates most over time):

```bash
go tool pprof http://localhost:6060/debug/pprof/allocs
```

Focus on:

- High-frequency allocations in hot paths.
- Large temporary objects.
- Unnecessary string/byte conversions.

## Inspect goroutines and blocking

Current goroutine stack snapshot:

```bash
curl -s http://localhost:6060/debug/pprof/goroutine?debug=2
```

Blocking profile (requires runtime setting in app):

```go
runtime.SetBlockProfileRate(1)
```

Then:

```bash
go tool pprof http://localhost:6060/debug/pprof/block
```

## Inspect mutex contention

Enable mutex profiling:

```go
runtime.SetMutexProfileFraction(5)
```

Collect and inspect:

```bash
go tool pprof http://localhost:6060/debug/pprof/mutex
```

## Common optimization workflow

1. Measure baseline latency/throughput.
2. Capture CPU + heap + goroutine + mutex profiles.
3. Optimize one bottleneck at a time.
4. Re-run the same workload.
5. Keep only changes with measurable gain.

## ✅ Practical checklist

- [ ] pprof endpoint enabled safely (only internal network).
- [ ] Reproducible load scenario created.
- [ ] CPU and heap hotspots identified.
- [ ] Contention points validated with mutex/block profiles.
- [ ] Before/after metrics documented.
