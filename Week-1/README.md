<div align="center">

# 🚀 Week 1: Arrays, Sorting Basics & Java Lambdas

**Foundational array manipulation, prefix sum accumulation, two-pointer techniques, custom object sorting, and Java functional interfaces.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-7-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-4-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-3-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)

[🏠 **Main Repository**](../README.md) &nbsp;•&nbsp; [➡️ **Next: Week 2**](../Week-2/README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 1 Summary Statistics](#-week-1-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **Prefix Sum Accumulation:** Eliminates redundant $O(N)$ nested loops for range sum calculations by pre-aggregating cumulative values in linear $O(N)$ time with $O(1)$ space.
2. **Two-Pointer Symmetrical Convergence:** Solves the squaring of sorted arrays with negative integers by placing pointers at both extremes and filling from right to left in $O(N)$ time.
3. **2D Grid Traversal:** Efficiently traverses multi-dimensional structures to compute row-wise aggregations and find global maximums.
4. **Custom Comparators (`Comparator<T>`):** Implements multi-attribute custom sorting logic (e.g., sorting by CGPA descending, name alphabetically, then ID ascending).
5. **Java Functional Programming (Lambdas):** Leverages `@FunctionalInterface` and lambda expressions to implement flexible predicate checkers for numbers (Odd/Even, Prime, Palindrome).

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| ⚖️ **[Find Pivot Index](./find-pivot-index/)** | LeetCode 724 | 🟢 Easy | Prefix Sum / Equilibrium Balance | $O(N)$ | $O(1)$ | [Java](./find-pivot-index/solution.java) |
| 💰 **[Richest Customer Wealth](./richest-customer-wealth/)** | LeetCode 1672 | 🟢 Easy | 2D Array Traversal / Row-wise Max Sum | $O(M \cdot N)$ | $O(1)$ | [Java](./richest-customer-wealth/solution.java) |
| ➕ **[Running Sum of 1d Array](./running-sum-of-1d-array/)** | LeetCode 1480 | 🟢 Easy | 1D Prefix Sum Accumulation | $O(N)$ | $O(1)$ | [Java](./running-sum-of-1d-array/solution.java) |
| 🔲 **[Squares of a Sorted Array](./squares-of-a-sorted-array/)** | LeetCode 977 | 🟢 Easy | Two Pointers / Symmetric Convergence | $O(N)$ | $O(N)$ | [Java](./squares-of-a-sorted-array/solution.java) |
| 🔄 **[Java Comparator](./java-comparator/)** | HackerRank | 🟡 Medium | `Comparator<Player>` / Multi-field Sort | $O(N \log N)$ | $O(1)$ | [Java](./java-comparator/solution.java) |
| ⚡ **[Java Lambda Expressions](./java-lambda-expressions/)** | HackerRank | 🟡 Medium | Functional Interfaces / Anonymous Lambdas | $O(T \sqrt{N})$ | $O(1)$ | [Java](./java-lambda-expressions/solution.java) |
| 📊 **[Java Sort](./java-sort/)** | HackerRank | 🟢 Easy | `Collections.sort` / Multi-attribute Comparator | $O(N \log N)$ | $O(1)$ | [Java](./java-sort/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Find Pivot Index](./find-pivot-index/)
- **Core Concept:** Compute the total array sum, then iterate maintaining a running `leftSum`. The pivot occurs where $\text{leftSum} == \text{totalSum} - \text{leftSum} - \text{nums}[i]$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 2. [Richest Customer Wealth](./richest-customer-wealth/)
- **Core Concept:** Traverse each row of an $M \times N$ matrix, summing account balances per customer and tracking the maximum.
- **Complexity:** $O(M \cdot N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 3. [Running Sum of 1d Array](./running-sum-of-1d-array/)
- **Core Concept:** Form the prefix sum array where $\text{runningSum}[i] = \text{runningSum}[i-1] + \text{nums}[i]$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space (in-place).

### 4. [Squares of a Sorted Array](./squares-of-a-sorted-array/)
- **Core Concept:** Since the input array is sorted, the largest squares are at the boundaries (left or right). Two pointers compare $|nums[left]|$ and $|nums[right]|$, placing the larger square from the end of the result array.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 5. [Java Comparator](./java-comparator/)
- **Core Concept:** Implement `Comparator<Player>` overriding `compare(Player a, Player b)`: sort by score descending; if scores are equal, sort by name lexicographically.
- **Complexity:** $O(N \log N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 6. [Java Lambda Expressions](./java-lambda-expressions/)
- **Core Concept:** Return lambda closures matching `PerformOperation` interface:
  - `isOdd()`: `n -> n % 2 != 0`
  - `isPrime()`: `BigInteger.valueOf(n).isProbablePrime(5)` or trial division up to $\sqrt{N}$
  - `isPalindrome()`: string reversal equality check
- **Complexity:** $O(T \sqrt{N})$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 7. [Java Sort](./java-sort/)
- **Core Concept:** Multi-criteria sorting on `Student` records using `Collections.sort(studentList, (s1, s2) -> ...)`: CGPA descending $\to$ First Name ascending $\to$ ID ascending.
- **Complexity:** $O(N \log N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

---

## 📊 Week 1 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **7** |
| **LeetCode** | 4 |
| **HackerRank** | 3 |
| **Difficulty Breakdown** | 🟢 Easy: 5 &nbsp;\|&nbsp; 🟡 Medium: 2 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Primary Focus** | Arrays, Prefix Sum, Comparators, Lambdas |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-1/find-pivot-index

# Compile and execute
javac solution.java
java Solution
```

---

<div align="center">

[⬅️ Back to Main README](../README.md) &nbsp;•&nbsp; [➡️ Next: Week 2](../Week-2/README.md)

</div>
