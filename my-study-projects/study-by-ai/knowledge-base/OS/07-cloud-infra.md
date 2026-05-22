# Cloud Infrastructure Realities | Realidades de Infra em Nuvem

## Cloud Is Not Infinite | Nuvem Não é Infinita

EN | Cloud gives elasticity, not unlimited capacity.
PT-BR | Nuvem oferece elasticidade, não capacidade ilimitada.

EN | Every managed service has throughput, IOPS, connection, and quota limits.
PT-BR | Todo serviço gerenciado tem limites de throughput, IOPS, conexões e cotas.

## Core Constraints | Restrições Centrais

| Area | EN | PT-BR |
|---|---|---|
| Compute | CPU credits, noisy neighbors, throttling risk. | Créditos de CPU, noisy neighbors, risco de throttling. |
| Network | Cross-AZ latency/cost, packet loss variability. | Latência/custo entre AZs, variabilidade de perda de pacote. |
| Storage | IOPS caps, burst windows, latency variance. | Teto de IOPS, janelas de burst, variação de latência. |
| Quotas | API limits and account-level constraints. | Limites de API e restrições de conta. |

## Multi-AZ Trade-offs | Trade-offs Multi-AZ

- EN | Better resilience but higher latency and data transfer cost.
- PT-BR | Melhor resiliência, mas maior latência e custo de transferência.
- EN | Keep latency-sensitive dependencies in topology-aware placement.
- PT-BR | Mantenha dependências sensíveis à latência em posicionamento topológico consciente.

## Capacity Guardrails | Guardrails de Capacidade

- EN | Define minimum headroom per region/zone.
- PT-BR | Defina folga mínima por região/zona.
- EN | Reserve throughput for critical services.
- PT-BR | Reserve throughput para serviços críticos.
- EN | Run failure injection for dependency and zone-level outages.
- PT-BR | Execute testes de falha para indisponibilidade de dependência e zona.

## Cost vs Performance | Custo vs Performance

EN | Optimize for cost after SLO stability, not before.
PT-BR | Otimize custo após estabilizar SLO, não antes.

EN | Tail latency regressions often cost more than overprovisioning.
PT-BR | Regressões de latência de cauda geralmente custam mais que sobreprovisionamento.
