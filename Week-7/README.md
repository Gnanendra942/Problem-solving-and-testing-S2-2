<div align="center">

# 🚀 Week 7: Object-Oriented Design, Generics & Inheritance

**Class-level system design, state-preserving doubly linked list navigation, composite-key route aggregation, hierarchical N-ary tree preorder DFS, Java generics, and class inheritance.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-9-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-5-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-4-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)

[⬅️ **Prev: Week 6**](../Week-6/README.md) &nbsp;•&nbsp; [🏠 **Main Repository**](../README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 7 Summary Statistics](#-week-7-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **Custom Data Structure Direct Addressing:** Implements core hash storage from scratch without built-in library dependencies using direct boolean index addressing for $O(1)$ amortized queries.
2. **Doubly Linked List for Bidirectional Navigation:** Leverages explicit pointer manipulations (`prev` and `next`) to maintain history state, enabling $O(\text{steps})$ traversal and $O(1)$ forward-branch truncation upon visiting new URLs.
3. **Composite Key Route Aggregation:** Designs multi-tier tracking systems using composite route keys (`startStation,endStation`) and running accumulation structures to compute real-time travel averages.
4. **N-ary Tree Preorder DFS with Tombstone Masking:** Models hierarchical dynastic lines as N-ary trees and executes depth-first traversals while gracefully filtering deceased members via state flags without breaking subtree traversal integrity.
5. **Java Type Parameterization & Generics:** Utilizes generic method declarations (`<E> void printArray(E[] array)`) for compile-time type safety across heterogeneous array reference types.
6. **Class Extension & Method Specialization:** Employs object-oriented inheritance hierarchies (`extends`) to share base logic while specializing domain behaviors across subclasses.

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🗃️ **[705. Design HashSet](./0705-design-hashset/)** | LeetCode | 🟢 Easy | Boolean Array Direct Addressing | $O(1)$ | $O(N)$ | [Java](./0705-design-hashset/solution.java) |
| 🚇 **[1396. Design Underground System](./1396-design-underground-system/)** | LeetCode | 🟡 Medium | Dual HashMaps / Composite Route Aggregator | $O(1)$ per op | $O(P + S^2)$ | [Java](./1396-design-underground-system/solution.java) |
| 🔀 **[1470. Shuffle the Array](./1470-shuffle-the-array/)** | LeetCode | 🟢 Easy | Array Interleaving / Index Mapping | $O(N)$ | $O(N)$ | [Java](./1470-shuffle-the-array/solution.java) |
| 🌐 **[1472. Design Browser History](./1472-design-browser-history/)** | LeetCode | 🟡 Medium | Doubly Linked List Navigation & Truncation | $O(\text{steps})$ | $O(N)$ | [Java](./1472-design-browser-history/solution.java) |
| 👑 **[1600. Throne Inheritance](./1600-throne-inheritance/)** | LeetCode | 🟡 Medium | N-ary Tree Preorder DFS + Tombstone Mask | $O(N)$ | $O(N)$ | [Java](./1600-throne-inheritance/solution.java) |
| 📝 **[Grading Students](./grading/)** | HackerRank | 🟡 Medium | Modulo Arithmetic / Next Multiple-of-5 Rounding | $O(N)$ | $O(N)$ | [Java](./grading/solution.java) |
| 🔧 **[Java Generics](./java-generics/)** | HackerRank | 🟡 Medium | Type-Safe Generic Method Parameterization | $O(N)$ | $O(1)$ | [Java](./java-generics/solution.java) |
| 🐾 **[Java Inheritance I](./java-inheritance-1/)** | HackerRank | 🟡 Medium | Class Extension & Method Inheritance | $O(1)$ | $O(1)$ | [Java](./java-inheritance-1/solution.java) |
| 🧬 **[Java Inheritance II](./java-inheritance-2/)** | HackerRank | 🟡 Medium | Subclass Method Specialization | $O(1)$ | $O(1)$ | [Java](./java-inheritance-2/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Design HashSet (0705)](./0705-design-hashset/)
- **Core Concept:** Allocate a boolean lookup table `boolean[] set = new boolean[1000001]`. Operations `add(key)`, `remove(key)`, and `contains(key)` map directly to array indices in strictly $O(1)$ time.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(N)$ Space ($N \le 10^6$).

### 2. [Design Underground System (1396)](./1396-design-underground-system/)
- **Core Concept:** Maintain two maps: `currentPassengerMap` (`id -> Passenger`) for active check-ins, and `routeMap` (`"startStation,endStation" -> Route`) tracking total trip duration and trip count. On checkout, update the aggregate route metrics and compute average time in $O(1)$.
- **Complexity:** $O(1)$ per operation &nbsp;\|&nbsp; $O(P + S^2)$ Space ($P$: active passengers, $S$: unique stations).

### 3. [Shuffle the Array (1470)](./1470-shuffle-the-array/)
- **Core Concept:** Construct an array of length $2n$. Even indices $2i$ receive elements from the first half $nums[i]$, while odd indices $2i + 1$ receive elements from the second half $nums[n + i]$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 4. [Design Browser History (1472)](./1472-design-browser-history/)
- **Core Concept:** Model the tab history with doubly linked list nodes having `prev`, `next`, and `url`. Visiting a new URL creates a node, attaches it to `curr.next`, and implicitly unlinks the forward history branch in $O(1)$. `back` and `forward` traverse the pointer chain bounded by list ends.
- **Complexity:** $O(1)$ for `visit`, $O(\text{steps})$ for `back`/`forward` &nbsp;\|&nbsp; $O(N)$ Space.

### 5. [Throne Inheritance (1600)](./1600-throne-inheritance/)
- **Core Concept:** Model dynastic succession as an N-ary tree using `Person` nodes with ordered children lists and a map (`name -> Person`). Preorder DFS traverses the root and all child subtrees in order of birth. Deceased individuals have their `isAlive` flag set to `false`, omitting them from output without disrupting subtree connectivity.
- **Complexity:** $O(1)$ for `birth` and `death`, $O(N)$ for `getInheritanceOrder` &nbsp;\|&nbsp; $O(N)$ Space.

### 6. [Grading Students](./grading/)
- **Core Concept:** For each grade $\ge 38$, compute the next multiple of $5$ using `5 * ((grade / 5) + 1)`. If the difference is $< 3$, round the grade up to that multiple; otherwise, retain the original grade.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 7. [Java Generics](./java-generics/)
- **Core Concept:** Declare a generic method `public static <E> void printArray(E[] array)` that accepts any reference type array (`Integer[]`, `String[]`), iterating through elements and printing each on a new line to avoid method overloading.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 8. [Java Inheritance I](./java-inheritance-1/)
- **Core Concept:** Demonstrate single inheritance using the `extends` keyword where subclass `Bird` inherits method `walk()` from superclass `Animal` while defining its own specialized behaviors (`fly()`, `sing()`).
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 9. [Java Inheritance II](./java-inheritance-2/)
- **Core Concept:** Implement superclass `Arithmetic` with method `add(int, int)` and subclass `Adder extends Arithmetic`. Demonstrate runtime polymorphism and inherited method execution without overriding.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

---

## 📊 Week 7 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **9** |
| **LeetCode** | 5 |
| **HackerRank** | 4 |
| **Difficulty Breakdown** | 🟢 Easy: 2 &nbsp;\|&nbsp; 🟡 Medium: 7 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Primary Focus** | Object-Oriented Design, Doubly Linked Lists, N-ary Tree DFS, Generics |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-7/1472-design-browser-history

# Compile and execute
javac solution.java
java BrowserHistory
```

---

<div align="center">

[⬅️ Back to Week 6](../Week-6/README.md) &nbsp;•&nbsp; [🏠 Main README](../README.md)

</div>
