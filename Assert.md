# Assert do Spring Framework

A classe `org.springframework.util.Assert` é uma classe utilitária do Spring Framework que facilita a validação de argumentos e estados, **abstraindo o lançamento de exceptions**.

## 📌 Objetivo

- Simplificar validações de pré-condições
- Melhorar a legibilidade do código
- Evitar código boilerplate de `if/throw`
- Lançar exceptions apropriadas automaticamente

## 🔍 Principais Métodos

### 1. **notNull** - Valida que objeto não é null

```java
public void criarUsuario(String nome, String email) {
    Assert.notNull(nome, "O nome não pode ser nulo");
    Assert.notNull(email, "O email não pode ser nulo");
    // ... lógica
}
```

**Lança:** `IllegalArgumentException` se o objeto for null

---

### 2. **hasText** - Valida que String tem conteúdo

```java
public void validarCodigo(String codigo) {
    Assert.hasText(codigo, "O código não pode estar vazio");
    // ... lógica
}
```

**Lança:** `IllegalArgumentException` se a String for null, vazia ou contiver apenas espaços

---

### 3. **isTrue** - Valida condição booleana

```java
public void sacar(BigDecimal valor) {
    Assert.isTrue(valor.compareTo(BigDecimal.ZERO) > 0, 
                  "O valor deve ser maior que zero");
    // ... lógica
}
```

**Lança:** `IllegalArgumentException` se a condição for false

---

### 4. **notEmpty** - Valida coleções/arrays não vazios

```java
public void processarPedidos(List<Pedido> pedidos) {
    Assert.notEmpty(pedidos, "A lista de pedidos não pode estar vazia");
    // ... lógica
}
```

**Lança:** `IllegalArgumentException` se a coleção/array for null ou vazio

---

### 5. **state** - Valida estado do objeto

```java
public void fecharConta() {
    Assert.state(this.saldo.equals(BigDecimal.ZERO), 
                 "A conta deve estar zerada antes de fechar");
    // ... lógica
}
```

**Lança:** `IllegalStateException` se a condição for false

---

### 6. **isInstanceOf** - Valida tipo do objeto

```java
public void processar(Object obj) {
    Assert.isInstanceOf(Usuario.class, obj, 
                        "O objeto deve ser uma instância de Usuario");
    Usuario usuario = (Usuario) obj;
    // ... lógica
}
```

**Lança:** `IllegalArgumentException` se o objeto não for da classe especificada

---

### 7. **isAssignable** - Valida compatibilidade de classes

```java
public void validarTipo(Class<?> tipo) {
    Assert.isAssignable(Serializable.class, tipo, 
                        "A classe deve implementar Serializable");
    // ... lógica
}
```

---

### 8. **hasLength** - Valida que String tem comprimento

```java
public void validarSenha(String senha) {
    Assert.hasLength(senha, "A senha não pode estar vazia");
    // ... lógica
}
```

**Similar ao `hasText`, mas não valida espaços em branco**

---

### 9. **doesNotContain** - Valida que String não contém substring

```java
public void validarNome(String nome) {
    Assert.doesNotContain(nome, "@", 
                          "O nome não pode conter o caractere @");
    // ... lógica
}
```

---

### 10. **noNullElements** - Valida que array não tem elementos null

```java
public void processar(String[] itens) {
    Assert.noNullElements(itens, 
                          "O array não pode conter elementos nulos");
    // ... lógica
}
```

---

## 🆚 Comparação: Antes vs Depois

### ❌ **ANTES** (sem Assert)

```java
public class UsuarioService {
    
    public void criarUsuario(String nome, String email, Integer idade) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email não pode estar vazio");
        }
        
        if (idade == null || idade < 18) {
            throw new IllegalArgumentException("Idade deve ser maior ou igual a 18");
        }
        
        // ... lógica de criação
    }
}
```

### ✅ **DEPOIS** (com Assert)

```java
public class UsuarioService {
    
    public void criarUsuario(String nome, String email, Integer idade) {
        Assert.notNull(nome, "Nome não pode ser nulo");
        Assert.hasText(email, "Email não pode estar vazio");
        Assert.notNull(idade, "Idade não pode ser nula");
        Assert.isTrue(idade >= 18, "Idade deve ser maior ou igual a 18");
        
        // ... lógica de criação
    }
}
```

---

## 💡 Exemplo Prático Completo

```java
@Service
public class PedidoService {
    
    private final PedidoRepository repository;
    
    public PedidoService(PedidoRepository repository) {
        Assert.notNull(repository, "Repository não pode ser nulo");
        this.repository = repository;
    }
    
    public Pedido criarPedido(Cliente cliente, List<Item> itens, BigDecimal desconto) {
        // Validações de argumentos
        Assert.notNull(cliente, "Cliente não pode ser nulo");
        Assert.notEmpty(itens, "Pedido deve conter ao menos um item");
        Assert.notNull(desconto, "Desconto não pode ser nulo");
        Assert.isTrue(desconto.compareTo(BigDecimal.ZERO) >= 0, 
                      "Desconto não pode ser negativo");
        
        // Validações de estado
        Assert.state(cliente.isAtivo(), 
                     "Cliente deve estar ativo para criar pedido");
        
        Pedido pedido = new Pedido(cliente, itens, desconto);
        return repository.save(pedido);
    }
    
    public void cancelarPedido(Long pedidoId) {
        Assert.notNull(pedidoId, "ID do pedido não pode ser nulo");
        
        Pedido pedido = repository.findById(pedidoId)
            .orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado"));
        
        Assert.state(pedido.podeSerCancelado(), 
                     "Pedido não pode ser cancelado no estado atual");
        
        pedido.cancelar();
        repository.save(pedido);
    }
}
```

---

## 🎯 Boas Práticas

### ✅ **Faça:**

1. Use para validar argumentos de métodos públicos
2. Use para validar estados antes de operações críticas
3. Forneça mensagens claras e descritivas
4. Use no início dos métodos (fail-fast)

```java
public void transferir(Conta origem, Conta destino, BigDecimal valor) {
    Assert.notNull(origem, "Conta de origem não pode ser nula");
    Assert.notNull(destino, "Conta de destino não pode ser nula");
    Assert.notNull(valor, "Valor não pode ser nulo");
    Assert.isTrue(valor.compareTo(BigDecimal.ZERO) > 0, "Valor deve ser positivo");
    
    // ... lógica
}
```

### ❌ **Evite:**

1. Usar para validações de regras de negócio complexas
2. Usar em métodos privados (prefira validações simples)
3. Usar para substituir validações do Bean Validation (@NotNull, @NotEmpty, etc.)

---

## 🔄 Assert vs Bean Validation

### **Assert** - Para lógica interna

```java
@Service
public class ProdutoService {
    public void atualizarPreco(Long id, BigDecimal novoPreco) {
        Assert.notNull(id, "ID não pode ser nulo");
        Assert.notNull(novoPreco, "Preço não pode ser nulo");
        Assert.isTrue(novoPreco.compareTo(BigDecimal.ZERO) > 0, 
                      "Preço deve ser positivo");
        // ...
    }
}
```

### **Bean Validation** - Para DTOs/Entidades

```java
public class ProdutoDTO {
    @NotNull(message = "ID não pode ser nulo")
    private Long id;
    
    @NotNull(message = "Preço não pode ser nulo")
    @Positive(message = "Preço deve ser positivo")
    private BigDecimal preco;
}

@RestController
public class ProdutoController {
    public ResponseEntity<?> atualizar(@Valid @RequestBody ProdutoDTO dto) {
        // validações já foram feitas pelo @Valid
    }
}
```

---

## 📊 Resumo dos Métodos

| Método | Validação | Exception |
|--------|-----------|-----------|
| `notNull` | Objeto não nulo | `IllegalArgumentException` |
| `isNull` | Objeto é nulo | `IllegalArgumentException` |
| `hasText` | String com conteúdo | `IllegalArgumentException` |
| `hasLength` | String com comprimento | `IllegalArgumentException` |
| `notEmpty` | Coleção/Array não vazio | `IllegalArgumentException` |
| `noNullElements` | Array sem elementos null | `IllegalArgumentException` |
| `isTrue` | Condição verdadeira | `IllegalArgumentException` |
| `state` | Estado válido | `IllegalStateException` |
| `isInstanceOf` | Tipo correto | `IllegalArgumentException` |
| `isAssignable` | Compatibilidade de classe | `IllegalArgumentException` |

---

## 🎓 Vantagens

1. **Código mais limpo** - Reduz boilerplate
2. **Legibilidade** - Intenção clara
3. **Consistência** - Padrão único de validação
4. **Fail-fast** - Falha rápida em caso de erro
5. **Manutenibilidade** - Fácil de entender e modificar

---

## 📚 Referências

- [Spring Framework Documentation - Assert](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/util/Assert.html)
- Package: `org.springframework.util.Assert`
- Disponível desde Spring 1.1.2

---

## 💭 Conclusão

A classe `Assert` do Spring é uma ferramenta poderosa para **abstrair o lançamento de exceptions** e tornar o código mais limpo e expressivo. Use-a para validações simples e diretas, combinando com Bean Validation quando apropriado para criar aplicações robustas e bem validadas.