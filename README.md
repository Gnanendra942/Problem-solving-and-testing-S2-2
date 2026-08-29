<div align="center">

# ☕ Problem Solving & Testing in Java

**A structured, 6-week curriculum covering 55+ algorithmic challenges, data structures, dynamic programming paradigms, and competitive programming patterns.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Weeks Completed](https://img.shields.io/badge/Roadmap-6%20Weeks%20Completed-brightgreen.svg?style=for-the-badge&logo=gitbook&logoColor=white)](#-weekly-roadmap)
[![Total Solved](https://img.shields.io/badge/Problems%20Solved-55%20Exercises-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-week-by-week-curriculum)
[![LeetCode](https://img.shields.io/badge/LeetCode-32-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-22-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)
[![GeeksforGeeks](https://img.shields.io/badge/GeeksforGeeks-1-298D46.svg?style=for-the-badge&logo=geeksforgeeks&logoColor=white)](https://www.geeksforgeeks.org/)

</div>

---

## 📌 Table of Contents

- [Overview](#-overview)
- [Summary Statistics](#-summary-statistics)
- [Weekly Roadmap](#-weekly-roadmap)
- [Algorithmic Paradigms & Patterns](#-algorithmic-paradigms--patterns)
- [Week-by-Week Curriculum](#-week-by-week-curriculum)
  - [Week 1: Arrays, Sorting Basics & Java Lambdas](#-week-1-arrays-sorting-basics--java-lambdas)
  - [Week 2: Array Operations, Frequency Mapping & Sliding Patterns](#-week-2-array-operations-frequency-mapping--sliding-patterns)
  - [Week 3: Java Collections, Priority Queues & Date/Time Logic](#-week-3-java-collections-priority-queues--datetime-logic)
  - [Week 4: 2D Matrices, Subgrid Sums & Transformations](#-week-4-2d-matrices-subgrid-sums--transformations)
  - [Week 5: Subarrays, Dynamic Programming & State Machines](#-week-5-subarrays-dynamic-programming--state-machines)
  - [Week 6: Advanced String Algorithms, Palindromes & Sliding Window](#-week-6-advanced-string-algorithms-palindromes--sliding-window)
- [Repository Structure](#-repository-structure)
- [Getting Started & Local Execution](#-getting-started--local-execution)
- [Coding Standards & Best Practices](#-coding-standards--best-practices)

---

## 📖 Overview

This repository documents an intensive **6-week problem-solving and software testing track** implemented entirely in **Java**. The solutions cover essential computer science concepts, optimization techniques, and data structures ranging from basic array operations and custom comparators to advanced multi-center palindrome expansions, Z-algorithm suffix matching, dynamic programming, and 2D prefix sums.

Each solution is thoroughly documented with problem statements, algorithmic intuition, time and space complexity analyses, and clean, self-contained Java source files.

---

## 📊 Summary Statistics

<div align="center">

| Platform | 🟢 Easy | 🟡 Medium | 🔴 Hard | Total |
| :--- | :---: | :---: | :---: | :---: |
| **LeetCode** | 18 | 14 | 0 | **32** |
| **HackerRank** | 8 | 13 | 1 | **22** |
| **GeeksforGeeks** | 0 | 1 | 0 | **1** |
| **Total** | **26** | **28** | **1** | **55** |

</div>

```text
Problem Difficulty Distribution:
🟢 Easy:   ████████████████████ (47.3%)
🟡 Medium: █████████████████████ (50.9%)
🔴 Hard:   █ (1.8%)
```

---

## 🗺️ Weekly Roadmap

| Week | Focus Area | Key Concepts | Problems | Status |
| :---: | :--- | :--- | :---: | :---: |
| [**Week 1**](./Week-1/README.md) | **Arrays, Sorting Basics & Lambdas** | Prefix Sums, Two Pointers, Custom Comparators, Lambdas | 7 | ✅ Complete |
| [**Week 2**](./Week-2/README.md) | **Array Ops & Frequency Mapping** | In-place Filtering, Anagrams, Kadane's DP, Top-K Heap | 8 | ✅ Complete |
| [**Week 3**](./Week-3/README.md) | **Collections & Priority Queues** | PriorityQueue, Lexicographical Sorting, Date/Time, OOP Design | 10 | ✅ Complete |
| [**Week 4**](./Week-4/README.md) | **2D Matrices & Transformations** | 2D Prefix Sum, Ring Layer Rotation, Matrix Multiplication | 11 | ✅ Complete |
| [**Week 5**](./Week-5/README.md) | **Subarrays, DP & State Machines** | Circular Kadane, Sliding Window, Deterministic Parsing (`atoi`) | 9 | ✅ Complete |
| [**Week 6**](./Week-6/README.md) | **Advanced String Algorithms** | Expand Center, Z-Algorithm, Periodicity Invariance, Palindromes | 10 | ✅ Complete |
| **Total** | **Full 6-Week Track** | | **55** | **100% Solved** |

---

## 💡 Algorithmic Paradigms & Patterns

| Paradigm / Pattern | Applied Problems (Examples) | Complexity Target |
| :--- | :--- | :---: |
| **Prefix Sums (1D & 2D)** | `find-pivot-index`, `running-sum-of-1d-array`, `1314-matrix-block-sum` | $O(N)$ / $O(M \cdot N)$ |
| **Two Pointers & In-Place** | `squares-of-a-sorted-array`, `remove-duplicates`, `0283-move-zeroes` | $O(N)$ time, $O(1)$ space |
| **Sliding Window (Fixed/Dynamic)** | `0003-longest-substring`, `0438-find-all-anagrams`, `the-birthday-bar` | $O(N)$ linear time |
| **Dynamic Programming (Kadane's)** | `0053-maximum-subarray`, `0918-maximum-sum-circular-subarray`, `maxsubarray` | $O(N)$ single pass |
| **Heaps & Frequency Sorting** | `top-k-frequent-elements`, `0451-sort-characters-by-frequency`, `java-priority-queue` | $O(N \log K)$ |
| **Custom Comparators & Lambdas** | `0179-largest-number`, `java-comparator`, `java-sort`, `java-lambda-expressions` | $O(N \log N)$ |
| **Matrix Layer Manipulations** | `matrix-rotation-algo`, `0867-transpose-matrix`, `multiply-2-matrices4144` | $O(M \cdot N)$ |
| **State Machines & String Parsing** | `0008-string-to-integer-atoi`, `0890-find-and-replace-pattern` | $O(N)$ linear time |
| **Advanced Palindromes & Z-Algorithm**| `0005-longest-palindromic-substring`, `string-similarity`, `circular-palindromes` | $O(N) \sim O(N^2)$ |

---

## 📚 Week-by-Week Curriculum

### 🔹 Week 1: Arrays, Sorting Basics & Java Lambdas

> **Theme:** 1D/2D array manipulation, prefix sum accumulation, two-pointer techniques, custom object sorting, and Java functional interfaces.  
> 📖 **Read Full Overview:** [Week 1 README](./Week-1/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| ⚖️ **[724. Find Pivot Index](./Week-1/find-pivot-index/)** | LeetCode | 🟢 Easy | Prefix Sum / Equilibrium Index | $O(N)$ | $O(1)$ | [Java](./Week-1/find-pivot-index/solution.java) |
| 🔄 **[Java Comparator](./Week-1/java-comparator/)** | HackerRank | 🟡 Medium | `Comparator<Player>` / Multi-field Sort | $O(N \log N)$ | $O(1)$ | [Java](./Week-1/java-comparator/solution.java) |
| ⚡ **[Java Lambda Expressions](./Week-1/java-lambda-expressions/)** | HackerRank | 🟡 Medium | `@FunctionalInterface` / Dynamic Predicates | $O(T \sqrt{N})$ | $O(1)$ | [Java](./Week-1/java-lambda-expressions/solution.java) |
| 📊 **[Java Sort](./Week-1/java-sort/)** | HackerRank | 🟢 Easy | `Collections.sort` / Multi-attribute Order | $O(N \log N)$ | $O(1)$ | [Java](./Week-1/java-sort/solution.java) |
| 💰 **[1672. Richest Customer Wealth](./Week-1/richest-customer-wealth/)** | LeetCode | 🟢 Easy | 2D Array Traversal / Row-wise Max Sum | $O(M \cdot N)$ | $O(1)$ | [Java](./Week-1/richest-customer-wealth/solution.java) |
| ➕ **[1480. Running Sum of 1d Array](./Week-1/running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | 1D Prefix Sum Accumulation | $O(N)$ | $O(1)$ | [Java](./Week-1/running-sum-of-1d-array/solution.java) |
| 🔲 **[977. Squares of a Sorted Array](./Week-1/squares-of-a-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers / Symmetric Merging | $O(N)$ | $O(N)$ | [Java](./Week-1/squares-of-a-sorted-array/solution.java) |

---

### 🔹 Week 2: Array Operations, Frequency Mapping & Sliding Patterns

> **Theme:** In-place array mutations, boundary filtering, hash map frequency aggregation, canonical sorting for anagram grouping, and dynamic programming fundamentals.  
> 📖 **Read Full Overview:** [Week 2 README](./Week-2/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🏔️ **[1732. Find the Highest Altitude](./Week-2/find-the-highest-altitude/)** | LeetCode | 🟢 Easy | Prefix Net Altitude Tracking | $O(N)$ | $O(1)$ | [Java](./Week-2/find-the-highest-altitude/solution.java) |
| 🔤 **[49. Group Anagrams](./Week-2/group-anagrams/)** | LeetCode | 🟡 Medium | Hash Map + Sorted Canonical Key | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | [Java](./Week-2/group-anagrams/solution.java) |
| 📈 **[53. Maximum Subarray](./Week-2/maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Algorithm (Linear DP) | $O(N)$ | $O(1)$ | [Java](./Week-2/maximum-subarray/solution.java) |
| ✂️ **[26. Remove Duplicates from Sorted Array](./Week-2/remove-duplicates-from-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Overwrite) | $O(N)$ | $O(1)$ | [Java](./Week-2/remove-duplicates-from-sorted-array/solution.java) |
| 🗑️ **[27. Remove Element](./Week-2/remove-element/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Partitioning) | $O(N)$ | $O(1)$ | [Java](./Week-2/remove-element/solution.java) |
| ➕ **[1480. Running Sum of 1d Array](./Week-2/running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | In-Place Prefix Accumulation | $O(N)$ | $O(1)$ | [Java](./Week-2/running-sum-of-1d-array/solution.java) |
| 🔀 **[1470. Shuffle the Array](./Week-2/shuffle-the-array/)** | LeetCode | 🟢 Easy | Array Index Interleaving $(x_i, y_i)$ | $O(N)$ | $O(N)$ | [Java](./Week-2/shuffle-the-array/solution.java) |
| 🔝 **[347. Top K Frequent Elements](./Week-2/top-k-frequent-elements/)** | LeetCode | 🟡 Medium | Frequency Map + Min-Heap / Bucket Sort | $O(N \log K)$ | $O(N)$ | [Java](./Week-2/top-k-frequent-elements/solution.java) |

---

### 🔹 Week 3: Java Collections, Priority Queues & Date/Time Logic

> **Theme:** Java Collections Framework (`ArrayList`, `PriorityQueue`, `HashMap`), custom transitive comparators, system design simulation, and date/time algorithms.  
> 📖 **Read Full Overview:** [Week 3 README](./Week-3/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔢 **[179. Largest Number](./Week-3/0179-largest-number/)** | LeetCode | 🟡 Medium | Custom Transitive Concatenation Sort | $O(N \log N \cdot L)$ | $O(N \cdot L)$ | [Java](./Week-3/0179-largest-number/solution.java) |
| 🔠 **[451. Sort Characters By Frequency](./Week-3/0451-sort-characters-by-frequency/)** | LeetCode | 🟡 Medium | Frequency Map + Max-Heap / Bucket Sort | $O(N + K \log K)$ | $O(N)$ | [Java](./Week-3/0451-sort-characters-by-frequency/solution.java) |
| 📅 **[1154. Day of the Year](./Week-3/1154-day-of-the-year/)** | LeetCode | 🟢 Easy | ISO Date Parsing & Leap Year Days | $O(1)$ | $O(1)$ | [Java](./Week-3/1154-day-of-the-year/solution.java) |
| 🗓️ **[1185. Day of the Week](./Week-3/1185-day-of-the-week/)** | LeetCode | 🟢 Easy | Zeller's Congruence / Sakamoto Algorithm | $O(1)$ | $O(1)$ | [Java](./Week-3/1185-day-of-the-week/solution.java) |
| 🏷️ **[1357/1459. Apply Discount Every n Orders](./Week-3/1459-apply-discount-every-n-orders/)** | LeetCode | 🟡 Medium | OOP Design / Hash Map Price Lookup | $O(P)$ / call | $O(P)$ | [Java](./Week-3/1459-apply-discount-every-n-orders/solution.java) |
| 📑 **[Java 1D/2D ArrayList](./Week-3/java-arraylist/)** | HackerRank | 🟢 Easy | Dynamic 2D ArrayList Indexing | $O(N + Q)$ | $O(N)$ | [Java](./Week-3/java-arraylist/solution.java) |
| ⚔️ **[Java Comparator](./Week-3/java-comparator/)** | HackerRank | 🟡 Medium | `Comparator<Checker>` Score/Name Sort | $O(N \log N)$ | $O(1)$ | [Java](./Week-3/java-comparator/solution.java) |
| ⏰ **[Java Date and Time](./Week-3/java-date-and-time/)** | HackerRank | 🟢 Easy | `Calendar` / `LocalDate` Day Lookup | $O(1)$ | $O(1)$ | [Java](./Week-3/java-date-and-time/solution.java) |
| 🏅 **[Java Priority Queue](./Week-3/java-priority-queue/)** | HackerRank | 🟡 Medium | `PriorityQueue<Student>` Event Processing | $O(N \log N)$ | $O(N)$ | [Java](./Week-3/java-priority-queue/solution.java) |
| 🎓 **[Java Sort](./Week-3/java-sort/)** | HackerRank | 🟢 Easy | Multi-key Object Sorting (`CGPA, Name, ID`) | $O(N \log N)$ | $O(1)$ | [Java](./Week-3/java-sort/solution.java) |

---

### 🔹 Week 4: 2D Matrices, Subgrid Sums & Transformations

> **Theme:** 2D grid algorithms, 2D prefix sums (integral images), concentric ring rotations, matrix transposition, diagonal operations, and time conversions.  
> 📖 **Read Full Overview:** [Week 4 README](./Week-4/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔍 **[217. Contains Duplicate](./Week-4/0217-contains-duplicate/)** | LeetCode | 🟢 Easy | Hash Set Uniqueness Verification | $O(N)$ | $O(N)$ | [Java](./Week-4/0217-contains-duplicate/solution.java) |
| 0️⃣ **[283. Move Zeroes](./Week-4/0283-move-zeroes/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Relative Shift) | $O(N)$ | $O(1)$ | [Java](./Week-4/0283-move-zeroes/solution.java) |
| 🔄 **[867. Transpose Matrix](./Week-4/0867-transpose-matrix/)** | LeetCode | 🟢 Easy | 2D Grid Transposition ($M \times N \to N \times M$) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./Week-4/0867-transpose-matrix/solution.java) |
| 🔲 **[1314. Matrix Block Sum](./Week-4/1314-matrix-block-sum/)** | LeetCode | 🟡 Medium | 2D Prefix Sum (Inclusion-Exclusion) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./Week-4/1314-matrix-block-sum/solution.java) |
| 🗣️ **[1704. Determine if String Halves Are Alike](./Week-4/1704-determine-if-string-halves-are-alike/)** | LeetCode | 🟢 Easy | Two-Pointer Symmetric Vowel Counting | $O(N)$ | $O(1)$ | [Java](./Week-4/1704-determine-if-string-halves-are-alike/solution.java) |
| ⚖️ **[Compare the Triplets](./Week-4/compare-the-triplets/)** | HackerRank | 🟢 Easy | Linear Parallel Comparison | $O(1)$ | $O(1)$ | [Java](./Week-4/compare-the-triplets/solution.java) |
| 📐 **[Diagonal Difference](./Week-4/diagonal-difference/)** | HackerRank | 🟢 Easy | Primary & Secondary Diagonal Sums | $O(N)$ | $O(1)$ | [Java](./Week-4/diagonal-difference/solution.java) |
| 🌀 **[Matrix Layer Rotation](./Week-4/matrix-rotation-algo/)** | HackerRank | 🟡 Medium | Concentric Ring Extraction & Modulo Shift | $O(M \cdot N)$ | $O(M + N)$ | [Java](./Week-4/matrix-rotation-algo/solution.java) |
| ✖️ **[Multiply 2 Matrices](./Week-4/multiply-2-matrices4144/)** | GeeksforGeeks | 🟡 Medium | 3-Loop Matrix Product ($R_1 \times C_1 \times C_2$) | $O(N^3)$ | $O(N^2)$ | [Java](./Week-4/multiply-2-matrices4144/solution.java) |
| ⏰ **[Time Conversion](./Week-4/time-conversion/)** | HackerRank | 🟢 Easy | 12-Hour AM/PM to 24-Hour Parsing | $O(1)$ | $O(1)$ | [Java](./Week-4/time-conversion/solution.java) |
| 🔤 **[Two Strings](./Week-4/two-strings/)** | HackerRank | 🟢 Easy | Character Frequency Set Intersection | $O(A+B)$ | $O(1)$ | [Java](./Week-4/two-strings/solution.java) |

---

### 🔹 Week 5: Subarrays, Dynamic Programming & State Machines

> **Theme:** Contiguous subarray optimizations, Kadane's algorithm (standard and circular wrap-around), sliding window mechanics, deterministic state transitions (`atoi`), and isomorphic string matching.  
> 📖 **Read Full Overview:** [Week 5 README](./Week-5/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🪟 **[3. Longest Substring Without Repeating Characters](./Week-5/0003-longest-substring-without-repeating-characters/)** | LeetCode | 🟡 Medium | Dynamic Sliding Window + Last Seen Map | $O(N)$ | $O(\min(N, \Sigma))$ | [Java](./Week-5/0003-longest-substring-without-repeating-characters/solution.java) |
| 🔢 **[8. String to Integer (atoi)](./Week-5/0008-string-to-integer-atoi/)** | LeetCode | 🟡 Medium | State Machine / DFA + 32-bit Clamping | $O(N)$ | $O(1)$ | [Java](./Week-5/0008-string-to-integer-atoi/solution.java) |
| 📈 **[53. Maximum Subarray](./Week-5/0053-maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Dynamic Programming | $O(N)$ | $O(1)$ | [Java](./Week-5/0053-maximum-subarray/solution.java) |
| 🔠 **[890. Find and Replace Pattern](./Week-5/0890-find-and-replace-pattern/)** | LeetCode | 🟡 Medium | Bijective / Isomorphic Signature Normalization | $O(N \cdot K)$ | $O(K)$ | [Java](./Week-5/0890-find-and-replace-pattern/solution.java) |
| 🔄 **[918. Maximum Sum Circular Subarray](./Week-5/0918-maximum-sum-circular-subarray/)** | LeetCode | 🟡 Medium | Dual Kadane (Max Subarray & Total - Min Subarray) | $O(N)$ | $O(1)$ | [Java](./Week-5/0918-maximum-sum-circular-subarray/solution.java) |
| 🔍 **[1408. String Matching in an Array](./Week-5/1408-string-matching-in-an-array/)** | LeetCode | 🟢 Easy | Brute-Force Substring Search | $O(N^2 \cdot L)$ | $O(1)$ | [Java](./Week-5/1408-string-matching-in-an-array/solution.java) |
| ✂️ **[Alternating Characters](./Week-5/alternating-characters/)** | HackerRank | 🟢 Easy | Greedy Adjacent Scan Deletions | $O(N)$ | $O(1)$ | [Java](./Week-5/alternating-characters/solution.java) |
| 📊 **[The Maximum Subarray](./Week-5/maxsubarray/)** | HackerRank | 🟡 Medium | Kadane's DP + Greedy Subsequence Sum | $O(N)$ | $O(1)$ | [Java](./Week-5/maxsubarray/solution.java) |
| 🍫 **[Subarray Division (Birthday Bar)](./Week-5/the-birthday-bar/)** | HackerRank | 🟢 Easy | Fixed-Length Sliding Window / Prefix Sum | $O(N)$ | $O(1)$ | [Java](./Week-5/the-birthday-bar/solution.java) |

---

### 🔹 Week 6: Advanced String Algorithms, Palindromes & Sliding Window

> **Theme:** Advanced string processing, multi-center palindrome expansions, fixed-size frequency vectors, string concatenation periodicity invariance, and linear-time Z-algorithm suffix matching.  
> 📖 **Read Full Overview:** [Week 6 README](./Week-6/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🪞 **[5. Longest Palindromic Substring](./Week-6/0005-longest-palindromic-substring/)** | LeetCode | 🟡 Medium | Expand Around Center ($2N-1$ Centers) | $O(N^2)$ | $O(1)$ | [Java](./Week-6/0005-longest-palindromic-substring/solution.java) |
| 📍 **[28. Find Index of First Occurrence](./Week-6/0028-find-the-index-of-the-first-occurrence-in-a-string/)** | LeetCode | 🟢 Easy | Sliding Window / Rolling Substring Match | $O((N-M+1)M)$ | $O(1)$ | [Java](./Week-6/0028-find-the-index-of-the-first-occurrence-in-a-string/solution.java) |
| 🔠 **[438. Find All Anagrams in a String](./Week-6/0438-find-all-anagrams-in-a-string/)** | LeetCode | 🟡 Medium | Sliding Window Frequency Vector ($26$-bucket diff) | $O(N)$ | $O(1)$ | [Java](./Week-6/0438-find-all-anagrams-in-a-string/solution.java) |
| 🔁 **[459. Repeated Substring Pattern](./Week-6/0459-repeated-substring-pattern/)** | LeetCode | 🟢 Easy | Concatenation Invariance ($(S+S)[1..2N-2]$) | $O(N)$ | $O(N)$ | [Java](./Week-6/0459-repeated-substring-pattern/solution.java) |
| 🔄 **[796. Rotate String](./Week-6/0796-rotate-string/)** | LeetCode | 🟢 Easy | Doubling Invariance ($(A+A).\text{contains}(B)$) | $O(N)$ | $O(N)$ | [Java](./Week-6/0796-rotate-string/solution.java) |
| 🔄 **[Circular Palindromes](./Week-6/circular-palindromes/)** | HackerRank | 🔴 Hard | Rotation-Invariant Palindrome Search | $O(N \log N)$ | $O(N \log N)$ | [Java](./Week-6/circular-palindromes/solution.java) |
| 📡 **[Mars Exploration](./Week-6/mars-exploration/)** | HackerRank | 🟢 Easy | Modulo-3 Periodic Signature Verification | $O(N)$ | $O(1)$ | [Java](./Week-6/mars-exploration/solution.java) |
| 🧩 **[Palindrome Index](./Week-6/palindrome-index/)** | HackerRank | 🟢 Easy | Two-Pointer Lookahead Mismatch Resolution | $O(N)$ | $O(1)$ | [Java](./Week-6/palindrome-index/solution.java) |
| ⚡ **[String Similarity](./Week-6/string-similarity/)** | HackerRank | 🟡 Medium | Z-Algorithm (Longest Common Prefix Array) | $O(N)$ | $O(N)$ | [Java](./Week-6/string-similarity/solution.java) |
| 🔤 **[Two Strings](./Week-6/two-strings/)** | HackerRank | 🟢 Easy | Bitmask / Character Set Matching | $O(A+B)$ | $O(1)$ | [Java](./Week-6/two-strings/solution.java) |

---

## 🗂️ Repository Structure

```text
Problem-solving-and-testing-S2-2/
├── README.md                               # Master Repository Documentation
├── Week-1/                                 # Week 1: Arrays, Sorting Basics & Lambdas (7 problems)
│   ├── README.md                           # Week 1 Overview & Syllabus
│   ├── find-pivot-index/                   # LeetCode 724
│   │   ├── README.md
│   │   └── solution.java
│   ├── java-comparator/
│   ├── java-lambda-expressions/
│   ├── java-sort/
│   ├── richest-customer-wealth/
│   ├── running-sum-of-1d-array/
│   └── squares-of-a-sorted-array/
├── Week-2/                                 # Week 2: Array Ops, Frequency Mapping & Sliding Patterns (8 problems)
│   ├── README.md                           # Week 2 Overview & Syllabus
│   ├── find-the-highest-altitude/
│   ├── group-anagrams/
│   ├── maximum-subarray/
│   ├── remove-duplicates-from-sorted-array/
│   ├── remove-element/
│   ├── running-sum-of-1d-array/
│   ├── shuffle-the-array/
│   └── top-k-frequent-elements/
├── Week-3/                                 # Week 3: Java Collections, Priority Queues & Date/Time (10 problems)
│   ├── README.md                           # Week 3 Overview & Syllabus
│   ├── 0179-largest-number/
│   ├── 0451-sort-characters-by-frequency/
│   ├── 1154-day-of-the-year/
│   ├── 1185-day-of-the-week/
│   ├── 1459-apply-discount-every-n-orders/
│   ├── java-arraylist/
│   ├── java-comparator/
│   ├── java-date-and-time/
│   ├── java-priority-queue/
│   └── java-sort/
├── Week-4/                                 # Week 4: 2D Matrices, Subgrid Sums & Transformations (11 problems)
│   ├── README.md                           # Week 4 Overview & Syllabus
│   ├── 0217-contains-duplicate/
│   ├── 0283-move-zeroes/
│   ├── 0867-transpose-matrix/
│   ├── 1314-matrix-block-sum/
│   ├── 1704-determine-if-string-halves-are-alike/
│   ├── compare-the-triplets/
│   ├── diagonal-difference/
│   ├── matrix-rotation-algo/
│   ├── multiply-2-matrices4144/
│   ├── time-conversion/
│   └── two-strings/
├── Week-5/                                 # Week 5: Subarrays, Dynamic Programming & State Machines (9 problems)
│   ├── README.md                           # Week 5 Overview & Syllabus
│   ├── 0003-longest-substring-without-repeating-characters/
│   ├── 0008-string-to-integer-atoi/
│   ├── 0053-maximum-subarray/
│   ├── 0890-find-and-replace-pattern/
│   ├── 0918-maximum-sum-circular-subarray/
│   ├── 1408-string-matching-in-an-array/
│   ├── alternating-characters/
│   ├── maxsubarray/
│   └── the-birthday-bar/
└── Week-6/                                 # Week 6: Advanced String Algorithms & Palindromes (10 problems)
    ├── README.md                           # Week 6 Overview & Syllabus
    ├── 0005-longest-palindromic-substring/
    ├── 0028-find-the-index-of-the-first-occurrence-in-a-string/
    ├── 0438-find-all-anagrams-in-a-string/
    ├── 0459-repeated-substring-pattern/
    ├── 0796-rotate-string/
    ├── circular-palindromes/
    ├── mars-exploration/
    ├── palindrome-index/
    ├── string-similarity/
    └── two-strings/
```

---

## 🚀 Getting Started & Local Execution

### Prerequisites

- **Java Development Kit (JDK):** Version 17 or higher
- **IDE (Optional):** IntelliJ IDEA, Eclipse, or Visual Studio Code with Java Extension Pack

Verify your Java installation:

```bash
java -version
javac -version
```

### Cloning the Repository

```bash
git clone https://github.com/Gnanendra942/Problem-solving-and-testing-S2-2.git
cd Problem-solving-and-testing-S2-2
```

### Compiling and Running Solutions

Every folder contains a standalone `solution.java` file. You can compile and test any solution directly via terminal:

```bash
# Example 1: Compile and run Week 5 Kadane's Algorithm
cd "Week-5/0053-maximum-subarray"
javac solution.java
java Solution

# Example 2: Compile and run Week 6 Z-Algorithm (String Similarity)
cd "../..Week-6/string-similarity"
javac solution.java
java Solution
```

---

## 🛡️ Coding Standards & Best Practices

- **Time Complexity Optimization:** Prioritized minimal asymptotic bounds (e.g. $O(N)$ sliding windows and $O(N \log N)$ sorting over $O(N^2)$ brute forces).
- **Space Optimization:** Emphasized in-place pointer manipulation ($O(1)$ auxiliary space) wherever array mutation is permissible.
- **Defensive Numeric Handling:** Handled 32-bit signed integer boundary cases (`Integer.MAX_VALUE`, `Integer.MIN_VALUE`) and potential arithmetic overflow using `long` casts.
- **Clean Code & Self-Documentation:** Followed standard Java conventions (camelCase naming, modular methods, and descriptive variable names).

---

<div align="center">

**Crafted with ☕ and passion for Problem Solving & Algorithms.**  
*Continuous learning through deliberate practice.*

</div>
