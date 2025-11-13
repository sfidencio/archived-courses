# Pair do Spring Data

A classe `org.springframework.data.util.Pair` é uma classe utilitária do Spring Data que representa um **par de valores** (tupla de dois elementos), permitindo retornar ou manipular dois objetos relacionados de forma type-safe.

## 📌 Objetivo

- Representar um par de valores relacionados
- Evitar criação de classes auxiliares apenas para transportar dois valores
- Fornecer uma alternativa type-safe a arrays ou listas genéricas
- Facilitar retorno de múltiplos valores de métodos

## 🔍 Características

### Estrutura

```java
public class Pair<S, T> {
    private final S first;  // Primeiro elemento
    private final T second; // Segundo elemento
}
```

- **Imutável** - Uma vez criado, os valores não podem ser alterados
- **Generic** - Suporta qualquer tipo de objeto
- **Type-safe** - Garante segurança de tipos em tempo de compilação

## 🛠️ Criando Pairs

### 1. **Método estático `of()`**

```java
// Pair de String e Integer
Pair<String, Integer> resultado = Pair.of("João", 30);

// Pair de tipos diferentes
Pair<Usuario, List<Pedido>> dados = Pair.of(usuario, pedidos);

// Pair com null (permitido)
Pair<String, String> opcional = Pair.of("valor", null);
```

### 2. **Com tipos inferidos**

```java
var nomeIdade = Pair.of("Maria", 25);
var produtoQuantidade = Pair.of(produto, 10);
```

## 📖 Acessando Valores

### Métodos principais

```java
Pair<String, Integer> pair = Pair.of("Alice", 28);

// Obter primeiro elemento
String nome = pair.getFirst();  // "Alice"

// Obter segundo elemento
Integer idade = pair.getSecond(); // 28
```

## 💡 Casos de Uso Práticos

### 1. **Retornar múltiplos valores de um método**

```java
@Service
public class RelatorioService {
    
    public Pair<Long, BigDecimal> obterTotalPedidos(Long clienteId) {
        Long quantidade = repository.countByClienteId(clienteId);
        BigDecimal valorTotal = repository.sumValorByClienteId(clienteId);
        
        return Pair.of(quantidade, valorTotal);
    }
}

// Uso
Pair<Long, BigDecimal> resultado = service.obterTotalPedidos(123L);
System.out.println("Quantidade: " + resultado.getFirst());
System.out.println("Valor Total: " + resultado.getSecond());
```

### 2. **Queries personalizadas com múltiplos retornos**

```java
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    @Query("SELECT new org.springframework.data.util.Pair(p.categoria, COUNT(p)) " +
           "FROM Produto p GROUP BY p.categoria")
    List<Pair<String, Long>> countPorCategoria();
}

// Uso
List<Pair<String, Long>> estatisticas = repository.countPorCategoria();
estatisticas.forEach(pair -> 
    System.out.printf("Categoria: %s - Quantidade: %d%n", 
        pair.getFirst(), pair.getSecond())
);
```

### 3. **Processamento de dados relacionados**

```java
@Service
public class ProcessadorService {
    
    public List<Pair<Usuario, Integer>> calcularPontuacao(List<Usuario> usuarios) {
        return usuarios.stream()
            .map(usuario -> {
                Integer pontos = calcularPontos(usuario);
                return Pair.of(usuario, pontos);
            })
            .sorted((p1, p2) -> p2.getSecond().compareTo(p1.getSecond()))
            .collect(Collectors.toList());
    }
}
```

### 4. **Agrupamento de resultados**

```java
@Service
public class VendaService {
    
    public Pair<List<Venda>, List<Venda>> separarVendasPorStatus(List<Venda> vendas) {
        List<Venda> aprovadas = vendas.stream()
            .filter(v -> v.getStatus() == Status.APROVADA)
            .collect(Collectors.toList());
            
        List<Venda> pendentes = vendas.stream()
            .filter(v -> v.getStatus() == Status.PENDENTE)
            .collect(Collectors.toList());
            
        return Pair.of(aprovadas, pendentes);
    }
}

// Uso
Pair<List<Venda>, List<Venda>> resultado = service.separarVendasPorStatus(vendas);
List<Venda> aprovadas = resultado.getFirst();
List<Venda> pendentes = resultado.getSecond();
```

### 5. **Cache de chave-valor**

```java
@Service
public class CacheService {
    
    private Map<String, Pair<LocalDateTime, Object>> cache = new ConcurrentHashMap<>();
    
    public void put(String key, Object value, Duration ttl) {
        LocalDateTime expiracao = LocalDateTime.now().plus(ttl);
        cache.put(key, Pair.of(expiracao, value));
    }
    
    public Optional<Object> get(String key) {
        Pair<LocalDateTime, Object> entry = cache.get(key);
        
        if (entry == null) {
            return Optional.empty();
        }
        
        // Verifica se expirou
        if (LocalDateTime.now().isAfter(entry.getFirst())) {
            cache.remove(key);
            return Optional.empty();
        }
        
        return Optional.of(entry.getSecond());
    }
}
```

## 🆚 Comparação com Alternativas

### ❌ **Array/List Genérica** (não recomendado)

```java
// Não type-safe, propenso a erros
Object[] resultado = new Object[]{"João", 30};
String nome = (String) resultado[0];  // cast necessário
Integer idade = (Integer) resultado[1]; // cast necessário
```

### ❌ **Classe Auxiliar Customizada**

```java
// Muito verboso para casos simples
public class NomeIdade {
    private final String nome;
    private final Integer idade;
    
    public NomeIdade(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // getters, equals, hashCode, toString...
}
```

### ✅ **Pair do Spring Data**

```java
// Limpo, type-safe e direto
Pair<String, Integer> resultado = Pair.of("João", 30);
```

## 🎯 Quando Usar

### ✅ **Use Pair quando:**

1. Precisa retornar dois valores relacionados de um método
2. Os valores são temporários e não justificam uma classe própria
3. Está trabalhando com queries que retornam múltiplas agregações
4. Necessita agrupar dados para processamento intermediário

### ❌ **Evite Pair quando:**

1. Os valores representam um conceito de domínio (crie uma classe própria)
2. Precisa de mais de dois valores (considere uma classe ou record)
3. O código ficará confuso sobre o significado de `first` e `second`
4. A relação entre os valores precisa de documentação adicional

## 📊 Pair vs Record (Java 14+)

### **Pair** - Para casos genéricos

```java
// Uso rápido sem criar estrutura
Pair<String, Integer> dados = Pair.of("nome", 123);
```

### **Record** - Para domínio específico

```java
// Mais descritivo e auto-documentado
public record UsuarioPontuacao(Usuario usuario, Integer pontos) {}

UsuarioPontuacao resultado = new UsuarioPontuacao(usuario, 100);
```

**Dica:** A partir do Java 14+, prefira **records** quando o par representa um conceito específico do domínio.

## 🔧 Métodos Úteis

### Equality e HashCode

```java
Pair<String, Integer> p1 = Pair.of("teste", 1);
Pair<String, Integer> p2 = Pair.of("teste", 1);
Pair<String, Integer> p3 = Pair.of("outro", 2);

p1.equals(p2); // true
p1.equals(p3); // false
p1.hashCode() == p2.hashCode(); // true
```

### ToString

```java
Pair<String, Integer> pair = Pair.of("João", 30);
System.out.println(pair); // Pair [first=João, second=30]
```

## 💡 Exemplo Completo - Sistema de Ranking

```java
@Service
public class RankingService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    /**
     * Retorna ranking de usuários com suas pontuações
     */
    public List<Pair<Usuario, Integer>> obterRanking(int limite) {
        return usuarioRepository.findAll().stream()
            .map(usuario -> Pair.of(usuario, calcularPontuacao(usuario)))
            .sorted((p1, p2) -> p2.getSecond().compareTo(p1.getSecond()))
            .limit(limite)
            .collect(Collectors.toList());
    }
    
    /**
     * Retorna estatísticas: (média, total)
     */
    public Pair<Double, Long> obterEstatisticas() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        
        double media = usuarios.stream()
            .mapToInt(this::calcularPontuacao)
            .average()
            .orElse(0.0);
            
        long total = usuarios.size();
        
        return Pair.of(media, total);
    }
    
    /**
     * Separa usuários: (ativos, inativos)
     */
    public Pair<List<Usuario>, List<Usuario>> separarPorStatus() {
        List<Usuario> todos = usuarioRepository.findAll();
        
        List<Usuario> ativos = todos.stream()
            .filter(Usuario::isAtivo)
            .collect(Collectors.toList());
            
        List<Usuario> inativos = todos.stream()
            .filter(u -> !u.isAtivo())
            .collect(Collectors.toList());
            
        return Pair.of(ativos, inativos);
    }
    
    private Integer calcularPontuacao(Usuario usuario) {
        // lógica de cálculo
        return usuario.getPedidos().size() * 10;
    }
}

// Controller
@RestController
@RequestMapping("/ranking")
public class RankingController {
    
    @Autowired
    private RankingService rankingService;
    
    @GetMapping("/top10")
    public ResponseEntity<List<RankingDTO>> obterTop10() {
        List<Pair<Usuario, Integer>> ranking = rankingService.obterRanking(10);
        
        List<RankingDTO> response = ranking.stream()
            .map(pair -> new RankingDTO(
                pair.getFirst().getNome(),
                pair.getSecond()
            ))
            .collect(Collectors.toList());
            
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/estatisticas")
    public ResponseEntity<EstatisticasDTO> obterEstatisticas() {
        Pair<Double, Long> stats = rankingService.obterEstatisticas();
        
        return ResponseEntity.ok(new EstatisticasDTO(
            stats.getFirst(),  // média
            stats.getSecond()  // total
        ));
    }
}
```

## 🎓 Vantagens

1. **Type-safe** - Segurança de tipos em compilação
2. **Imutável** - Thread-safe por padrão
3. **Genérico** - Funciona com qualquer tipo
4. **Leve** - Não requer criação de classes auxiliares
5. **Integrado** - Parte do ecossistema Spring Data

## ⚠️ Limitações

1. **Apenas dois elementos** - Para mais elementos, crie uma classe própria ou use record
2. **Nomes genéricos** - `first` e `second` podem não ser auto-explicativos
3. **Semântica limitada** - Não expressa o significado dos valores

## 📚 Referências

- [Spring Data Commons Documentation](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/util/Pair.html)
- Package: `org.springframework.data.util.Pair`
- Disponível desde Spring Data Commons 1.10

## 💭 Conclusão

`Pair` é uma ferramenta útil para situações onde você precisa agrupar temporariamente dois valores relacionados, sem a necessidade de criar uma classe específica. É particularmente útil em:

- Retornos de métodos auxiliares
- Queries com múltiplas agregações
- Processamento intermediário de streams
- Cache de dados com metainformações

**Regra de ouro:** Use `Pair` para dados temporários e genéricos. Para conceitos de domínio, crie classes próprias (ou records a partir do Java 14+) que expressem melhor a semântica do negócio.