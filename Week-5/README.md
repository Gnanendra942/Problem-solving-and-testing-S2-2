<div align="center">

# 🚀 Week 5: Subarrays, Dynamic Programming & String State Machines

**Contiguous subarray optimizations, Kadane's algorithm (standard and circular wrap-around), sliding window mechanics, deterministic state transitions (`atoi`), and isomorphic string matching.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-9-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-6-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-3-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)

[⬅️ **Prev: Week 4**](../Week-4/README.md) &nbsp;•&nbsp; [🏠 **Main Repository**](../README.md) &nbsp;•&nbsp; [➡️ **Next: Week 6**](../Week-6/README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 5 Summary Statistics](#-week-5-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **Kadane's Dynamic Programming Algorithm:** Computes maximum contiguous subarray sums in linear $O(N)$ time with $O(1)$ auxiliary space.
2. **Circular Subarray Sum Optimization:** Leverages dual Kadane evaluations (Maximum Subarray Sum and Minimum Subarray Sum) combined with total array sum to solve wrap-around circular boundaries:  
   $$\text{MaxCircular} = \max(\text{maxKadane}, \text{totalSum} - \text{minKadane}) \quad (\text{for } \text{maxKadane} > 0)$$
3. **Dynamic Sliding Window Search:** Expands and shrinks window boundaries using character index tracking maps to solve substring problems in optimal $O(N)$ time.
4. **Deterministic Finite Automaton & Numeric Clamping:** Implements character-by-character validation, whitespace trimming, sign tracking, and 32-bit integer overflow protection (`atoi`).
5. **Isomorphic Pattern Normalization:** Maps words into normalized canonical index signatures to perform bi-directional pattern matching in linear time.

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🪟 **[3. Longest Substring Without Repeating Characters](./0003-longest-substring-without-repeating-characters/)** | LeetCode | 🟡 Medium | Sliding Window + Last Seen Map | $O(N)$ | $O(\min(N, \Sigma))$ | [Java](./0003-longest-substring-without-repeating-characters/solution.java) |
| 🔢 **[8. String to Integer (atoi)](./0008-string-to-integer-atoi/)** | LeetCode | 🟡 Medium | State Machine / DFA + 32-bit Clamping | $O(N)$ | $O(1)$ | [Java](./0008-string-to-integer-atoi/solution.java) |
| 📈 **[53. Maximum Subarray](./0053-maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Dynamic Programming | $O(N)$ | $O(1)$ | [Java](./0053-maximum-subarray/solution.java) |
| 🔠 **[890. Find and Replace Pattern](./0890-find-and-replace-pattern/)** | LeetCode | 🟡 Medium | Bijective / Isomorphic Signature Normalization | $O(N \cdot K)$ | $O(K)$ | [Java](./0890-find-and-replace-pattern/solution.java) |
| 🔄 **[918. Maximum Sum Circular Subarray](./0918-maximum-sum-circular-subarray/)** | LeetCode | 🟡 Medium | Dual Kadane (Max Subarray & Total - Min Subarray) | $O(N)$ | $O(1)$ | [Java](./0918-maximum-sum-circular-subarray/solution.java) |
| 🔍 **[1408. String Matching in an Array](./1408-string-matching-in-an-array/)** | LeetCode | 🟢 Easy | Brute-Force Substring Search | $O(N^2 \cdot L)$ | $O(1)$ | [Java](./1408-string-matching-in-an-array/solution.java) |
| ✂️ **[Alternating Characters](./alternating-characters/)** | HackerRank | 🟢 Easy | Greedy Adjacent Scan Deletions | $O(N)$ | $O(1)$ | [Java](./alternating-characters/solution.java) |
| 📊 **[The Maximum Subarray](./maxsubarray/)** | HackerRank | 🟡 Medium | Kadane's DP + Greedy Subsequence Sum | $O(N)$ | $O(1)$ | [Java](./maxsubarray/solution.java) |
| 🍫 **[Subarray Division (Birthday Bar)](./the-birthday-bar/)** | HackerRank | 🟢 Easy | Fixed-Length Sliding Window / Prefix Sum | $O(N)$ | $O(1)$ | [Java](./the-birthday-bar/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Longest Substring Without Repeating Characters (0003)](./0003-longest-substring-without-repeating-characters/)
- **Core Concept:** Sliding window with a `HashMap<Character, Integer>` or index array tracking the last seen index of each character. Jump the left pointer $l = \max(l, \text{lastIndex} + 1)$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(\min(N, \Sigma))$ Space.

### 2. [String to Integer (atoi) (0008)](./0008-string-to-integer-atoi/)
- **Core Concept:** Skip leading whitespace $\to$ record sign $\to$ parse digits. Before accumulating, check for overflow: if $\text{total} > \frac{\text{Integer.MAX\_VALUE} - \text{digit}}{10}$, clamp to `MAX_VALUE` or `MIN_VALUE`.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 3. [Maximum Subarray (0053)](./0053-maximum-subarray/)
- **Core Concept:** Kadane's single-pass DP: accumulate `currentSum = Math.max(nums[i], currentSum + nums[i])`, updating `maxSum`.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 4. [Find and Replace Pattern (0890)](./0890-find-and-replace-pattern/)
- **Core Concept:** Normalize strings into canonical integer signatures based on the first occurrence of each character. Compare each word's signature to the pattern's signature.
- **Complexity:** $O(N \cdot K)$ Time &nbsp;\|&nbsp; $O(K)$ Space.

### 5. [Maximum Sum Circular Subarray (0918)](./0918-maximum-sum-circular-subarray/)
- **Core Concept:** Compute both the maximum subarray sum (`maxKadane`) and minimum subarray sum (`minKadane`). The circular maximum is $\text{totalSum} - \text{minKadane}$. Handle the all-negative edge case by returning `maxKadane`.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 6. [String Matching in an Array (1408)](./1408-string-matching-in-an-array/)
- **Core Concept:** For each string, check if it exists as a substring of any other string in the list using `words[j].contains(words[i])`.
- **Complexity:** $O(N^2 \cdot L)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 7. [Alternating Characters](./alternating-characters/)
- **Core Concept:** Count adjacent matching pairs $s[i] == s[i-1]$ to find the minimal deletions needed for alternating characters.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 8. [The Maximum Subarray](./maxsubarray/)
- **Core Concept:** Simultaneously calculate the contiguous maximum subarray sum (Kadane) and the non-contiguous maximum subsequence sum (sum of all positive numbers, or maximum single negative).
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 9. [Subarray Division (Birthday Bar)](./the-birthday-bar/)
- **Core Concept:** Fixed sliding window of length $m$. Maintain the window sum and count segments where $\text{windowSum} == d$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

---

## 📊 Week 5 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **9** |
| **LeetCode** | 6 |
| **HackerRank** | 3 |
| **Difficulty Breakdown** | 🟢 Easy: 3 &nbsp;\|&nbsp; 🟡 Medium: 6 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Primary Focus** | Kadane's DP, Circular DP, Sliding Window, State Machines |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-5/0918-maximum-sum-circular-subarray

# Compile and execute
javac solution.java
java Solution
```

---

<div align="center">

[⬅️ Back to Week 4](../Week-4/README.md) &nbsp;•&nbsp; [🏠 Main README](../README.md) &nbsp;•&nbsp; [➡️ Next: Week 6](../Week-6/README.md)

</div>
