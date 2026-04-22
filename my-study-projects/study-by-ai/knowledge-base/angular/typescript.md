# 🟧 TypeScript Complete Guide

## ✨ Summary
TypeScript is a strongly typed superset of JavaScript that compiles to plain JavaScript. It adds static typing, interfaces, generics, and advanced tooling to help you write robust, maintainable code.

---

## 🚀 Why Use TypeScript?
- **Type Safety:** Catch errors at compile time
- **Better Tooling:** Autocomplete, refactoring, and navigation
- **Scalability:** Easier to manage large codebases
- **Modern JavaScript:** Supports latest JS features

---

## 🏗️ Getting Started
1. **Install TypeScript:**
   ```powershell
   npm install -g typescript
   ```
2. **Compile a File:**
   ```powershell
   tsc hello.ts
   ```
3. **Initialize a Project:**
   ```powershell
   tsc --init
   ```

---

## 📝 Basic Types
- `string`, `number`, `boolean`, `any`, `void`, `null`, `undefined`, `never`, `unknown`
- Arrays: `number[]` or `Array<number>`
- Tuples: `[string, number]`
- Enums: `enum Color { Red, Green, Blue }`

---

## 🧩 Interfaces & Types
```typescript
interface User {
  id: number;
  name: string;
  isActive: boolean;
}

type Point = { x: number; y: number };
```

---

## 🏷️ Classes
```typescript
class Animal {
  constructor(public name: string) {}
  move(distance: number): void {
    console.log(`${this.name} moved ${distance}m.`);
  }
}
```

---

## 🧬 Generics
```typescript
function identity<T>(arg: T): T {
  return arg;
}
```

---

## 🧙‍♂️ Advanced Features
- **Union & Intersection Types:** `string | number`, `A & B`
- **Type Guards:** `typeof`, `instanceof`
- **Type Assertions:** `as` keyword
- **Utility Types:** `Partial<T>`, `Pick<T, K>`, `Record<K, T>`, `Omit<T, K>`
- **Decorators:** `@Component`, `@Injectable` (Angular)

---

## 🛠️ Tooling & Ecosystem
- **tsconfig.json:** Project configuration
- **DefinitelyTyped:** Community type definitions (`@types/...`)
- **Integration:** Works with React, Angular, Node.js, etc.

---

## 📚 Resources
- [TypeScript Official Docs](https://www.typescriptlang.org/docs/)
- [TypeScript Deep Dive](https://basarat.gitbook.io/typescript/)
- [TypeScript Playground](https://www.typescriptlang.org/play)

---

## 🏆 Best Practices
- Use strict mode (`strict: true` in tsconfig)
- Prefer interfaces for public APIs
- Avoid `any` when possible
- Use type inference
- Keep types simple and composable

---

## 🧪 Example: Putting It All Together
```typescript
interface Product {
  id: number;
  name: string;
  price: number;
}

function printProduct(product: Product): void {
  console.log(`${product.name}: $${product.price}`);
}

const book: Product = { id: 1, name: 'TypeScript Guide', price: 29.99 };
printProduct(book);
```

---

> "TypeScript makes JavaScript scale!" 🟧✨

[🔙 Back ](../README.md)
