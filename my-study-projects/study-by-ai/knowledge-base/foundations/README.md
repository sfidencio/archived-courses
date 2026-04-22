## 🏁 Foundations: Table of Contents

1. 🔢 Binary Logic & Digital Circuits
   - 1.1. Number Systems (Binary, Hexadecimal, Decimal)
   - 1.2. Logic Gates (AND, OR, NOT, XOR, NAND, NOR)
   - 1.3. Combinational & Sequential Circuits
   - 1.4. Boolean Algebra & Simplification
   - 1.5. Flip-Flops, Registers, Counters
   - 1.6. Practical Applications
2. 💾 Computer Architecture
   - 2.1. CPU (ALU, Control Unit, Registers)
   - 2.2. Memory (RAM, ROM, Cache, Virtual Memory)
   - 2.3. I/O Systems & Buses
   - 2.4. Instruction Cycle & Pipelining
   - 2.5. Von Neumann vs. Harvard Architecture
   - 2.6. Parallelism & Multi-core
3. 🧮 Number Systems
   - 3.1. Binary, Octal, Decimal, Hexadecimal
   - 3.2. Conversions & Arithmetic
   - 3.3. Floating Point Representation
4. 🖥️ Operating Systems
   - 4.1. Processes & Threads
   - 4.2. Scheduling & Synchronization
   - 4.3. Memory Management
   - 4.4. File Systems
   - 4.5. Security & Permissions
5. 🌐 Networking
   - 5.1. OSI & TCP/IP Models
   - 5.2. Protocols (HTTP, DNS, TCP, UDP)
   - 5.3. Routing & Switching
   - 5.4. Firewalls & Network Security
6. 🔒 Security Basics
   - 6.1. Encryption & Hashing
   - 6.2. Authentication & Authorization
   - 6.3. Secure Communication (SSL/TLS)
   - 6.4. Common Threats & Mitigations
7. 🗄️ Data Structures & Algorithms
   - 7.1. Arrays, Lists, Stacks, Queues
   - 7.2. Trees, Graphs, Hash Tables
   - 7.3. Sorting & Searching Algorithms
   - 7.4. Complexity Analysis (Big O)
8. 🧠 Logic & Problem Solving
   - 8.1. Logical Reasoning
   - 8.2. Problem Decomposition
   - 8.3. Algorithmic Thinking
   - 8.4. Debugging Strategies
9. 🗣️ English Proficiency
   - 9.1. Reading Technical Documentation
   - 9.2. Writing Clear Code & Comments
   - 9.3. Communication in Teams
   - 9.4. Presentations & Technical Discussions

---

## 1. 🔢 Binary Logic & Digital Circuits

### 1.1. Number Systems (Binary, Hexadecimal, Decimal)

Number systems are the languages computers use to represent and process information. Imagine you’re learning to count in different languages: English (Decimal), Computer (Binary), and Geek (Hexadecimal)! 🧑‍💻

#### 🧮 What are Number Systems?
- **Decimal (Base 10):** The system we use every day. Digits: 0-9. Each position is a power of 10.
- **Binary (Base 2):** Used by computers. Digits: 0, 1. Each position is a power of 2.
- **Hexadecimal (Base 16):** Used for compact computer representation. Digits: 0-9, A-F. Each position is a power of 16.

#### 📊 Diagram: Place Values
```
Decimal:      1,234 = (1×10³) + (2×10²) + (3×10¹) + (4×10⁰)
Binary:     1011₂ = (1×2³) + (0×2²) + (1×2¹) + (1×2⁰) = 8+0+2+1 = 11₁₀
Hex:        2A3₁₆ = (2×16²) + (10×16¹) + (3×16⁰) = 512+160+3 = 675₁₀
```

#### 🔄 Conversion Examples
1. **Decimal to Binary:** 13₁₀ = 1101₂
2. **Binary to Decimal:** 1010₂ = 10₁₀
3. **Decimal to Hex:** 255₁₀ = FF₁₆
4. **Hex to Decimal:** 1A₁₆ = 26₁₀
5. **Binary to Hex:** 11010110₂ = D6₁₆
6. **Hex to Binary:** 3F₁₆ = 0011 1111₂
7. **Decimal to Binary:** 42₁₀ = 101010₂
8. **Binary to Decimal:** 111100₁₂ = 60₁₀
9. **Decimal to Hex:** 100₁₀ = 64₁₆
10. **Hex to Decimal:** B4₁₆ = 180₁₀

#### 🖼️ Visual Diagram: Number System Relationships
```
[Decimal] ←→ [Binary] ←→ [Hexadecimal]
     |           |             |
   (10)        (2)           (16)
```

#### 💡 Real-World Analogy
Think of number systems like different currencies. If you travel, you need to convert your money (numbers) to the local currency (system) to buy things (process data). Computers “think” in binary, but programmers often use decimal or hexadecimal for convenience.

#### 📝 Exercises
1. Convert 25₁₀ to binary and hexadecimal.
2. What is the decimal value of 11001₂?
3. Convert 7B₁₆ to decimal and binary.
4. Express 100₁₀ in binary and hex.
5. What is the binary equivalent of 2F₁₆?
6. Convert 111111₁₂ to decimal and hex.
7. What is the hexadecimal value for 200₁₀?
8. Convert 10101010₂ to decimal and hex.
9. What is the decimal value of 1C₁₆?
10. Convert 77₁₀ to binary and hex.

> "Mastering number systems is the first step to understanding how computers represent and manipulate all information!"
