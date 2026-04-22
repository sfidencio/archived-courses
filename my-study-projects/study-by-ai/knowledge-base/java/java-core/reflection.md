# 🔍 Reflection

Reflection in Java allows **inspection** and **manipulation** of classes, methods, and fields at runtime.  
It is a powerful feature but should be used with caution due to potential performance and security implications.

> ⚠️ **Note:** Reflection can bypass normal access control checks, so it should be used responsibly.

---

## 📚 Table of Contents

- [🌟 What is Reflection?](#-what-is-reflection)
- [💡 Use Cases](#-use-cases)
- [⚖️ Advantages & Disadvantages](#-advantages--disadvantages)
- [🛠️ Examples](#-examples)
- [🚨 Best Practices](#-best-practices)

---

## 🌟 What is Reflection?

Reflection is the ability of a program to **examine** and **modify** its structure and behavior at runtime.

> 💡 **Example:** Accessing private fields, invoking methods dynamically, or analyzing class metadata.

---

## 💡 Use Cases

- 🛠️ **Framework Development:** Used in libraries like Spring and Hibernate.
- 🔄 **Dependency Injection:** Dynamically injecting dependencies at runtime.
- 🧪 **Testing and Debugging:** Mocking objects or accessing private members for testing.
- 🧩 **Dynamic Proxies:** Creating dynamic implementations of interfaces.

---

## ⚖️ Advantages & Disadvantages

### ✅ Advantages

- Enables **dynamic behavior**.
- Useful for **frameworks** and **libraries**.
- Allows **runtime inspection** of objects.

### ❌ Disadvantages

- **Performance Overhead:** Reflection is slower than direct code execution.
- **Security Risks:** Can bypass access control checks.
- **Complexity:** Code using reflection can be harder to understand and maintain.

---

## 🛠️ Examples

### 🔑 Accessing Private Fields

```java
// Example: Accessing private fields using Reflection
import java.lang.reflect.Field;

class Example {
    private String secret = "Reflection in Java";

    public static void main(String[] args) throws Exception {
        Example example = new Example();
        Field field = Example.class.getDeclaredField("secret");
        field.setAccessible(true); // Bypass access control
        System.out.println("Secret: " + field.get(example));
    }
}
```

> ⚠️ **Warning:** Use `setAccessible(true)` with caution as it bypasses Java's access control.

---

### 🧩 Invoking Methods Dynamically

```java
// Example: Invoking methods dynamically
import java.lang.reflect.Method;

class Example {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) throws Exception {
        Example example = new Example();
        Method method = Example.class.getMethod("greet", String.class);
        method.invoke(example, "World"); // Dynamically invoke the method
    }
}
```

> 💡 **Tip:** Dynamic method invocation is useful in frameworks like Spring for dependency injection.

---

### 📋 Listing Class Metadata

```java
// Example: Listing class methods
import java.lang.reflect.Method;

class Example {
    public void method1() {}
    public void method2() {}

    public static void main(String[] args) {
        Method[] methods = Example.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
```

> 🔍 **Insight:** Reflection can be used to analyze class structures for debugging or documentation purposes.

---

## 🚨 Best Practices

- Use reflection **sparingly** to avoid performance and security issues.
- Always validate inputs when using reflection to prevent **security vulnerabilities**.
- Prefer alternatives like **interfaces** or **design patterns** when possible.

---

> 📝 **Summary:** Reflection is a powerful tool in Java that enables dynamic behavior but comes with trade-offs in performance and security. Use it wisely!

[⬅️ Back](../README.md)