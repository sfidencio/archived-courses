# OS at Scale: Java, Cloud, Docker, Kubernetes | SO em Escala: Java, Nuvem, Docker, Kubernetes

Definitive bilingual guide for production engineering from app layer to kernel and infrastructure. | Guia definitivo bilíngue para engenharia de produção da camada de aplicação até kernel e infraestrutura.

## Study Map | Mapa de Estudo

- [01 Performance Fundamentals | Fundamentos de Performance](./01-performance-fundamentals.md)
- [02 CPU-Bound vs IO-Bound](./02-cpu-vs-io-bound.md)
- [03 Linux Internals for Scale | Internos do Linux para Escala](./03-linux-internals.md)
- [04 Java 17-21 Runtime and Resilience | Runtime Java 17-21 e Resiliência](./04-java17-21-runtime.md)
- [05 Containers and Docker | Containers e Docker](./05-containers-docker.md)
- [06 Kubernetes at Scale | Kubernetes em Escala](./06-kubernetes-scale.md)
- [07 Cloud Infrastructure Realities | Realidades de Infra em Nuvem](./07-cloud-infra.md)
- [08 Operations and Troubleshooting | Operação e Troubleshooting](./08-operations-troubleshooting.md)
- [09 Practical Java and Go Examples | Exemplos Práticos Java e Go](./09-practical-examples-java-go.md)
- [10 Scale Readiness and 30-60-90 Roadmap | Scale Readiness e Roadmap 30-60-90](./10-scale-readiness-roadmap.md)
- [11 Java Concurrency and Parallelism Playbook | Playbook Java de Concorrência e Paralelismo](./11-java-concurrency-parallelism-playbook.md)

## End-to-End System View | Visão de Sistema de Ponta a Ponta

```mermaid
flowchart LR
    A[Client Traffic] --> B[Service Java]
    B --> C[JVM Threads GC Memory]
    C --> D[Linux Kernel Scheduler VFS Network MM]
    D --> E[Container cgroups namespaces]
    E --> F[Kubernetes Scheduler HPA PDB]
    F --> G[Cloud Compute Disk Network]
    G --> H[Dependency DB Cache Queue]
```

## How to Use This Guide | Como Usar Este Guia

1. Read modules in order for foundations first. | Leia os módulos em ordem para construir a base.
2. Jump to operations and examples for incident support. | Vá para operação e exemplos para suporte em incidentes.
3. Finish with the readiness checklist and roadmap. | Finalize com checklist de prontidão e roadmap.

## Core References | Referências Centrais

- Tanenbaum, Modern Operating Systems
- OSTEP, Operating Systems: Three Easy Pieces
- Brendan Gregg, Systems Performance
- Linux Kernel Documentation
- Java JEPs 17-21
