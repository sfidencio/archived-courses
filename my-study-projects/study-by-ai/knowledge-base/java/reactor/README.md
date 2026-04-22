# 🌊🚀 Guia Definitivo de Spring WebFlux & Project Reactor

## 📚 Sumário

1. ⚡ Fundamentos do Paradigma Reativo
2. 🔬 Project Reactor (Biblioteca Reativa)
3. 🌿 Spring WebFlux
4. 🗄️ Integração com Banco de Dados
5. 🛡️ Segurança (Spring Security Reactive)
6. 🚦 Performance e Otimização
7. 🧩 Padrões Avançados
8. 🧪 Testes
9. ✅ Boas Práticas e Anti-Padrões
10. ☁️ Cloud Native e Kubernetes
11. 📈 Ferramentas de Monitoramento
12. 🔄 Migração de Spring MVC para WebFlux
13. 🧬 Tópicos Emergentes
14. 🌎 Comunidade e Recursos

---

## 1. ⚡ Fundamentos do Paradigma Reativo

A programação reativa é como um sistema de correios moderno: ao invés de esperar na fila para cada carta ser entregue (modelo imperativo), você coloca todas as cartas na caixa e o sistema se encarrega de entregá-las de forma eficiente, lidando com atrasos, falhas e picos de demanda sem travar o processo. O paradigma reativo é a base para sistemas escaláveis, resilientes e responsivos, essenciais para aplicações modernas e distribuídas.

### 🧩 Princípios Fundamentais (Reactive Manifesto)
- **Responsividade:** O sistema responde rapidamente a eventos, mesmo sob carga.
- **Resiliência:** Falhas são tratadas de forma isolada, sem comprometer o todo.
- **Elasticidade:** O sistema se adapta dinamicamente à carga, escalando horizontalmente.
- **Orientação a mensagens:** Comunicação assíncrona e desacoplada, como um chat em grupo onde cada mensagem pode ser processada por vários participantes.

> **Analogia:** Imagine um restaurante tradicional (imperativo): cada pedido é processado sequencialmente, e se um cliente demora, todos atrás esperam. No modelo reativo, cada pedido é uma "promessa" (Promise/Future), e os garçons (threads) nunca ficam parados esperando: eles servem quem está pronto, otimizando o fluxo e evitando gargalos.

### 🔄 Imperativo (blocking) vs. Reativo (non-blocking)

| Paradigma     | Execução         | Threads | Escalabilidade | Consumo de recursos |
|--------------|------------------|---------|----------------|---------------------|
| Imperativo   | Sequencial       | Bloqueia| Limitada       | Alto                |
| Reativo      | Assíncrona       | Não bloqueia | Alta         | Baixo               |

#### Exemplo prático (Imperativo vs. Reativo)

**Imperativo (Spring MVC):**
```java
@GetMapping("/clientes")
public List<Cliente> listarClientes() {
    return clienteService.buscarTodos(); // Bloqueia até terminar
}
```

**Reativo (WebFlux):**
```java
@GetMapping("/clientes")
public Flux<Cliente> listarClientes() {
    return clienteService.buscarTodos(); // Não bloqueia, retorna um fluxo
}
```

### 🚦 Melhores práticas e dicas avançadas
- **Evite misturar código bloqueante em pipelines reativos**: usar `block()` ou `Thread.sleep()` pode travar o sistema.
- **Use operadores como `publishOn` e `subscribeOn` para controlar o agendamento de tarefas**.
- **Monitore o uso de recursos**: sistemas reativos podem mascarar gargalos se não forem bem monitorados.
- **Aplique backpressure**: proteja consumidores lentos de sobrecarga usando estratégias como buffer, drop ou latest.

### 📈 Diagrama explicativo

```
[Evento Externo] ──> [Publisher] ──> [Operadores] ──> [Subscriber]
      |                 |                |                |
      v                 v                v                v
  (Request)         (Transform)     (Filtrar, Mapear)  (Consumir)
```

### 💡 Resumo
A programação reativa é essencial para sistemas modernos que precisam escalar, ser resilientes e responder rapidamente. Pense nela como um sistema de entregas eficiente: cada evento é tratado como uma entrega independente, sem travar o fluxo geral. Dominar esse paradigma é um diferencial para desenvolvedores que buscam alta performance e robustez em ambientes distribuídos.

---

## 2. 🔬 Project Reactor (Biblioteca Reativa)

- **Mono e Flux:**
  - `Mono<T>` representa 0 ou 1 elemento.
  - `Flux<T>` representa 0 a N elementos.
  - Ambos são publishers reativos, seguindo a especificação [Reactive Streams](https://www.reactive-streams.org/).
- **Operadores básicos e avançados:**
  - `map`, `flatMap`, `flatMapSequential`, `concatMap`, `filter`, `reduce`, `zip`, `merge`, `concat`.
  - Permitem transformar, combinar e manipular fluxos de dados de forma declarativa.
- **Manipulação de erros:**
  - `onErrorResume`, `onErrorReturn`, `onErrorMap`, `doOnError`, `retry`, `retryWhen`.
  - Estratégias para resiliência e fallback em pipelines reativos.
- **Threading e Schedulers:**
  - `subscribeOn`, `publishOn`, `Schedulers.parallel()`, `Schedulers.elastic()`, `Schedulers.boundedElastic()`, `Schedulers.single()`, `Schedulers.immediate()`.
  - Controle fino sobre execução assíncrona e paralelismo.
- **Hot vs. Cold Publishers:**
  - Cold: cada subscriber recebe todos os dados desde o início.
  - Hot: subscribers compartilham o fluxo de dados em tempo real.
- **Backpressure:**
  - Estratégias: Buffer, Drop, Latest, Error.
  - Essencial para evitar sobrecarga e garantir estabilidade.
- **Testes:**
  - `StepVerifier`, `TestPublisher` para validação de fluxos reativos.

## 3. 🌿 Spring WebFlux

- **Arquitetura baseada em Netty (ou outros servidores não-blocking).**
- **Criação de endpoints reativos:**
  - Anotações: `@RestController`, `@GetMapping`, etc.
  - Functional Endpoints: `RouterFunction`, `HandlerFunction`.
  - Tipos de retorno: `Mono<ResponseEntity>`, `Flux<T>`.
- **Tratamento de exceções globais:**
  - `@ExceptionHandler`, `WebExceptionHandler`.
- **Validação reativa:**
  - `@Valid` com `Mono`/`Flux`.
- **WebClient:**
  - Alternativa reativa ao `RestTemplate`.
  - Configuração, requisições, tratamento de respostas.
  - Exchange strategies, filters, timeouts.
- **WebSockets e SSE:**
  - Comunicação bidirecional e eventos contínuos.
- **RSocket:**
  - Protocolo reativo para comunicação bidirecional.

## 4. 🗄️ Integração com Banco de Dados

- **Spring Data Reactive Repositories:**
  - Suporte a MongoDB, Cassandra, Couchbase, R2DBC (bancos relacionais).
- **Diferenças entre Hibernate/JPA (blocking) e R2DBC (reactive).**
- **Transações reativas.**
- **Operações assíncronas com Mono e Flux em repositórios.**

## 5. 🛡️ Segurança (Spring Security Reactive)

- **Autenticação e autorização reativa.**
- **Configuração de `SecurityWebFilterChain`.**
- **Integração com OAuth2, JWT.**
- **Proteção contra CSRF, CORS.**

## 6. 🚦 Performance e Otimização

- **Diagnóstico de bottlenecks em sistemas reativos.**
- **Uso de Micrometer para métricas reativas.**
- **Balanceamento entre threads bloqueantes e não-bloqueantes.**
- **Virtual Threads (Java 21+) e impacto no WebFlux.**

## 7. 🧩 Padrões Avançados

- **Circuit Breaker (Resilience4j ou Spring Cloud Circuit Breaker).**
- **Caching reativo (Caffeine, Redis com Mono/Flux).**
- **Event Sourcing e CQRS em sistemas reativos.**
- **Batching e Rate Limiting.**
- **Reactive Messaging (Kafka, RabbitMQ com Reactor).**

## 8. 🧪 Testes

- **Testes unitários com StepVerifier.**
- **Testes de integração com `@SpringBootTest` e `WebTestClient`.**
- **Mocking de componentes reativos (Mockito com when para Mono/Flux).**

## 9. ✅ Boas Práticas e Anti-Padrões

- **Evitar bloqueio acidental (`block()`, `subscribe()` em métodos não-reativos).**
- **Gerenciamento adequado de recursos (connection pools, timeouts).**
- **Logging em pipelines reativos (`doOnNext`, `doOnSubscribe`, etc.).**
- **Evitar `Mono<Mono<T>>` ou `Flux<Flux<T>>` (uso correto de `flatMap`).**

## 10. ☁️ Cloud Native e Kubernetes

- **Deploy de aplicações reativas em Kubernetes.**
- **Configuração de health checks reativos (`/actuator/health`).**
- **Escalabilidade horizontal e tratamento de falhas.**

## 11. 📈 Ferramentas de Monitoramento

- **Prometheus + Grafana para métricas reativas.**
- **Distributed Tracing (Zipkin, Sleuth).**
- **Actuator Endpoints (`/actuator/metrics`, `/actuator/httptrace`).**

## 12. 🔄 Migração de Spring MVC para WebFlux

- **Estratégias para migração incremental.**
- **Compatibilidade com bibliotecas bloqueantes (ex: JDBC, JPA).**

## 13. 🧬 Tópicos Emergentes

- **GraalVM Native Image para aplicações WebFlux.**
- **Reactive GraphQL (com Spring GraphQL).**
- **Quarkus/Micronaut (comparativo com WebFlux).**

## 14. 🌎 Comunidade e Recursos

- **Projetos de exemplo no GitHub.**
- **Participação em fóruns (Stack Overflow, Spring Community).**
- **Palestras e artigos sobre Reactive Systems.**

---

> Um desenvolvedor sênior deve não apenas entender esses tópicos teoricamente, mas também saber quando e como aplicá-los em cenários reais, considerando trade-offs entre complexidade e benefícios da programação reativa.

[⬅️ Back ](../README.md)