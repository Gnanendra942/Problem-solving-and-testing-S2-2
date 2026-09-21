# 🚀 Week 7: Object-Oriented Design, Generics & Inheritance

Welcome to **Week 7** of the Problem Solving and Testing journey! This week focuses on class-level system design, Java inheritance and generics, and applying object-oriented patterns to solve real-world simulation problems in **Java**.

---

## 🎯 Learning Objectives & Design Paradigms

- **Custom Data Structure Design:** Implemented core data structures from scratch (HashSet, Browser History) without relying on built-in libraries, deepening understanding of underlying storage mechanisms.
- **Doubly Linked List for Navigation:** Leveraged doubly linked list nodes with `prev`/`next` pointers to model browser back/forward navigation with $O(steps)$ traversal per operation.
- **HashMap-Backed Aggregation Systems:** Designed multi-entity tracking systems (Underground System) using composite key hashing and running average computation via accumulated totals.
- **N-ary Tree Traversal (DFS):** Modeled hierarchical inheritance structures as N-ary trees and applied preorder DFS to produce correct traversal orders while filtering dead nodes.
- **Java Generics & Type Parameterization:** Wrote type-safe generic methods that operate on any reference type, eliminating the need for method overloading.
- **Inheritance & Polymorphism Fundamentals:** Practiced class extension, method inheritance, and superclass chaining using the `extends` keyword.

---

## 💻 Problems Solved & Java Implementation

### LeetCode Challenges

| Problem | Difficulty | Design Pattern / Algorithm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🗃️ **[705. Design HashSet](./0705-design-hashset/)** | 🟢 Easy | Boolean Array Direct Addressing | $O(1)$ | $O(N)$ | [Java](./0705-design-hashset/solution.java) |
| 🔀 **[1470. Shuffle the Array](./1470-shuffle-the-array/)** | 🟢 Easy | Index Mapping / Interleaving | $O(N)$ | $O(N)$ | [Java](./1470-shuffle-the-array/solution.java) |
| 🚇 **[1396. Design Underground System](./1396-design-underground-system/)** | 🟡 Medium | HashMap, Running Average Aggregation | $O(1)$ per op | $O(P + S^2)$ | [Java](./1396-design-underground-system/solution.java) |
| 🌐 **[1472. Design Browser History](./1472-design-browser-history/)** | 🟡 Medium | Doubly Linked List Navigation | $O(steps)$ | $O(N)$ | [Java](./1472-design-browser-history/solution.java) |
| 👑 **[1600. Throne Inheritance](./1600-throne-inheritance/)** | 🟡 Medium | N-ary Tree, Preorder DFS, HashMap | $O(N)$ | $O(N)$ | [Java](./1600-throne-inheritance/solution.java) |

### HackerRank Challenges

| Problem | Difficulty | Core Concept | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 📝 **[Grading Students](./grading/)** | 🟡 Medium | Modulo Arithmetic, Rounding Rules | $O(N)$ | $O(N)$ | [Java](./grading/solution.java) |
| 🔧 **[Java Generics](./java-generics/)** | 🟡 Medium | Generic Methods, Type Parameterization | $O(N)$ | $O(1)$ | [Java](./java-generics/solution.java) |
| 🐾 **[Java Inheritance I](./java-inheritance-1/)** | 🟡 Medium | Class Extension, `extends` Keyword | $O(1)$ | $O(1)$ | [Java](./java-inheritance-1/solution.java) |
| 🧬 **[Java Inheritance II](./java-inheritance-2/)** | 🟡 Medium | Subclass Method Inheritance | $O(1)$ | $O(1)$ | [Java](./java-inheritance-2/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **9** |
| **Platforms** | LeetCode (5) · HackerRank (4) |
| **Difficulty** | 🟢 Easy: 2 &nbsp;\|&nbsp; 🟡 Medium: 7 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 7 completed successfully!*

</div>
