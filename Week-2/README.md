<div align="center">

# 🚀 Week 2: Array Operations, Frequency Mapping & Sliding Patterns

**In-place array mutations, boundary filtering, hash map frequency aggregation, canonical sorting for anagram grouping, and dynamic programming fundamentals.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-8-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-8-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)

[⬅️ **Prev: Week 1**](../Week-1/README.md) &nbsp;•&nbsp; [🏠 **Main Repository**](../README.md) &nbsp;•&nbsp; [➡️ **Next: Week 3**](../Week-3/README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 2 Summary Statistics](#-week-2-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **Two-Pointer In-Place Filtering:** Maintains slow (write) and fast (read) pointers to overwrite unwanted elements without allocating additional memory ($O(1)$ auxiliary space).
2. **Canonical Anagram Grouping:** Converts anagram strings into unique canonical keys (either by sorting characters or creating 26-character frequency signatures) to group them in a `HashMap<String, List<String>>`.
3. **Kadane's Dynamic Programming Algorithm:** Computes the maximum contiguous subarray sum in a single linear pass $O(N)$ with $O(1)$ space using the recurrence: $\text{currentMax} = \max(\text{nums}[i], \text{currentMax} + \text{nums}[i])$.
4. **Top-K Frequent Elements with Heaps & Buckets:** Combines frequency counting with min-heaps (`PriorityQueue`) or bucket arrays for optimal $O(N \log K)$ or $O(N)$ retrieval.
5. **Prefix Accumulation & Index Interleaving:** Implements in-place cumulative tracking and interleaving arrays into alternating $(x_i, y_i)$ pairs.

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🏔️ **[1732. Find the Highest Altitude](./find-the-highest-altitude/)** | LeetCode | 🟢 Easy | Prefix Net Altitude Tracking | $O(N)$ | $O(1)$ | [Java](./find-the-highest-altitude/solution.java) |
| 🔤 **[49. Group Anagrams](./group-anagrams/)** | LeetCode | 🟡 Medium | Hash Map + Sorted Key Canonicalization | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | [Java](./group-anagrams/solution.java) |
| 📈 **[53. Maximum Subarray](./maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Dynamic Programming | $O(N)$ | $O(1)$ | [Java](./maximum-subarray/solution.java) |
| ✂️ **[26. Remove Duplicates from Sorted Array](./remove-duplicates-from-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Overwrite) | $O(N)$ | $O(1)$ | [Java](./remove-duplicates-from-sorted-array/solution.java) |
| 🗑️ **[27. Remove Element](./remove-element/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Partitioning) | $O(N)$ | $O(1)$ | [Java](./remove-element/solution.java) |
| ➕ **[1480. Running Sum of 1d Array](./running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | In-Place Prefix Accumulation | $O(N)$ | $O(1)$ | [Java](./running-sum-of-1d-array/solution.java) |
| 🔀 **[1470. Shuffle the Array](./shuffle-the-array/)** | LeetCode | 🟢 Easy | Array Index Interleaving $(x_i, y_i)$ | $O(N)$ | $O(N)$ | [Java](./shuffle-the-array/solution.java) |
| 🔝 **[347. Top K Frequent Elements](./top-k-frequent-elements/)** | LeetCode | 🟡 Medium | Frequency Map + Min-Heap / Bucket Sort | $O(N \log K)$ | $O(N)$ | [Java](./top-k-frequent-elements/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Find the Highest Altitude](./find-the-highest-altitude/)
- **Core Concept:** Track running net gain starting from altitude 0. Maximize $\text{maxAlt} = \max(\text{maxAlt}, \text{currentAlt} + \text{gain}[i])$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 2. [Group Anagrams](./group-anagrams/)
- **Core Concept:** For each string, sort its character array to create a canonical dictionary key. Group strings with matching keys in a `HashMap<String, List<String>>`.
- **Complexity:** $O(N \cdot K \log K)$ Time &nbsp;\|&nbsp; $O(N \cdot K)$ Space ($N$ strings of length $K$).

### 3. [Maximum Subarray](./maximum-subarray/)
- **Core Concept:** Apply Kadane's algorithm: at each index $i$, decide whether to extend the previous subarray or start fresh from $nums[i]$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 4. [Remove Duplicates from Sorted Array](./remove-duplicates-from-sorted-array/)
- **Core Concept:** Use a slow pointer $k$ to write unique elements whenever $nums[i] \neq nums[k]$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 5. [Remove Element](./remove-element/)
- **Core Concept:** Iterate through the array with a fast pointer; copy elements not matching `val` to the slow pointer index $k$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 6. [Running Sum of 1d Array](./running-sum-of-1d-array/)
- **Core Concept:** Modify the input array in-place by setting $nums[i] += nums[i-1]$ for all $i \ge 1$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 7. [Shuffle the Array](./shuffle-the-array/)
- **Core Concept:** For array $[x_1, x_2, \dots, y_1, y_2, \dots]$ of size $2n$, construct output array by placing $x_i$ at $2i$ and $y_i$ at $2i+1$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 8. [Top K Frequent Elements](./top-k-frequent-elements/)
- **Core Concept:** Build a frequency map `HashMap<Integer, Integer>`. Maintain a Min-Heap (`PriorityQueue`) of size $K$ comparing entries by frequency, or bucket sort elements by frequency into an array of lists.
- **Complexity:** $O(N \log K)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

---

## 📊 Week 2 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **8** |
| **LeetCode** | 8 |
| **Difficulty Breakdown** | 🟢 Easy: 5 &nbsp;\|&nbsp; 🟡 Medium: 3 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Primary Focus** | Two Pointers, In-place Mutation, Anagrams, Kadane's DP |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-2/group-anagrams

# Compile and execute
javac solution.java
java Solution
```

---

<div align="center">

[⬅️ Back to Week 1](../Week-1/README.md) &nbsp;•&nbsp; [🏠 Main README](../README.md) &nbsp;•&nbsp; [➡️ Next: Week 3](../Week-3/README.md)

</div>
