# 🚀 Week 2: Array Operations, Frequency Mapping & Sliding Patterns

Welcome to **Week 2** of the Problem Solving and Testing journey! This week centers on in-place array transformations, two-pointer boundary filtering, hash map frequency counting, canonical sorting for anagram grouping, and dynamic programming fundamentals (Kadane's algorithm).

---

## 🎯 Learning Objectives & Algorithmic Paradigms

- **Two-Pointer In-Place Filtering:** Modifies arrays in-place with $O(1)$ extra space by maintaining separate read and write pointers (e.g., removing duplicates or specific elements).
- **Anagram Canonicalization:** Uses sorted string signatures and frequency keys in `HashMap<String, List<String>>` to group permutation equivalents in linear-logarithmic time.
- **Kadane's Algorithm (Linear DP):** Tracks current local subarray sums and global maximums in a single $O(N)$ pass with $O(1)$ memory.
- **Frequency Hashing & Top-K Extraction:** Pairs hash map frequency aggregation with min-heaps (`PriorityQueue`) or bucket sort arrays to retrieve top-k elements in optimal $O(N \log K)$ or $O(N)$ time.
- **Prefix Accumulation & Array Interleaving:** Manipulates indices to interleave multi-segment arrays and track peak net altitude gains.

---

## 💻 Problems Solved & Java Implementation

### LeetCode Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🏔️ **[1732. Find the Highest Altitude](./find-the-highest-altitude/)** | 🟢 Easy | Prefix Net Altitude Tracking | $O(N)$ | $O(1)$ | [Java](./find-the-highest-altitude/solution.java) |
| 🔤 **[49. Group Anagrams](./group-anagrams/)** | 🟡 Medium | Hash Map + Sorted Key Canonicalization | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | [Java](./group-anagrams/solution.java) |
| 📈 **[53. Maximum Subarray](./maximum-subarray/)** | 🟡 Medium | Kadane's Dynamic Programming | $O(N)$ | $O(1)$ | [Java](./maximum-subarray/solution.java) |
| ✂️ **[26. Remove Duplicates from Sorted Array](./remove-duplicates-from-sorted-array/)** | 🟢 Easy | Two Pointers (Slow / Fast Pointers) | $O(N)$ | $O(1)$ | [Java](./remove-duplicates-from-sorted-array/solution.java) |
| 🗑️ **[27. Remove Element](./remove-element/)** | 🟢 Easy | Two Pointers (In-Place Partitioning) | $O(N)$ | $O(1)$ | [Java](./remove-element/solution.java) |
| ➕ **[1480. Running Sum of 1d Array](./running-sum-of-1d-array/)** | 🟢 Easy | In-Place Prefix Accumulation | $O(N)$ | $O(1)$ | [Java](./running-sum-of-1d-array/solution.java) |
| 🔀 **[1470. Shuffle the Array](./shuffle-the-array/)** | 🟢 Easy | Index Interleaving $(x_i, y_i)$ | $O(N)$ | $O(N)$ | [Java](./shuffle-the-array/solution.java) |
| 🔝 **[347. Top K Frequent Elements](./top-k-frequent-elements/)** | 🟡 Medium | Frequency Map + Min-Heap / Bucket Sort | $O(N \log K)$ | $O(N)$ | [Java](./top-k-frequent-elements/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **8** |
| **Platforms** | LeetCode (8) |
| **Difficulty** | 🟢 Easy: 5 &nbsp;\|&nbsp; 🟡 Medium: 3 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 2 completed successfully!*

</div>
