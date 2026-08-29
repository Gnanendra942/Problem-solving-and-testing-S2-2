<div align="center">

# 🚀 Week 6: Advanced String Algorithms, Palindromes & Sliding Window

**Advanced string processing, multi-center palindrome expansions, fixed-size frequency vectors, string concatenation periodicity invariance, and linear-time Z-algorithm suffix matching.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-10-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-5-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-5-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)

[⬅️ **Prev: Week 5**](../Week-5/README.md) &nbsp;•&nbsp; [🏠 **Main Repository**](../README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 6 Summary Statistics](#-week-6-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **Expand Around Center (Palindromic Substrings):** Expands outward from $2N - 1$ potential centers (odd and even length) to find the longest palindromic substring in $O(N^2)$ time with $O(1)$ space.
2. **Fixed-Size Sliding Window Frequency Vector:** Tracks dynamic character frequencies using a fixed 26-element array `int[26]` to detect all anagram permutations in $O(N)$ linear time.
3. **String Concatenation Periodicity Invariance:** Solves rotation and repeating substring validation by testing containment in doubled strings: $(A + A).\text{contains}(B)$ or $(S + S)[1 \dots 2N-2].\text{contains}(S)$.
4. **Z-Algorithm (Linear LCP Matching):** Constructs the Z-array in $O(N)$ time by maintaining a search window $[L, R]$ of matched characters to compute longest common prefixes with all suffixes.
5. **Two-Pointer Lookahead for Palindromic Repairs:** Identifies mismatch indices $(i, j)$ and validates whether skipping $i$ or $j$ produces a valid palindrome.

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🪞 **[5. Longest Palindromic Substring](./0005-longest-palindromic-substring/)** | LeetCode | 🟡 Medium | Expand Around Center ($2N-1$ Centers) | $O(N^2)$ | $O(1)$ | [Java](./0005-longest-palindromic-substring/solution.java) |
| 📍 **[28. Find Index of First Occurrence](./0028-find-the-index-of-the-first-occurrence-in-a-string/)** | LeetCode | 🟢 Easy | Sliding Window / Rolling Substring Match | $O((N-M+1)M)$ | $O(1)$ | [Java](./0028-find-the-index-of-the-first-occurrence-in-a-string/solution.java) |
| 🔠 **[438. Find All Anagrams in a String](./0438-find-all-anagrams-in-a-string/)** | LeetCode | 🟡 Medium | Sliding Window Frequency Vector ($26$-bucket) | $O(N)$ | $O(1)$ | [Java](./0438-find-all-anagrams-in-a-string/solution.java) |
| 🔁 **[459. Repeated Substring Pattern](./0459-repeated-substring-pattern/)** | LeetCode | 🟢 Easy | Periodicity Check / Doubling Invariance | $O(N)$ | $O(N)$ | [Java](./0459-repeated-substring-pattern/solution.java) |
| 🔄 **[796. Rotate String](./0796-rotate-string/)** | LeetCode | 🟢 Easy | Doubling Invariance ($(A+A).\text{contains}(B)$) | $O(N)$ | $O(N)$ | [Java](./0796-rotate-string/solution.java) |
| 🔄 **[Circular Palindromes](./circular-palindromes/)** | HackerRank | 🔴 Hard | Rotation-Invariant Palindrome Search | $O(N \log N)$ | $O(N \log N)$ | [Java](./circular-palindromes/solution.java) |
| 📡 **[Mars Exploration](./mars-exploration/)** | HackerRank | 🟢 Easy | Modulo-3 Periodic Signature Verification | $O(N)$ | $O(1)$ | [Java](./mars-exploration/solution.java) |
| 🧩 **[Palindrome Index](./palindrome-index/)** | HackerRank | 🟢 Easy | Two-Pointer Lookahead Mismatch Resolution | $O(N)$ | $O(1)$ | [Java](./palindrome-index/solution.java) |
| ⚡ **[String Similarity](./string-similarity/)** | HackerRank | 🟡 Medium | Z-Algorithm (Longest Common Prefix Array) | $O(N)$ | $O(N)$ | [Java](./string-similarity/solution.java) |
| 🔤 **[Two Strings](./two-strings/)** | HackerRank | 🟢 Easy | Bitmask / Character Set Matching | $O(A+B)$ | $O(1)$ | [Java](./two-strings/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Longest Palindromic Substring (0005)](./0005-longest-palindromic-substring/)
- **Core Concept:** Treat each index $i$ as an odd center `(i, i)` and an even center `(i, i+1)`. Expand outward while characters match, recording the longest palindrome found.
- **Complexity:** $O(N^2)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 2. [Find Index of First Occurrence (0028)](./0028-find-the-index-of-the-first-occurrence-in-a-string/)
- **Core Concept:** Slide a window of length $M$ across the haystack of length $N$, comparing characters or using `haystack.indexOf(needle)`.
- **Complexity:** $O((N - M + 1) \cdot M)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 3. [Find All Anagrams in a String (0438)](./0438-find-all-anagrams-in-a-string/)
- **Core Concept:** Maintain a fixed window of size $|p|$ on string $s$. Compare frequency counts `int[26]` of the window with the target frequency array in $O(1)$ time per slide.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 4. [Repeated Substring Pattern (0459)](./0459-repeated-substring-pattern/)
- **Core Concept:** Concatenate $s + s$, drop the first and last characters, and check if the original string $s$ is contained in $(s + s).substring(1, 2N - 1)$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 5. [Rotate String (0796)](./0796-rotate-string/)
- **Core Concept:** Check $s.length == goal.length$ and $(s + s).contains(goal)$. Any valid rotation of $s$ must appear as a substring in $s + s$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 6. [Circular Palindromes](./circular-palindromes/)
- **Core Concept:** For each circular shift of a string, determine the longest palindromic substring using Manacher's algorithm / center-radius tracking.
- **Complexity:** $O(N \log N)$ Time &nbsp;\|&nbsp; $O(N \log N)$ Space.

### 7. [Mars Exploration](./mars-exploration/)
- **Core Concept:** Compare characters at indices $i$ against expected "SOS" pattern (`i % 3 == 0 -> 'S'`, `i % 3 == 1 -> 'O'`, `i % 3 == 2 -> 'S'`). Count mismatches.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 8. [Palindrome Index](./palindrome-index/)
- **Core Concept:** Two pointers from left and right. Upon encountering a mismatch $s[l] \neq s[r]$, test whether skipping $l$ ($s[l+1 \dots r]$) or skipping $r$ ($s[l \dots r-1]$) forms a valid palindrome.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 9. [String Similarity](./string-similarity/)
- **Core Concept:** Compute the Z-array for string $s$, where $Z[i]$ is the length of the longest common prefix between $s$ and the suffix starting at $i$. Sum all $Z[i]$ values $+ |s|$ in $O(N)$ time.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 10. [Two Strings](./two-strings/)
- **Core Concept:** Create a frequency bitmask/set of string $A$. Check if any character in string $B$ exists in $A$.
- **Complexity:** $O(A+B)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

---

## 📊 Week 6 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **10** |
| **LeetCode** | 5 |
| **HackerRank** | 5 |
| **Difficulty Breakdown** | 🟢 Easy: 5 &nbsp;\|&nbsp; 🟡 Medium: 4 &nbsp;\|&nbsp; 🔴 Hard: 1 |
| **Primary Focus** | Expand Center, Sliding Window, Z-Algorithm, Periodicity |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-6/0005-longest-palindromic-substring

# Compile and execute
javac solution.java
java Solution
```

---

<div align="center">

[⬅️ Back to Week 5](../Week-5/README.md) &nbsp;•&nbsp; [🏠 Main README](../README.md)

</div>
