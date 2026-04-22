# 🔷 Basic Syntax and Data Types in Go | Sintaxe Básica e Tipos de Dados em Go

This document details the basic syntax and fundamental data types of the Go language. | Este documento detalha a sintaxe básica e os tipos de dados fundamentais da linguagem Go.

## 📋 Summary | Sumário

- [Basic Structure of a Go Program | Estrutura básica de um programa Go](#estrutura-basica-de-um-programa-go--basic-structure-of-a-go-program)
- [Go Installation | Instalação do Go](#instalacao-do-go--go-installation)
- [Compiling and Running Go Programs | Compilando e executando programas Go](#compilando-e-executando-programas-go--compiling-and-running-go-programs)
- [Variable Declaration | Declaração de variáveis](#declaracao-de-variaveis--variable-declaration)
- [Basic Types | Tipos básicos](#tipos-basicos--basic-types)
- [Zero Values | Valores zero](#valores-zero--zero-values)
- [Type Conversion | Conversão de tipos](#conversao-de-tipos--type-conversion)
- [Constants | Constantes](#constantes--constants)
- [Operators | Operadores](#operadores--operators)
- [Practical Examples | Exemplos práticos](#exemplos-praticos--practical-examples)
- [Comparison with Java | Comparação com Java](#comparacao-com-java--comparison-with-java)

## 🏗️ Basic Structure of a Go Program | Estrutura básica de um programa Go

Every Go program starts with a package declaration and imports, followed by a `main()` entry point if it's an executable. | Todo programa Go começa com uma declaração de pacote e importações, seguido de um ponto de entrada `main()` se for um executável.

```go
// Package declaration | Declaração do pacote
package main

// Imports | Importações
import (
    "fmt"
    "time"
)

// Main function | Função principal
func main() {
    fmt.Println("Hello, Go!")
}
```

### 🔄 Comparison with Java | Comparação com Java

In Java, the basic structure is similar, but with some important differences: | Em Java, a estrutura básica é similar, mas com algumas diferenças importantes:

```java
// In Java, the file name must match the public class name | Em Java, o nome do arquivo deve corresponder ao nome da classe pública

// Import statements in Java | Importações em Java
import java.util.Date;
import java.util.Scanner;

// A class instead of a package is the main container | Uma classe em vez de um pacote é o contêiner principal
public class Main {
    // Main method with command line arguments | Método principal com argumentos de linha de comando
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

**Key differences | Diferenças principais:**
- Java is strictly object-oriented, everything is inside classes | Java é estritamente orientado a objetos, tudo está dentro de classes
- Go is more procedural with OO features | Go é mais procedural com recursos de orientação a objetos
- Java uses `System.out.println()` while Go uses `fmt.Println()` | Java usa `System.out.println()` enquanto Go usa `fmt.Println()`
- In Java, the file name must match the public class; in Go this is not necessary | Em Java, o nome do arquivo deve corresponder à classe pública; em Go isso não é necessário
- In Java, the package declaration is optional; in Go it is mandatory | Em Java, a declaração de pacote é opcional; em Go é obrigatória

## 🔧 Go Installation | Instalação do Go

Before starting to program in Go, you need to install the compiler and tools. | Antes de começar a programar em Go, você precisa instalar o compilador e as ferramentas.

### Windows

1. **Using the official installer | Usando o instalador oficial**:
   - Access [golang.org/dl](https://golang.org/dl/) and download the MSI installer for Windows. | Acesse [golang.org/dl](https://golang.org/dl/) e baixe o instalador MSI para Windows.
   - Run the installer and follow the on-screen instructions. | Execute o instalador e siga as instruções na tela.
   - The installer will automatically configure the PATH environment variable. | O instalador configurará automaticamente a variável de ambiente PATH.

2. **Using Chocolatey | Usando Chocolatey**:
   - Open PowerShell as administrator.
   - Run the following command:
   ```powershell
   choco install golang
   ```

3. **Using Scoop | Usando Scoop**:
   - Open PowerShell.
   - Run the following command:
   ```powershell
   scoop install go
   ```

### Linux

1. **Ubuntu/Debian**:
   - Open terminal.
   - Run the following commands:
   ```bash
   sudo apt update
   sudo apt install golang-go
   ```

2. **Fedora**:
   - Open terminal.
   - Run the following command:
   ```bash
   sudo dnf install golang
   ```

3. **Arch Linux**:
   - Open terminal.
   - Run the following command:
   ```bash
   sudo pacman -S go
   ```

4. **Using the official binary (any distribution) | Usando o arquivo binário oficial (qualquer distribuição)**:
   - Download and install the binary:
   ```bash
   wget https://golang.org/dl/go1.21.0.linux-amd64.tar.gz
   sudo tar -C /usr/local -xzf go1.21.0.linux-amd64.tar.gz
   echo 'export PATH=$PATH:/usr/local/go/bin' >> ~/.profile
   source ~/.profile
   ```

### Verifying installation | Verificando a instalação

After installation, verify that Go was installed correctly: | Após a instalação, verifique se o Go foi instalado corretamente:

```bash
go version
```

You should see something like: | Você deve ver algo como:
```
go version go1.21.0 windows/amd64
```

## 🚀 Compiling and Running Go Programs | Compilando e executando programas Go

### Using `go run` (for development) | Usando `go run` (para desenvolvimento)

The `go run` command compiles and runs the program in a single step, ideal for development: | O comando `go run` compila e executa o programa em um único passo, ideal para desenvolvimento:

```bash
go run arquivo.go
```

For multiple files: | Para múltiplos arquivos:
```bash
go run arquivo1.go arquivo2.go
```

Or the entire package: | Ou todo o pacote:
```bash
go run .
```

### Using `go build` (for production) | Usando `go build` (para produção)

To compile an executable: | Para compilar um executável:

```bash
go build arquivo.go
```

This will generate an executable with the same name as the file (on Windows, with a `.exe` extension): | Isso gerará um executável com o mesmo nome do arquivo (no Windows, com extensão `.exe`):

```bash
# Windows
.\arquivo.exe

# Linux/macOS
./arquivo
```

To specify the output executable name: | Para especificar o nome do executável de saída:
```bash
go build -o meuprograma arquivo.go
```

### Compiling for different systems | Compilando para diferentes sistemas

Go supports cross-compilation easily using environment variables: | Go suporta compilação cruzada facilmente usando variáveis de ambiente:

**Windows to Linux | Windows para Linux**:
```powershell
set GOOS=linux
set GOARCH=amd64
go build -o programa-linux arquivo.go
```

**Linux to Windows | Linux para Windows**:
```bash
GOOS=windows GOARCH=amd64 go build -o programa.exe arquivo.go
```

**Common values for GOOS | Valores comuns para GOOS**:
- windows | windows
- linux | linux
- darwin (macOS) | darwin (macOS)
- freebsd | freebsd

**Common values for GOARCH | Valores comuns para GOARCH**:
- amd64 (x86-64) | amd64 (x86-64)
- 386 (x86-32) | 386 (x86-32)
- arm64 | arm64
- arm | arm

### Compiling with optimizations | Compilando com otimizações

For production, you can optimize the binary: | Para produção, você pode otimizar o binário:

```bash
go build -ldflags="-s -w" arquivo.go
```

This removes debug information and symbol tables, reducing the executable size. | Isso remove informações de debug e tabela de símbolos, reduzindo o tamanho do executável.

### 🔄 Comparison with Java | Comparação com Java

The compilation and execution process in Java differs from Go: | O processo de compilação e execução em Java é diferente do Go:

**Java:**
```bash
# Compile (generates .class bytecode) | Compilar (gera bytecode .class)
javac MeuPrograma.java

# Run on the JVM | Executar na JVM
java MeuPrograma
```

**Key differences | Diferenças principais:**
- Java compiles to bytecode (.class) that runs on the JVM; Go compiles to native code | Java compila para bytecode (.class) que roda na JVM; Go compila para código nativo
- Java needs the JVM to run; Go generates standalone executables | Java precisa da JVM para rodar; Go gera executáveis independentes
- Java doesn't have a simple equivalent to `go run`; it needs to compile and then run separately | Java não tem um equivalente simples ao `go run`; precisa compilar e depois executar separadamente
- Java doesn't support cross-compilation as easily as Go; it depends on the target system's JVM | Java não suporta compilação cruzada tão facilmente quanto Go; depende da JVM do sistema alvo

## 📝 Variable Declaration | Declaração de variáveis

Go offers **several ways** to declare variables. | Go oferece **várias formas** de declarar variáveis.

```go
// Declaration with explicit type | Declaração com tipo explícito
var nome string = "Go"

// Declaration with type inference | Declaração com inferência de tipo
var idade = 13

// Short declaration (only inside functions) | Declaração curta (apenas dentro de funções)
linguagem := "Go"  // ⭐ Most common form in functions | Forma mais comum em funções

// Multiple declarations | Múltiplas declarações
var (
    ativo  bool = true
    versao int  = 2
)

// Multiple short declarations | Múltiplas declarações curtas
x, y := 10, 20
```

### 🔄 Comparison with Java | Comparação com Java

In Java, variable declaration is more restrictive: | Em Java, a declaração de variáveis é mais restrita:

```java
// Declaration with explicit type (mandatory until Java 10) | Declaração com tipo explícito (obrigatório até o Java 10)
String nome = "Java";

// Type inference with 'var' (from Java 10 onwards) | Inferência de tipo com 'var' (a partir do Java 10)
var idade = 26;

// Multiple declarations (each one separately) | Múltiplas declarações (cada uma separadamente)
boolean ativo = true;
int versao = 2;

// Multiple initializations in one line (but with single type) | Múltiplas inicializações em uma linha (mas com um único tipo)
int x = 10, y = 20;
```

**Key differences | Diferenças principais:**
- Java doesn't have the `:=` operator for short declaration as in Go | Java não tem o operador `:=` para declaração curta como em Go
- Java only introduced limited type inference with `var` in Java 10 | Java só introduziu inferência de tipo limitada com `var` no Java 10
- Go allows multiple assignments with different types in one line; Java doesn't | Go permite múltiplas atribuições com tipos diferentes em uma linha; Java não permite
- Java doesn't have the concept of declaration blocks with `var (...)` as in Go | Java não tem o conceito de blocos de declaração com `var (...)` como em Go

## 🧩 Basic Types | Tipos básicos

Go has the following basic types: | Go possui os seguintes tipos básicos:

### 🔢 Integers | Inteiros

```go
// Signed types | Tipos com sinal
var i int     // Platform dependent (32 or 64 bits) | Depende da plataforma (32 ou 64 bits)
var i8 int8   // -128 to 127 | -128 a 127
var i16 int16 // -32768 to 32767 | -32768 a 32767
var i32 int32 // -2147483648 to 2147483647 | -2147483648 a 2147483647
var i64 int64 // -9223372036854775808 to 9223372036854775807 | -9223372036854775808 a 9223372036854775807

// Unsigned types | Tipos sem sinal
var ui uint     // Platform dependent | Depende da plataforma
var ui8 uint8   // 0 to 255 | 0 a 255
var ui16 uint16 // 0 a 65535 | 0 a 65535
var ui32 uint32 // 0 a 4294967295 | 0 a 4294967295
var ui64 uint64 // 0 a 18446744073709551615 | 0 a 18446744073709551615

// Aliases
var b byte = 255  // Alias for uint8 | Alias para uint8
var r rune = 'a'  // Alias for int32, represents a Unicode code point | Alias para int32, representa um ponto de código Unicode
```

### 📊 Floating point | Ponto flutuante

```go
var f32 float32 // IEEE-754 32-bit
var f64 float64 // IEEE-754 64-bit (⭐ recommended | recomendado)
```

### 🧮 Complex numbers | Números complexos

```go
var c64 complex64   // Complex numbers with float32 real and imaginary parts | Números complexos com partes real e imaginária float32
var c128 complex128 // Complex numbers with float64 real and imaginary parts | Números complexos com partes real e imaginária float64

// Examples | Exemplos
c := 1 + 2i
```

### ✅ Booleans | Booleanos

```go
var verdadeiro bool = true
var falso bool = false
```

### 📝 Strings

```go
var texto string = "Hello, Go!"
```

### 🔧 Special types | Tipos especiais

```go
var ponteiro *int  // Pointer to an integer | Ponteiro para um inteiro
var array [5]int   // Array of 5 integers | Array de 5 inteiros
var slice []int    // Slice of integers | Slice de inteiros
var mapa map[string]int // Map from string to integer | Mapa de string para inteiro
var canal chan int // Communication channel | Canal de comunicação
```

### 🔄 Comparison with Java | Comparação com Java

Java and Go have similar types, but with some important differences: | Java e Go têm tipos similares, mas com algumas diferenças importantes:

```java
// Primitive types in Java | Tipos primitivos em Java
byte b = 127;         // 8-bit
short s = 32767;      // 16-bit
int i = 2147483647;   // 32-bit
long l = 9223372036854775807L; // 64-bit (note the L suffix) | 64-bit (note o sufixo L)

float f = 3.14f;      // 32-bit (note the f suffix) | 32-bit (note o sufixo f)
double d = 3.14159;   // 64-bit (default for decimals) | 64-bit (padrão para decimais)

char c = 'a';         // 16-bit unicode
boolean bool = true;  // true/false

// Wrappers (classes for primitive types) | Wrappers (classes para tipos primitivos)
Integer intObj = 42;
Double doubleObj = 3.14;

// String (is a class in Java, not a primitive type) | String (é uma classe em Java, não um tipo primitivo)
String texto = "Hello, Java!";
```

**Key differences | Diferenças principais:**
- Java has primitive types AND their equivalent wrapper objects; Go doesn't make this distinction | Java tem tipos primitivos E seus objetos wrapper equivalentes; Go não faz essa distinção
- Java uses `char` for a single character; Go uses `rune` (which is an alias for `int32`) | Java usa `char` para um único caractere; Go usa `rune` (que é um alias para `int32`)
- In Go, `string` is a basic type; in Java, `String` is a class | Em Go, `string` é um tipo básico; em Java, `String` é uma classe
- Java doesn't have built-in types for complex numbers like Go | Java não tem tipos embutidos para números complexos como Go
- The size of integer types in Java is fixed; in Go, `int` and `uint` depend on the platform | O tamanho dos tipos inteiros em Java é fixo; em Go, `int` e `uint` dependem da plataforma
- Java has autoboxing/unboxing between primitives and wrappers; Go doesn't have this concept | Java tem autoboxing/unboxing entre primitivos e wrappers; Go não tem esse conceito

## 0️⃣ Zero Values | Valores zero

Variables declared without an initial value are assigned their "zero values": | Variáveis declaradas sem um valor inicial são atribuídas com seus "valores zero":

- Numeric: `0` | Numéricos: `0`
- Boolean: `false` | Booleanos: `false`
- Strings: `""` (empty string | string vazia)
- Pointers, functions, interfaces, slices, channels, maps: `nil`

```go
var i int     // i = 0
var f float64 // f = 0.0
var b bool    // b = false
var s string  // s = ""
var p *int    // p = nil
```

> ⚠️ **Important**: Go doesn't have `null`, it uses `nil` for reference values | Go não possui `null`, usa-se `nil` para valores de referência

### 🔄 Comparison with Java | Comparação com Java

Java and Go handle default values differently: | Java e Go tratam os valores padrão de forma diferente:

**Java:**
- Primitive types in class fields: `0` for numerics, `false` for boolean, `\u0000` for char | Tipos primitivos em campos de classe: `0` para numéricos, `false` para booleanos, `\u0000` para char
- Primitive types in local variables: **uninitialized, compilation error if used without initialization** | Tipos primitivos em variáveis locais: **não inicializados, erro de compilação se usados sem inicialização**
- Reference types (objects): `null` | Tipos de referência (objetos): `null`

```java
class Exemplo {
    // Class fields - automatically initialized | Campos de classe - inicializados automaticamente
    int i;           // i = 0
    float f;         // f = 0.0f
    boolean b;       // b = false
    String s;        // s = null
    
    void metodo() {
        // Local variables - must be initialized before use | Variáveis locais - devem ser inicializadas antes do uso
        int local;
        // System.out.println(local); // COMPILATION ERROR! | ERRO DE COMPILAÇÃO!
        
        // Correct: | Correto:
        int inicializada = 0;
        System.out.println(inicializada);
    }
}
```

**Key differences | Diferenças principais:**
- Go initializes all variables with zero values; Java only initializes class fields | Go inicializa todas as variáveis com valores zero; Java só inicializa campos de classe
- Java uses `null` for uninitialized objects; Go uses `nil` only for reference types | Java usa `null` para objetos não inicializados; Go usa `nil` apenas para tipos de referência
- Java requires explicit initialization of local variables; Go doesn't | Java requer inicialização explícita de variáveis locais; Go não
- The concept of `zero value` is consistent in Go; in Java it depends on the context (local vs. field) | O conceito de `valor zero` é consistente em Go; em Java depende do contexto (local vs. campo)

## 🔄 Type Conversion | Conversão de tipos

Go **doesn't do implicit type conversion**, all conversions must be explicit. | Go **não faz conversão implícita** de tipos, todas as conversões devem ser explícitas.

```go
var i int = 42
var f float64 = float64(i)  // ⭐ Explicit conversion required | Conversão explícita obrigatória
var u uint = uint(f)

// String <-> int conversion | Conversão de string para int e vice-versa
var s string = "100"
i, err := strconv.Atoi(s) // string to int | string para int
s = strconv.Itoa(i)       // int to string | int para string

// String <-> float conversion | Conversão de string para float e vice-versa
f, err := strconv.ParseFloat(s, 64) // string to float | string para float
s = strconv.FormatFloat(f, 'f', 2, 64) // float to string | float para string
```

### 🔄 Comparison with Java | Comparação com Java

Java allows implicit conversions in some cases, unlike Go: | Java permite conversões implícitas em alguns casos, diferente de Go:

```java
// Implicit conversions (widening conversions) | Conversões implícitas (conversões de alargamento)
int i = 42;
long l = i;      // Implicit: int -> long | Implícito: int -> long
float f = l;     // Implicit: long -> float | Implícito: long -> float
double d = f;    // Implicit: float -> double | Implícito: float -> double

// Explicit conversions (narrowing conversions) | Conversões explícitas (conversões de estreitamento)
double d2 = 3.14159;
float f2 = (float) d2;  // Explicit: double -> float | Explícito: double -> float
long l2 = (long) f2;    // Explicit: float -> long | Explícito: float -> long
int i2 = (int) l2;      // Explicit: long -> int | Explícito: long -> int

// String <-> number conversions | Conversões de string para número e vice-versa
String s = "100";
int i3 = Integer.parseInt(s);  // String to int | String para int
String s2 = Integer.toString(i3);  // int to String | int para String

double d3 = Double.parseDouble(s);  // String to double | String para double
String s3 = Double.toString(d3);     // double to String | double para String
```

**Key differences | Diferenças principais:**
- Java allows implicit conversions when there's no data loss (widening); Go requires explicit conversion always | Java permite conversões implícitas quando não há perda de dados (alargamento); Go requer conversão explícita sempre
- Java uses static methods in wrapper classes for String/number conversions; Go uses functions in the `strconv` package | Java usa métodos estáticos em classes wrapper para conversões de String/número; Go usa funções no pacote `strconv`
- In Java, casting can silently cause data loss; Go is more explicit about what's happening | Em Java, o casting pode causar perda de dados silenciosamente; Go é mais explícito sobre o que está acontecendo
- Java has the cast operator `(type)`; Go uses the function syntax `type(value)` | Java tem o operador de cast `(type)`; Go usa a sintaxe de função `type(value)`

## 🔒 Constants | Constantes

Constants are declared with the `const` keyword and can be character, string, boolean, or numeric values. | Constantes são declaradas com a palavra-chave `const` e podem ser caracteres, strings, booleanos ou valores numéricos.

```go
const Pi = 3.14159
const (
    StatusOK       = 200
    StatusNotFound = 404
)

// iota is useful for creating incremental constants | iota é útil para criar constantes incrementais
const (
    Domingo = iota // 0
    Segunda        // 1
    Terça          // 2
    Quarta         // 3
    Quinta         // 4
    Sexta          // 5
    Sábado         // 6
)
```

### 🔄 Comparison with Java | Comparação com Java

In Java, constants are declared using `final`: | Em Java, constantes são declaradas usando `final`:

```java
// Constants in Java | Constantes em Java
final double PI = 3.14159;
final int STATUS_OK = 200;
final String APP_NAME = "MyApp";

// Constants in classes/interfaces (common for shared values) | Constantes em classes/interfaces (comum para valores compartilhados)
public class HttpStatus {
    public static final int OK = 200;
    public static final int NOT_FOUND = 404;
    public static final int SERVER_ERROR = 500;
}

// Java uses enums for the equivalent of incremental constants with iota | Java usa enums para o equivalente de constantes incrementais com iota
public enum DiaSemana {
    DOMINGO,    // 0
    SEGUNDA,    // 1
    TERCA,      // 2
    QUARTA,     // 3
    QUINTA,     // 4
    SEXTA,      // 5
    SABADO      // 6
}
```

**Key differences | Diferenças principais:**
- Java uses the `final` keyword for constants; Go uses `const` | Java usa a palavra-chave `final` para constantes; Go usa `const`
- Java requires explicit type or inference for constants; Go allows untyped constants | Java requer tipo explícito ou inferência para constantes; Go permite constantes sem tipo
- Go has `iota` for incremental sequences; Java uses `enum` for similar concepts | Go tem `iota` para sequências incrementais; Java usa `enum` para conceitos similares
- In Java, global constants are usually static (`static final`); Go doesn't have this concept | Em Java, constantes globais são geralmente estáticas (`static final`); Go não tem esse conceito
- Constants in Java are often grouped in classes or interfaces; in Go they are grouped in `const` blocks | Constantes em Java são frequentemente agrupadas em classes ou interfaces; em Go são agrupadas em blocos `const`

## 🔣 Operators | Operadores

### ➕ Arithmetic | Aritméticos

```go
a + b   // Addition | Adição
a - b   // Subtraction | Subtração 
a * b   // Multiplication | Multiplicação
a / b   // Division | Divisão
a % b   // Remainder | Resto
a & b   // Bitwise AND | AND bit a bit
a | b   // Bitwise OR | OR bit a bit
a ^ b   // Bitwise XOR | XOR bit a bit
a &^ b  // Bit clear (AND NOT) | AND NOT bit a bit
a << b  // Left shift | Shift à esquerda
a >> b  // Right shift | Shift à direita
```

### 🔍 Comparison | Comparação

```go
a == b  // Equal | Igual
a != b  // Not equal | Diferente
a < b   // Less | Menor que
a <= b  // Less or equal | Menor ou igual
a > b   // Greater | Maior que
a >= b  // Greater or equal | Maior ou igual
```

### 🧩 Logical | Lógicos

```go
a && b  // Logical AND | AND lógico
a || b  // Logical OR | OR lógico
!a      // Logical NOT | NOT lógico
```

### 🔄 Assignment | Atribuição

```go
a = b   // Assignment | Atribuição
a += b  // Addition assignment | Atribuição de adição
a -= b  // Subtraction assignment | Atribuição de subtração
a *= b  // Multiplication assignment | Atribuição de multiplicação
a /= b  // Division assignment | Atribuição de divisão
a %= b  // Remainder assignment | Atribuição de resto
a &= b  // Bitwise AND assignment | Atribuição de AND bit a bit
a |= b  // Bitwise OR assignment | Atribuição de OR bit a bit
a ^= b  // Bitwise XOR assignment | Atribuição de XOR bit a bit
a &^= b // Bit clear (AND NOT) assignment | Atribuição de AND NOT bit a bit
a <<= b // Left shift assignment | Atribuição de shift à esquerda
a >>= b // Right shift assignment | Atribuição de shift à direita
```

### 🔄 Comparison with Java | Comparação com Java

Java and Go have similar operators, but with some differences: | Java e Go têm operadores similares, mas com algumas diferenças:

```java
// Arithmetic operators in Java | Operadores aritméticos em Java
a + b;  // Addition | Adição
a - b;  // Subtraction | Subtração
a * b;  // Multiplication | Multiplicação
a / b;  // Division | Divisão
a % b;  // Remainder | Resto

// Comparison operators in Java | Operadores de comparação em Java
a == b;  // Equal | Igual
a != b;  // Not equal | Diferente
a < b;   // Less | Menor que
a <= b;  // Less or equal | Menor ou igual
a > b;   // Greater | Maior que
a >= b;  // Greater or equal | Maior ou igual

// Logical operators in Java | Operadores lógicos em Java
a && b;  // Logical AND | AND lógico
a || b;  // Logical OR | OR lógico
!a;      // Logical NOT | NOT lógico

// Assignment operators in Java | Operadores de atribuição em Java
a = b;   // Assignment | Atribuição
a += b;  // Addition assignment | Atribuição de adição
a -= b;  // Subtraction assignment | Atribuição de subtração
a *= b;  // Multiplication assignment | Atribuição de multiplicação
a /= b;  // Division assignment | Atribuição de divisão
a %= b;  // Remainder assignment | Atribuição de resto

// Bitwise operators in Java | Operadores bit a bit em Java
a & b;   // Bitwise AND | AND bit a bit
a | b;   // Bitwise OR | OR bit a bit
a ^ b;   // Bitwise XOR | XOR bit a bit
a << b;  // Left shift | Shift à esquerda
a >> b;  // Right shift | Shift à direita
a >>> b; // Unsigned right shift | Shift à direita sem sinal
```

**Key differences | Diferenças principais:**
- Java has the unsigned right shift operator `>>>`; Go doesn't | Java tem o operador de shift à direita sem sinal `>>>`; Go não tem
- Go has the bit clear operator `&^`; Java doesn't | Go tem o operador de limpeza de bits `&^`; Java não tem
- Java has more assignment operators for bitwise operations; Go has fewer | Java tem mais operadores de atribuição para operações bit a bit; Go tem menos
- The syntax for operators is mostly the same in both languages | A sintaxe para operadores é basicamente a mesma em ambas as linguagens

## 📚 Practical Examples | Exemplos práticos

### Example 1: Simple Calculator | Exemplo 1: Calculadora Simples

```go
package main

import "fmt"

func main() {
    var a, b int
    fmt.Print("Enter two numbers: | Digite dois números: ")
    fmt.Scan(&a, &b)
    
    fmt.Printf("Sum: %d\n", a+b)       // Adição
    fmt.Printf("Difference: %d\n", a-b) // Subtração
    fmt.Printf("Product: %d\n", a*b)    // Multiplicação
    fmt.Printf("Quotient: %d\n", a/b)   // Divisão
    fmt.Printf("Remainder: %d\n", a%b)  // Resto
}
```

### Example 2: FizzBuzz | Exemplo 2: FizzBuzz

```go
package main

import "fmt"

func main() {
    for i := 1; i <= 100; i++ {
        if i%3 == 0 && i%5 == 0 {
            fmt.Println("FizzBuzz")
        } else if i%3 == 0 {
            fmt.Println("Fizz")
        } else if i%5 == 0 {
            fmt.Println("Buzz")
        } else {
            fmt.Println(i)
        }
    }
}
```

### Example 3: Factorial | Exemplo 3: Fatorial

```go
package main

import "fmt"

func factorial(n int) int {
    if n == 0 {
        return 1
    }
    return n * factorial(n-1)
}

func main() {
    var n int
    fmt.Print("Enter a number: | Digite um número: ")
    fmt.Scan(&n)
    fmt.Printf("Factorial of %d is %d\n", n, factorial(n))
}
```

### Example 4: Fibonacci | Exemplo 4: Fibonacci

```go
package main

import "fmt"

func fibonacci(n int) int {
    if n <= 1 {
        return n
    }
    return fibonacci(n-1) + fibonacci(n-2)
}

func main() {
    var n int
    fmt.Print("Enter a number: | Digite um número: ")
    fmt.Scan(&n)
    fmt.Printf("Fibonacci of %d is %d\n", n, fibonacci(n))
}
```

### Example 5: Prime Numbers | Exemplo 5: Números Primos

```go
package main

import "fmt"

func isPrime(n int) bool {
    if n <= 1 {
        return false
    }
    for i := 2; i*i <= n; i++ {
        if n%i == 0 {
            return false
        }
    }
    return true
}

func main() {
    var n int
    fmt.Print("Enter a number: | Digite um número: ")
    fmt.Scan(&n)
    if isPrime(n) {
        fmt.Printf("%d is a prime number\n", n)
    } else {
        fmt.Printf("%d is not a prime number\n", n)
    }
}
```

## 🔄 Comparison with Java | Comparação com Java

### Example 1: Simple Calculator | Exemplo 1: Calculadora Simples

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: | Digite dois números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.printf("Sum: %d\n", a + b);       // Adição
        System.out.printf("Difference: %d\n", a - b); // Subtração
        System.out.printf("Product: %d\n", a * b);    // Multiplicação
        System.out.printf("Quotient: %d\n", a / b);   // Divisão
        System.out.printf("Remainder: %d\n", a % b);  // Resto
    }
}
```

### Example 2: FizzBuzz | Exemplo 2: FizzBuzz

```java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

### Example 3: Factorial | Exemplo 3: Fatorial

```java
import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: | Digite um número: ");
        int n = scanner.nextInt();
        System.out.printf("Factorial of %d is %d\n", n, factorial(n));
    }
}
```

### Example 4: Fibonacci | Exemplo 4: Fibonacci

```java
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: | Digite um número: ");
        int n = scanner.nextInt();
        System.out.printf("Fibonacci of %d is %d\n", n, fibonacci(n));
    }
}
```

### Example 5: Prime Numbers | Exemplo 5: Números Primos

```java
import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: | Digite um número: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.printf("%d is a prime number\n", n);
        } else {
            System.out.printf("%d is not a prime number\n", n);
        }
    }
}
```