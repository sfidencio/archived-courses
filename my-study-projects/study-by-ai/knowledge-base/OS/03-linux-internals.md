# Linux Internals for Scale | Internos do Linux para Escala

## Scheduler and CFS | Escalonador e CFS

EN | Linux CFS aims fairness, not your business latency target.
PT-BR | O CFS do Linux busca justiça, não sua meta de latência de negócio.

EN | Focus on per-core run queue, context switches, and CPU steal in virtualized/cloud environments.
PT-BR | Foque em run queue por core, context switches e CPU steal em ambientes virtualizados/nuvem.

## Run Queue and Context Switch | Fila de Execução e Troca de Contexto

- EN | High run queue with stable CPU means contention.
- PT-BR | Run queue alta com CPU estável indica contenção.
- EN | Frequent context switching hurts cache locality and throughput.
- PT-BR | Trocas de contexto frequentes prejudicam localidade de cache e throughput.

## Virtual Memory | Memória Virtual

| Concept | EN | PT-BR |
|---|---|---|
| RSS | Resident memory actually in RAM. | Memória residente de fato na RAM. |
| Page cache | Kernel cache for filesystem pages. | Cache do kernel para páginas de filesystem. |
| Minor fault | Page mapping fault without disk read. | Falha de mapeamento sem leitura de disco. |
| Major fault | Fault requiring disk read, high latency impact. | Falha exigindo leitura de disco, alto impacto de latência. |
| Swap | Last resort memory; dangerous for latency-sensitive systems. | Memória de último recurso; perigosa para sistemas sensíveis a latência. |

## Syscalls, futex, epoll | Syscalls, futex, epoll

EN | Heavy futex activity often points to lock contention.
PT-BR | Atividade intensa de futex geralmente aponta contenção de lock.

EN | epoll-based event loops scale high connection cardinality better than thread-per-connection.
PT-BR | Event loops com epoll escalam alta cardinalidade de conexões melhor que thread por conexão.

## Disk and Filesystem | Disco e Sistema de Arquivos

- EN | Watch IOPS, await, queue depth, fsync frequency.
- PT-BR | Monitore IOPS, await, profundidade de fila e frequência de fsync.
- EN | Small random writes are expensive; batching reduces overhead.
- PT-BR | Escritas pequenas aleatórias são caras; batching reduz overhead.

## Network Stack | Pilha de Rede

- EN | Monitor retransmissions, backlog drops, socket states, TIME_WAIT pressure.
- PT-BR | Monitore retransmissões, drops de backlog, estados de socket e pressão de TIME_WAIT.
- EN | Connection churn can dominate CPU in microservices.
- PT-BR | Churn de conexões pode dominar CPU em microsserviços.

## Linux Tuning Areas (Measure First) | Áreas de Tuning Linux (Meça Primeiro)

| Area | EN | PT-BR |
|---|---|---|
| File descriptors | Prevent FD exhaustion. | Evitar exaustão de FDs. |
| TCP backlog | Protect accept path during spikes. | Proteger accept durante picos. |
| Ephemeral ports | Avoid connection exhaustion. | Evitar exaustão de portas efêmeras. |
| Swappiness/reclaim | Minimize swap-induced tail latency. | Minimizar latência de cauda induzida por swap. |

## Commands for Diagnosis | Comandos para Diagnóstico

- EN | vmstat 1, iostat -x 1, ss -s, top -H -p <pid>, cat /proc/meminfo
- PT-BR | vmstat 1, iostat -x 1, ss -s, top -H -p <pid>, cat /proc/meminfo
