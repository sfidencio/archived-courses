# Containers and Docker | Containers e Docker

## Container Reality | Realidade de Container

EN | A container is an isolated process, not a full virtual machine.
PT-BR | Um container é um processo isolado, não uma máquina virtual completa.

EN | The host kernel is shared, so kernel pressure impacts all containers.
PT-BR | O kernel do host é compartilhado, então pressão no kernel impacta todos os containers.

## Namespaces and cgroups | Namespaces e cgroups

| Component | EN | PT-BR |
|---|---|---|
| Namespaces | Process, network, mount, IPC isolation. | Isolamento de processo, rede, mount e IPC. |
| cgroups cpu | CPU quota and scheduling pressure. | Cota de CPU e pressão de agendamento. |
| cgroups memory | Hard memory limit and OOM behavior. | Limite rígido de memória e comportamento de OOM. |
| cgroups pids | Maximum process/thread count. | Quantidade máxima de processos/threads. |
| cgroups io | Block IO control. | Controle de IO de bloco. |

## JVM in Containers | JVM em Containers

- EN | Validate heap and non-heap split against cgroup memory limit.
- PT-BR | Valide divisão heap e não-heap contra limite de memória do cgroup.
- EN | Watch for OOMKill from container limit before JVM OutOfMemoryError.
- PT-BR | Observe OOMKill por limite de container antes do OutOfMemoryError da JVM.

## Startup and Image Discipline | Disciplina de Startup e Imagem

- EN | Keep image small to reduce cold start and rollout blast window.
- PT-BR | Mantenha imagem pequena para reduzir cold start e janela de impacto de rollout.
- EN | Preload what is required, avoid heavy lazy init in readiness window.
- PT-BR | Pré-carregue o necessário, evite lazy init pesado na janela de readiness.

## Common Failure Modes | Modos de Falha Comuns

| EN | PT-BR |
|---|---|
| CPU throttling from low quota causes latency spikes. | Throttling de CPU por cota baixa causa picos de latência. |
| Memory limits too tight cause OOMKill loops. | Limites de memória apertados causam loops de OOMKill. |
| Excessive thread count increases memory and scheduler pressure. | Excesso de threads aumenta pressão de memória e scheduler. |

## Container Observability | Observabilidade de Container

- EN | Track throttled CPU time, RSS, OOM events, restart count.
- PT-BR | Acompanhe tempo de CPU throttled, RSS, eventos OOM e contagem de restart.
- EN | Correlate pod/container metrics with JVM and app latency.
- PT-BR | Correlacione métricas de pod/container com JVM e latência da aplicação.
