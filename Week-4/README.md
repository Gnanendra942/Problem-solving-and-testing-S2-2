# 🚀 Week 4: 2D Matrices, Subgrid Sums, Duplicates & Transformations

Welcome to **Week 4** of the Problem Solving and Testing journey! This week is dedicated to mastering 2D grid algorithms, 2D prefix sums (integral images), matrix rotations, diagonal arithmetic, duplicate detection, and time parsing.

---

## 🎯 Learning Objectives & Algorithmic Paradigms

- **2D Prefix Sum Matrix (Integral Image):** Computes subgrid block sums in $O(1)$ query time using the Inclusion-Exclusion Principle on a 2D cumulative sum table.
- **Matrix Layer Unrolling & Ring Rotation:** Unrolls concentric rectangular matrix perimeters into 1D rings, applies rotation via modulo arithmetic $(i + r) \pmod K$, and writes back in-place.
- **Matrix Multiplication & Transposition:** Implements matrix transposition ($A[i][j] \to A^T[j][i]$) and row-by-column dot products ($R_1 \times C_1 \times C_2$).
- **Diagonal Arithmetic & Matrix Symmetry:** Extracts primary ($i = j$) and secondary ($i + j = N - 1$) diagonals to calculate absolute differences in $O(N)$ time.
- **In-Place Two-Pointer Partitioning:** Moves all zeros to the end of an array while maintaining relative order of non-zero elements with $O(1)$ extra space.
- **Hash Set Uniqueness Checks:** Detects duplicates in linear $O(N)$ time with $O(N)$ auxiliary hash set storage.

---

## 💻 Problems Solved & Java Implementation

### LeetCode Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🔍 **[217. Contains Duplicate](./0217-contains-duplicate/)** | 🟢 Easy | Hash Set Uniqueness / Fast Lookup | $O(N)$ | $O(N)$ | [Java](./0217-contains-duplicate/solution.java) |
| 0️⃣ **[283. Move Zeroes](./0283-move-zeroes/)** | 🟢 Easy | Two Pointers (In-Place Shift) | $O(N)$ | $O(1)$ | [Java](./0283-move-zeroes/solution.java) |
| 🔄 **[867. Transpose Matrix](./0867-transpose-matrix/)** | 🟢 Easy | 2D Grid Transposition ($M \times N \to N \times M$) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./0867-transpose-matrix/solution.java) |
| 🔲 **[1314. Matrix Block Sum](./1314-matrix-block-sum/)** | 🟡 Medium | 2D Prefix Sum Matrix (Inclusion-Exclusion) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./1314-matrix-block-sum/solution.java) |
| 🗣️ **[1704. Determine if String Halves Are Alike](./1704-determine-if-string-halves-are-alike/)** | 🟢 Easy | Two-Pointer Symmetric Vowel Counting | $O(N)$ | $O(1)$ | [Java](./1704-determine-if-string-halves-are-alike/solution.java) |

### HackerRank & GeeksforGeeks Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| ⚖️ **[Compare the Triplets](./compare-the-triplets/)** | 🟢 Easy | Linear Element-wise Comparison | $O(1)$ | $O(1)$ | [Java](./compare-the-triplets/solution.java) |
| 📐 **[Diagonal Difference](./diagonal-difference/)** | 🟢 Easy | Primary & Secondary Diagonal Sums | $O(N)$ | $O(1)$ | [Java](./diagonal-difference/solution.java) |
| 🌀 **[Matrix Layer Rotation](./matrix-rotation-algo/)** | 🟡 Medium | Concentric Ring Extraction & Modulo Shift | $O(M \cdot N)$ | $O(M + N)$ | [Java](./matrix-rotation-algo/solution.java) |
| ✖️ **[Multiply 2 Matrices](./multiply-2-matrices4144/)** | 🟡 Medium | 3-Loop Matrix Multiplication ($R_1 \times C_1 \times C_2$) | $O(N^3)$ | $O(N^2)$ | [Java](./multiply-2-matrices4144/solution.java) |
| ⏰ **[Time Conversion](./time-conversion/)** | 🟢 Easy | 12-Hour AM/PM to 24-Hour String Parsing | $O(1)$ | $O(1)$ | [Java](./time-conversion/solution.java) |
| 🔤 **[Two Strings](./two-strings/)** | 🟢 Easy | Character Frequency Set Intersection | $O(A+B)$ | $O(1)$ | [Java](./two-strings/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **11** |
| **Platforms** | LeetCode (5) · HackerRank (5) · GeeksforGeeks (1) |
| **Difficulty** | 🟢 Easy: 7 &nbsp;\|&nbsp; 🟡 Medium: 4 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 4 completed successfully!*

</div>
