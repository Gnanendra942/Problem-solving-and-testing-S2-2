<div align="center">

# 🚀 Week 4: 2D Matrices, Subgrid Sums & Transformations

**2D grid algorithms, 2D prefix sums (integral images), concentric ring rotations, matrix transposition, diagonal operations, and time conversions.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-11-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-5-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-5-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)
[![GeeksforGeeks](https://img.shields.io/badge/GeeksforGeeks-1-298D46.svg?style=for-the-badge&logo=geeksforgeeks&logoColor=white)](https://www.geeksforgeeks.org/)

[⬅️ **Prev: Week 3**](../Week-3/README.md) &nbsp;•&nbsp; [🏠 **Main Repository**](../README.md) &nbsp;•&nbsp; [➡️ **Next: Week 5**](../Week-5/README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 4 Summary Statistics](#-week-4-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **2D Prefix Sums (Inclusion-Exclusion):** Constructs integral image tables $P[r+1][c+1]$ to calculate any subgrid sum in $O(1)$ query time:  
   $$\text{Sum} = P[r_2+1][c_2+1] - P[r_1][c_2+1] - P[r_2+1][c_1] + P[r_1][c_1]$$
2. **Concentric Ring Rotations:** Extracts matrix perimeters layer-by-layer into 1D rings, applies effective rotations via $(idx + r) \pmod K$, and writes values back in-place.
3. **Matrix Transposition & Multiplication:** Transforms matrix dimensions ($M \times N \to N \times M$) and implements standard matrix multiplication ($R_1 \times C_1 \times C_2$).
4. **Diagonal Arithmetic:** Simultaneously computes primary diagonal ($\sum A_{i,i}$) and secondary diagonal ($\sum A_{i, n-1-i}$) sums in a single $O(N)$ pass.
5. **In-Place Two-Pointer Partitioning:** Traverses arrays to move all zeros to the tail while preserving the exact order of non-zero elements in $O(1)$ space.

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔍 **[217. Contains Duplicate](./0217-contains-duplicate/)** | LeetCode | 🟢 Easy | Hash Set Uniqueness Verification | $O(N)$ | $O(N)$ | [Java](./0217-contains-duplicate/solution.java) |
| 0️⃣ **[283. Move Zeroes](./0283-move-zeroes/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Relative Shift) | $O(N)$ | $O(1)$ | [Java](./0283-move-zeroes/solution.java) |
| 🔄 **[867. Transpose Matrix](./0867-transpose-matrix/)** | LeetCode | 🟢 Easy | 2D Grid Transposition ($M \times N \to N \times M$) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./0867-transpose-matrix/solution.java) |
| 🔲 **[1314. Matrix Block Sum](./1314-matrix-block-sum/)** | LeetCode | 🟡 Medium | 2D Prefix Sum (Inclusion-Exclusion) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./1314-matrix-block-sum/solution.java) |
| 🗣️ **[1704. Determine if String Halves Are Alike](./1704-determine-if-string-halves-are-alike/)** | LeetCode | 🟢 Easy | Two-Pointer Symmetric Vowel Counting | $O(N)$ | $O(1)$ | [Java](./1704-determine-if-string-halves-are-alike/solution.java) |
| ⚖️ **[Compare the Triplets](./compare-the-triplets/)** | HackerRank | 🟢 Easy | Linear Parallel Comparison | $O(1)$ | $O(1)$ | [Java](./compare-the-triplets/solution.java) |
| 📐 **[Diagonal Difference](./diagonal-difference/)** | HackerRank | 🟢 Easy | Primary & Secondary Diagonal Sums | $O(N)$ | $O(1)$ | [Java](./diagonal-difference/solution.java) |
| 🌀 **[Matrix Layer Rotation](./matrix-rotation-algo/)** | HackerRank | 🟡 Medium | Concentric Ring Extraction & Modulo Shift | $O(M \cdot N)$ | $O(M + N)$ | [Java](./matrix-rotation-algo/solution.java) |
| ✖️ **[Multiply 2 Matrices](./multiply-2-matrices4144/)** | GeeksforGeeks | 🟡 Medium | 3-Loop Matrix Product ($R_1 \times C_1 \times C_2$) | $O(N^3)$ | $O(N^2)$ | [Java](./multiply-2-matrices4144/solution.java) |
| ⏰ **[Time Conversion](./time-conversion/)** | HackerRank | 🟢 Easy | 12-Hour AM/PM to 24-Hour Parsing | $O(1)$ | $O(1)$ | [Java](./time-conversion/solution.java) |
| 🔤 **[Two Strings](./two-strings/)** | HackerRank | 🟢 Easy | Character Frequency Set Intersection | $O(A+B)$ | $O(1)$ | [Java](./two-strings/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Contains Duplicate (0217)](./0217-contains-duplicate/)
- **Core Concept:** Insert elements into a `HashSet<Integer>`. If `set.add(num)` returns false, an immediate duplicate is detected.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 2. [Move Zeroes (0283)](./0283-move-zeroes/)
- **Core Concept:** Maintain non-zero write pointer `lastNonZeroFoundAt`. Swap or overwrite non-zero values forward, then fill remaining indices with zeros.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 3. [Transpose Matrix (0867)](./0867-transpose-matrix/)
- **Core Concept:** Allocate result matrix of size $N \times M$. Assign $\text{transposed}[c][r] = \text{matrix}[r][c]$.
- **Complexity:** $O(M \cdot N)$ Time &nbsp;\|&nbsp; $O(M \cdot N)$ Space.

### 4. [Matrix Block Sum (1314)](./1314-matrix-block-sum/)
- **Core Concept:** Build 2D prefix sum table $P$. For each $(r, c)$, query bounded subgrid $[r-k \dots r+k] \times [c-k \dots c+k]$ using inclusion-exclusion.
- **Complexity:** $O(M \cdot N)$ Time &nbsp;\|&nbsp; $O(M \cdot N)$ Space.

### 5. [Determine if String Halves Are Alike (1704)](./1704-determine-if-string-halves-are-alike/)
- **Core Concept:** Split string in half. Count vowels in left and right halves simultaneously and compare.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 6. [Compare the Triplets](./compare-the-triplets/)
- **Core Concept:** Iterate 3 fixed indices comparing scores $a[i]$ and $b[i]$ to increment respective point totals.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 7. [Diagonal Difference](./diagonal-difference/)
- **Core Concept:** For an $N \times N$ matrix, sum elements at $A[i][i]$ (primary) and $A[i][N-1-i]$ (secondary), then return $|\text{primary} - \text{secondary}|$.
- **Complexity:** $O(N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 8. [Matrix Layer Rotation](./matrix-rotation-algo/)
- **Core Concept:** Extract each rectangular ring into a flat 1D array of perimeter $2(R + C - 2)$. Shift elements by $r \pmod{\text{perimeter}}$ and map back to matrix coordinates.
- **Complexity:** $O(M \cdot N)$ Time &nbsp;\|&nbsp; $O(M + N)$ Space.

### 9. [Multiply 2 Matrices](./multiply-2-matrices4144/)
- **Core Concept:** Multiply matrices $A (R_1 \times C_1)$ and $B (C_1 \times C_2)$ using nested loops: $C[i][j] += A[i][k] \times B[k][j]$.
- **Complexity:** $O(R_1 \cdot C_1 \cdot C_2)$ Time &nbsp;\|&nbsp; $O(R_1 \cdot C_2)$ Space.

### 10. [Time Conversion](./time-conversion/)
- **Core Concept:** Parse 12-hour string (e.g. `12:45:54PM`), convert hours (handling `12 AM -> 00` and `12 PM -> 12`), and format to 24-hour string.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 11. [Two Strings](./two-strings/)
- **Core Concept:** Populate a `boolean[26]` frequency presence array with characters from string $A$. Check if any character in string $B$ exists in the array.
- **Complexity:** $O(A+B)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

---

## 📊 Week 4 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **11** |
| **LeetCode** | 5 |
| **HackerRank** | 5 |
| **GeeksforGeeks** | 1 |
| **Difficulty Breakdown** | 🟢 Easy: 7 &nbsp;\|&nbsp; 🟡 Medium: 4 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Primary Focus** | 2D Matrices, 2D Prefix Sums, Ring Rotations, Bitsets |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-4/1314-matrix-block-sum

# Compile and execute
javac solution.java
java Solution
```

---

<div align="center">

[⬅️ Back to Week 3](../Week-3/README.md) &nbsp;•&nbsp; [🏠 Main README](../README.md) &nbsp;•&nbsp; [➡️ Next: Week 5](../Week-5/README.md)

</div>
