# 🧪 Benchmarking with testing and go test -bench

Benchmarks let you compare implementations with objective numbers for `ns/op`, `B/op`, and `allocs/op`.

## 📋 Summary

- [Create basic benchmark](#create-basic-benchmark)
- [Run benchmarks](#run-benchmarks)
- [Measure memory allocations](#measure-memory-allocations)
- [Reduce noise and improve consistency](#reduce-noise-and-improve-consistency)
- [Compare benchmark results](#compare-benchmark-results)

## Create basic benchmark

File example: `sum_bench_test.go`

```go
package main

import "testing"

func Sum(nums []int) int {
    total := 0
    for _, n := range nums {
        total += n
    }
    return total
}

func BenchmarkSum(b *testing.B) {
    data := make([]int, 10_000)
    for i := range data {
        data[i] = i
    }

    b.ResetTimer()
    for i := 0; i < b.N; i++ {
        _ = Sum(data)
    }
}
```

## Run benchmarks

Run all benchmarks in the module:

```bash
go test -bench=.
```

Run a specific benchmark:

```bash
go test -bench=BenchmarkSum
```

Set execution time per benchmark:

```bash
go test -bench=. -benchtime=3s
```

## Measure memory allocations

```bash
go test -bench=. -benchmem
```

Interpretation:

- `ns/op`: average nanoseconds per operation.
- `B/op`: average bytes allocated per operation.
- `allocs/op`: number of allocations per operation.

## Reduce noise and improve consistency

- Close background apps/processes.
- Use fixed input sizes.
- Avoid logging inside benchmark loops.
- Prefer table benchmarks for multiple cases.

Table benchmark example:

```go
func BenchmarkSumSizes(b *testing.B) {
    cases := []struct {
        name string
        size int
    }{
        {name: "1k", size: 1_000},
        {name: "10k", size: 10_000},
        {name: "100k", size: 100_000},
    }

    for _, tc := range cases {
        b.Run(tc.name, func(b *testing.B) {
            data := make([]int, tc.size)
            b.ResetTimer()
            for i := 0; i < b.N; i++ {
                _ = Sum(data)
            }
        })
    }
}
```

## Compare benchmark results

Save before/after outputs:

```bash
go test -bench=. -benchmem > old.txt
go test -bench=. -benchmem > new.txt
```

Use `benchstat` to compare statistically:

```bash
benchstat old.txt new.txt
```

## ✅ Practical checklist

- [ ] Benchmark covers critical hot path.
- [ ] Input data is realistic.
- [ ] `-benchmem` used to track allocations.
- [ ] Before/after outputs compared with `benchstat`.
- [ ] Improvement validated in integrated load test.
