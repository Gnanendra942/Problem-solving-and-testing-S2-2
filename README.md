<div align="center">

# ⚡ Algorithmic Problem Solving & Software Testing in Java

**A master-level repository documenting 55+ production-grade algorithmic implementations, data structure designs, and software testing paradigms across a rigorous 6-week curriculum.**

---

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Roadmap](https://img.shields.io/badge/Roadmap-6_Weeks_Completed-2ea44f?style=for-the-badge&logo=gitbook&logoColor=white)](#-weekly-roadmap)
[![Total Solved](https://img.shields.io/badge/Problems_Solved-55_Solutions-0969da?style=for-the-badge&logo=codeforces&logoColor=white)](#-week-by-week-curriculum)
[![LeetCode](https://img.shields.io/badge/LeetCode-32_Solved-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-22_Solved-2EC866?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)
[![GeeksforGeeks](https://img.shields.io/badge/GeeksforGeeks-1_Solved-298D46?style=for-the-badge&logo=geeksforgeeks&logoColor=white)](https://www.geeksforgeeks.org/)
[![Testing](https://img.shields.io/badge/Testing-Edge_Case_Hardened-8A2BE2?style=for-the-badge&logo=junit5&logoColor=white)](#-software-testing--edge-case-engineering)

<br/>

[📖 Overview](#-overview) • [📊 Metrics](#-summary-statistics) • [🧠 Algorithm Deep-Dives](#-core-algorithmic-concepts-deep-dive-weeks-1--6) • [📚 Curriculum](#-week-by-week-curriculum) • [🧪 Testing](#-software-testing--edge-case-engineering) • [⚙️ Quickstart](#-getting-started--local-execution)

</div>

---

## 📖 Overview

This repository represents an intensive, comprehensive engineering catalog of **Problem Solving and Software Testing** built entirely with **modern Java (Java 17+)**. Designed with a dual focus on **theoretical mathematical rigor** and **production software engineering standards**, each solution emphasizes:

1. **Asymptotic Optimality:** Every algorithm targets the theoretical lower bound in time complexity—favoring single-pass $O(N)$ sliding windows, $O(N)$ linear dynamic programming, and $O(N)$ linear prefix matching over naive brute-force formulations.
2. **Memory Efficiency:** Active prioritization of in-place pointer mutations and $O(1)$ auxiliary memory footprint wherever data retention constraints permit.
3. **Defensive Edge-Case Hardening:** Explicit handling of null references, arithmetic overflow ($[-2^{31}, 2^{31}-1]$), circular boundary wraps, floating-point precision, and parity anomalies.
4. **Clean Code & Modular Testing:** Idiomatic Java code structures leveraging modern language features (lambdas, method references, generic comparators, and standard stream pipelines).

---

## 📊 Summary Statistics

<div align="center">

| Platform | 🟢 Easy | 🟡 Medium | 🔴 Hard | Total Solutions | Platform Share |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **LeetCode** | 18 | 14 | 0 | **32** | 58.2% |
| **HackerRank** | 8 | 13 | 1 | **22** | 40.0% |
| **GeeksforGeeks** | 0 | 1 | 0 | **1** | 1.8% |
| **Total Track** | **26** (47.3%) | **28** (50.9%) | **1** (1.8%) | **55** | **100% Complete** |

</div>

```text
Difficulty Distribution:
🟢 Easy:   ████████████████████ (47.3% - 26 Problems)
🟡 Medium: █████████████████████ (50.9% - 28 Problems)
🔴 Hard:   █ (1.8% - 1 Problem)

Curriculum Completion: [==================================================] 100% (55/55)
```

---

## 🗺️ Weekly Roadmap

| Week | Focus Area | Core Algorithmic Concepts | Problems | Status |
| :---: | :--- | :--- | :---: | :---: |
| [**Week 1**](./Week-1/README.md) | **Arrays, Sorting Basics & Lambdas** | 1D Prefix Sums, Symmetrical Two-Pointers, Custom Comparators, Lambda Expressions | 7 | ✅ Complete |
| [**Week 2**](./Week-2/README.md) | **In-Place Ops & Frequency Mapping** | Read/Write In-Place Pointers, Anagram Hash Signatures, Kadane's DP, Top-K Heaps | 8 | ✅ Complete |
| [**Week 3**](./Week-3/README.md) | **Collections & Priority Queues** | PriorityQueues, Transitive String Sorting, State Machine Simulation, Date/Time Math | 10 | ✅ Complete |
| [**Week 4**](./Week-4/README.md) | **2D Matrices & Transformations** | 2D Integral Images (Inclusion-Exclusion), Concentric Ring Rotations, Transpositions | 11 | ✅ Complete |
| [**Week 5**](./Week-5/README.md) | **Subarrays, DP & State Machines** | Circular Kadane's Optimization, Dynamic Sliding Windows, Deterministic Finite Automata | 9 | ✅ Complete |
| [**Week 6**](./Week-6/README.md) | **Advanced Strings & Palindromes** | Expand Around Center, String Periodicity Invariance, Linear Z-Algorithm Matching | 10 | ✅ Complete |
| **Total** | **Comprehensive 6-Week Program** | **Full Applied Data Structures & Algorithms Syllabus** | **55** | **100% Verified** |

---

## 🧠 Core Algorithmic Concepts Deep-Dive (Weeks 1 – 6)

This section highlights key algorithmic paradigms developed throughout the curriculum, complete with mathematical intuition, structural diagrams, and canonical Java implementations.

---

### 🔹 Week 1: Symmetrical Two-Pointer Convergence & Prefix Balance

#### 1. Symmetrical Two-Pointer Convergence
*Applied in:* `squares-of-a-sorted-array`

When squaring numbers in a sorted array containing negative and positive integers, the greatest squares naturally reside at the extremes (the most negative values and the largest positive values). Rather than sorting after squaring ($O(N \log N)$), we maintain two pointers at opposite ends and populate the output array backwards in linear time.

```text
Input:  [-4, -1,  0,  3, 10]
          ^               ^
        left            right
Compare: |-4| vs |10| -> 10^2 = 100 is larger -> place at tail, right--
        [-4, -1,  0,  3, 10]
          ^           ^
        left        right
Compare: |-4| vs |3|  -> (-4)^2 = 16 is larger -> place at tail-1, left++
Result: [ 0,  1,  9, 16, 100]  --> Time: O(N), Auxiliary Space: O(1) [excluding output]
```

```java
public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int left = 0, right = n - 1, pos = n - 1;

    while (left <= right) {
        int leftSq = nums[left] * nums[left];
        int rightSq = nums[right] * nums[right];
        if (leftSq > rightSq) {
            result[pos--] = leftSq;
            left++;
        } else {
            result[pos--] = rightSq;
            right--;
        }
    }
    return result;
}
```

#### 2. Prefix Equilibrium Index (Pivot Balance)
*Applied in:* `find-pivot-index`

To find the equilibrium index without nested summations ($O(N^2)$), compute the total sum once. During a single linear traversal, the sum of elements strictly to the right of index $i$ is derived instantly using:

$$\text{rightSum} = \text{totalSum} - \text{leftSum} - \text{nums}[i]$$

Equilibrium occurs when $\text{leftSum} == \text{rightSum}$.

---

### 🔹 Week 2: In-Place Fast/Slow Partitioning & Frequency Signatures

#### 1. In-Place Fast/Slow Pointer Mutation
*Applied in:* `remove-duplicates-from-sorted-array`, `remove-element`, `0283-move-zeroes`

Modifying arrays without additional allocations requires partitioning the memory space into a "valid/processed zone" and an "exploration zone":
- **Slow Pointer (`writeIndex`):** Marks the boundary of processed valid elements.
- **Fast Pointer (`readIndex`):** Scans forward looking for qualifying elements.

```text
Array: [1, 1, 2, 2, 3]
        ^  ^
      slow fast (nums[fast] == nums[slow] -> skip)
Array: [1, 1, 2, 2, 3]
        ^     ^
      slow   fast (nums[fast] != nums[slow] -> slow++, copy nums[fast])
```

#### 2. Canonical Signature Grouping
*Applied in:* `group-anagrams`

Two strings are anagrams if and only if their character distributions are identical. Instead of pairwise comparisons ($O(N^2)$), generate a canonical representation for each string:
- **Approach A (Sorting):** Sort characters lexicographically $\to O(K \log K)$ per word.
- **Approach B (Frequency Vector):** Build a 26-character count string like `#1#0#2...` $\to O(K)$ per word.

---

### 🔹 Week 3: Custom Transitive Ordering & Heap Priority Queues

#### 1. Transitive Concatenation Sorting for Extremal Numbers
*Applied in:* `0179-largest-number`

Arranging non-negative integers to form the largest possible concatenated number cannot rely on standard integer or alphabetical order (e.g., `3` must precede `30` because `330 > 303`).

$$\text{Comparator Order: } A \prec B \iff (B + A) > (A + B)$$

```java
// Comparator enforces strict weak ordering over concatenation
Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));

// Edge Case Defense: If highest significant element is "0", result is "0"
if (array[0].equals("0")) return "0";
```

> [!NOTE]
> **Mathematical Proof of Transitivity:** If $(a+b) \ge (b+a)$ and $(b+c) \ge (c+b)$, then $(a+c) \ge (c+a)$. This guarantees the sorting algorithm converges to a globally maximal number in $O(N \log N \cdot L)$ time.

#### 2. Multi-Tier Composite Priority Queue Scheduling
*Applied in:* `java-priority-queue`, `java-sort`, `java-comparator`

Complex domain entities require stable multi-attribute priority queues. For example, student queuing orders:
1. Higher CGPA first (descending).
2. Alphabetical by Name if CGPA ties (ascending).
3. Ascending by ID if both CGPA and Name tie.

```java
PriorityQueue<Student> pq = new PriorityQueue<>(
    Comparator.comparingDouble(Student::getCgpa).reversed()
              .thenComparing(Student::getName)
              .thenComparingInt(Student::getId)
);
```

---

### 🔹 Week 4: 2D Prefix Sums (Integral Images) & Matrix Layer Rotations

#### 1. 2D Prefix Sum Matrix (Inclusion-Exclusion Principle)
*Applied in:* `1314-matrix-block-sum`

Calculating the sum of an arbitrary rectangular subgrid $[(r_1, c_1) \dots (r_2, c_2)]$ in an $M \times N$ matrix naively costs $O(M \cdot N)$ per query. By precomputing a 2D prefix table $P$ in $O(M \cdot N)$ time, any subgrid sum is answered in strictly **$O(1)$ time**:

$$\text{Sum}(r_1, c_1, r_2, c_2) = P[r_2+1][c_2+1] - P[r_1][c_2+1] - P[r_2+1][c_1] + P[r_1][c_1]$$

```text
(0,0)--------------+--------------------+
|                  |                    |
|       +----------(r1, c1)             |
|       |          |      |             |
|       |   Subgrid Region|             |
|       |          |      |             |
+-------+----------+------(r2, c2)------+
|       |                               |
+-------+-------------------------------+
Formula: Total(r2, c2) - TopStrip - LeftStrip + OverlappedCorner
```

#### 2. Concentric Matrix Layer Peeling & Ring Rotations
*Applied in:* `matrix-rotation-algo`

For an $M \times N$ matrix rotated anti-clockwise by $R$ steps:
1. Peel the matrix into $\min(M, N) / 2$ concentric rings.
2. Flatten each ring into a 1D sequence of length $L = 2(M' + N') - 4$.
3. Compute the effective rotational shift: $R_{\text{effective}} = R \pmod L$.
4. Re-inject elements into the matrix at their shifted coordinates in $O(M \cdot N)$ overall time.

---

### 🔹 Week 5: Subarrays, Dynamic Programming & Deterministic State Machines

#### 1. Dual-Kadane's Algorithm for Circular Subarrays
*Applied in:* `0053-maximum-subarray`, `0918-maximum-sum-circular-subarray`, `maxsubarray`

In a circular array, the maximum contiguous sum can either:
- **Case 1 (Non-wrapping):** Be a standard linear subarray (handled by Kadane's maximum algorithm).
- **Case 2 (Wrapping):** Wrap around the array boundary. A maximum wrapping subarray corresponds to the **total array sum minus the minimum contiguous subarray sum**.

```text
Array: [ 5, -3,  5 ] -> Total Sum = 7
Kadane Max Subarray: 5 (non-wrapping)
Kadane Min Subarray: -3
Circular Subarray Candidate: TotalSum - MinSubarray = 7 - (-3) = 10 (wraps [5, ..., 5])
Final Result: max(5, 10) = 10
```

```java
public int maxSubarraySumCircular(int[] nums) {
    int totalSum = 0, currMax = 0, maxSum = nums[0], currMin = 0, minSum = nums[0];
    for (int x : nums) {
        currMax = Math.max(x, currMax + x);
        maxSum = Math.max(maxSum, currMax);
        currMin = Math.min(x, currMin + x);
        minSum = Math.min(minSum, currMin);
        totalSum += x;
    }
    // Defensive check: If all elements are negative, return maximum single element
    return (maxSum > 0) ? Math.max(maxSum, totalSum - minSum) : maxSum;
}
```

#### 2. Deterministic State Machine (DFA) Parsing
*Applied in:* `0008-string-to-integer-atoi`

Robust numeric parsing requires deterministic state transitions with strict overflow bounds ($[-2^{31}, 2^{31}-1]$):

```text
[State 0: Leading Whitespace] --- ' ' ---> [State 0]
             |
          '+' / '-'
             v
       [State 1: Sign] --- Digit ---> [State 2: Accumulate Digits]
             |                              |
           Digit                          Digit
             |                              |
             +----------------------------> v
                               [Clamp on 32-bit Boundary]
```

---

### 🔹 Week 6: Advanced String Algorithms, Palindromes & Linear Z-Algorithm

#### 1. Linear-Time Z-Algorithm for Pattern Matching
*Applied in:* `string-similarity`

The Z-algorithm computes an array $Z$ where $Z[i]$ is the length of the longest common prefix between $S$ and the suffix of $S$ starting at $i$. It maintains an active matching window $[L, R]$ where $R$ is the rightmost prefix boundary discovered so far, achieving strict **$O(N)$ linear time**.

```text
String:   a  a  b  x  a  a  b  a  a  b
Index:    0  1  2  3  4  5  6  7  8  9
Z-Array: [X, 1, 0, 0, 3, 1, 0, 3, 1, 0]
```

```java
public static long stringSimilarity(String s) {
    int n = s.length();
    char[] str = s.toCharArray();
    int[] z = new int[n];
    long totalSimilarity = n; // Similarity of s with itself is n

    int l = 0, r = 0;
    for (int i = 1; i < n; i++) {
        if (i <= r) {
            z[i] = Math.min(r - i + 1, z[i - l]);
        }
        while (i + z[i] < n && str[z[i]] == str[i + z[i]]) {
            z[i]++;
        }
        if (i + z[i] - 1 > r) {
            l = i;
            r = i + z[i] - 1;
        }
        totalSimilarity += z[i];
    }
    return totalSimilarity;
}
```

#### 2. String Periodicity Invariance & Doubling Technique
*Applied in:* `0796-rotate-string`, `0459-repeated-substring-pattern`

- **String Rotation Check:** String $B$ is a valid rotation of $A$ if and only if $|A| == |B|$ and $(A + A)$ contains $B$.
- **Repeated Substring Validation:** String $S$ of length $N$ consists of a repeated substring if and only if $S$ appears inside $(S + S)[1 \dots 2N - 2]$.

#### 3. Expand-Around-Center for Palindromic Discovery
*Applied in:* `0005-longest-palindromic-substring`, `palindrome-index`, `circular-palindromes`

Every palindrome has a center. For a string of length $N$, there are exactly $2N - 1$ possible centers (odd-length palindromes centered at $i$, and even-length palindromes centered between $i$ and $i+1$). Expanding symmetrically around each center avoids the $O(N^3)$ substring extraction cost and operates in $O(1)$ auxiliary space.

---

## 📚 Week-by-Week Curriculum

### 🔹 Week 1: Arrays, Sorting Basics & Java Lambdas

> **Focus:** 1D prefix sums, two-pointer boundaries, multi-attribute custom ordering, and functional lambda interfaces.  
> 📖 **Deep Dive:** [Week 1 README](./Week-1/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Source Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| ⚖️ **[724. Find Pivot Index](./Week-1/find-pivot-index/)** | LeetCode | 🟢 Easy | Prefix Sum / Equilibrium Balance | $O(N)$ | $O(1)$ | [Java](./Week-1/find-pivot-index/solution.java) |
| 🔄 **[Java Comparator](./Week-1/java-comparator/)** | HackerRank | 🟡 Medium | `Comparator<Player>` / Composite Sort | $O(N \log N)$ | $O(1)$ | [Java](./Week-1/java-comparator/solution.java) |
| ⚡ **[Java Lambda Expressions](./Week-1/java-lambda-expressions/)** | HackerRank | 🟡 Medium | `@FunctionalInterface` Predicate Factories | $O(T \sqrt{N})$ | $O(1)$ | [Java](./Week-1/java-lambda-expressions/solution.java) |
| 📊 **[Java Sort](./Week-1/java-sort/)** | HackerRank | 🟢 Easy | Multi-key Object Sorting | $O(N \log N)$ | $O(1)$ | [Java](./Week-1/java-sort/solution.java) |
| 💰 **[1672. Richest Customer Wealth](./Week-1/richest-customer-wealth/)** | LeetCode | 🟢 Easy | 2D Grid Traversal / Row Max Sum | $O(M \cdot N)$ | $O(1)$ | [Java](./Week-1/richest-customer-wealth/solution.java) |
| ➕ **[1480. Running Sum of 1d Array](./Week-1/running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | 1D Prefix Accumulation | $O(N)$ | $O(1)$ | [Java](./Week-1/running-sum-of-1d-array/solution.java) |
| 🔲 **[977. Squares of a Sorted Array](./Week-1/squares-of-a-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers / Symmetrical Convergence | $O(N)$ | $O(N)$ | [Java](./Week-1/squares-of-a-sorted-array/solution.java) |

---

### 🔹 Week 2: In-Place Operations, Frequency Mapping & Sliding Patterns

> **Focus:** In-place pointer mutation, canonical anagram hashing, Kadane's linear DP, and heap frequency filtering.  
> 📖 **Deep Dive:** [Week 2 README](./Week-2/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Source Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🏔️ **[1732. Find the Highest Altitude](./Week-2/find-the-highest-altitude/)** | LeetCode | 🟢 Easy | Prefix Net Altitude Tracking | $O(N)$ | $O(1)$ | [Java](./Week-2/find-the-highest-altitude/solution.java) |
| 🔤 **[49. Group Anagrams](./Week-2/group-anagrams/)** | LeetCode | 🟡 Medium | Canonical Key Hash Map Grouping | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | [Java](./Week-2/group-anagrams/solution.java) |
| 📈 **[53. Maximum Subarray](./Week-2/maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Dynamic Programming | $O(N)$ | $O(1)$ | [Java](./Week-2/maximum-subarray/solution.java) |
| ✂️ **[26. Remove Duplicates from Sorted Array](./Week-2/remove-duplicates-from-sorted-array/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Overwrite) | $O(N)$ | $O(1)$ | [Java](./Week-2/remove-duplicates-from-sorted-array/solution.java) |
| 🗑️ **[27. Remove Element](./Week-2/remove-element/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Partitioning) | $O(N)$ | $O(1)$ | [Java](./Week-2/remove-element/solution.java) |
| ➕ **[1480. Running Sum of 1d Array](./Week-2/running-sum-of-1d-array/)** | LeetCode | 🟢 Easy | In-Place Prefix Accumulation | $O(N)$ | $O(1)$ | [Java](./Week-2/running-sum-of-1d-array/solution.java) |
| 🔀 **[1470. Shuffle the Array](./Week-2/shuffle-the-array/)** | LeetCode | 🟢 Easy | Index Interleaving $(x_i, y_i)$ | $O(N)$ | $O(N)$ | [Java](./Week-2/shuffle-the-array/solution.java) |
| 🔝 **[347. Top K Frequent Elements](./Week-2/top-k-frequent-elements/)** | LeetCode | 🟡 Medium | Frequency Map + Min-Heap / Bucket Sort | $O(N \log K)$ | $O(N)$ | [Java](./Week-2/top-k-frequent-elements/solution.java) |

---

### 🔹 Week 3: Java Collections, Priority Queues & Date/Time Logic

> **Focus:** Java Collections Framework, custom concatenation sorting, event scheduling queues, and Gregorian calendar math.  
> 📖 **Deep Dive:** [Week 3 README](./Week-3/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Source Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔢 **[179. Largest Number](./Week-3/0179-largest-number/)** | LeetCode | 🟡 Medium | Custom Transitive Concatenation Sort | $O(N \log N \cdot L)$ | $O(N \cdot L)$ | [Java](./Week-3/0179-largest-number/solution.java) |
| 🔠 **[451. Sort Characters By Frequency](./Week-3/0451-sort-characters-by-frequency/)** | LeetCode | 🟡 Medium | Frequency Map + Max-Heap Rebuild | $O(N + K \log K)$ | $O(N)$ | [Java](./Week-3/0451-sort-characters-by-frequency/solution.java) |
| 📅 **[1154. Day of the Year](./Week-3/1154-day-of-the-year/)** | LeetCode | 🟢 Easy | Leap Year Logic & Cumulative Days | $O(1)$ | $O(1)$ | [Java](./Week-3/1154-day-of-the-year/solution.java) |
| 🗓️ **[1185. Day of the Week](./Week-3/1185-day-of-the-week/)** | LeetCode | 🟢 Easy | Zeller's Congruence / Sakamoto Algorithm | $O(1)$ | $O(1)$ | [Java](./Week-3/1185-day-of-the-week/solution.java) |
| 🏷️ **[1357/1459. Apply Discount Every n Orders](./Week-3/1459-apply-discount-every-n-orders/)** | LeetCode | 🟡 Medium | OOP Design & Stateful Map Operations | $O(P)$ / call | $O(P)$ | [Java](./Week-3/1459-apply-discount-every-n-orders/solution.java) |
| 📑 **[Java 1D/2D ArrayList](./Week-3/java-arraylist/)** | HackerRank | 🟢 Easy | Jagged Dynamic List Indexing | $O(N + Q)$ | $O(N)$ | [Java](./Week-3/java-arraylist/solution.java) |
| ⚔️ **[Java Comparator](./Week-3/java-comparator/)** | HackerRank | 🟡 Medium | Multi-Attribute Comparator Ordering | $O(N \log N)$ | $O(1)$ | [Java](./Week-3/java-comparator/solution.java) |
| ⏰ **[Java Date and Time](./Week-3/java-date-and-time/)** | HackerRank | 🟢 Easy | `LocalDate` / `Calendar` Computations | $O(1)$ | $O(1)$ | [Java](./Week-3/java-date-and-time/solution.java) |
| 🏅 **[Java Priority Queue](./Week-3/java-priority-queue/)** | HackerRank | 🟡 Medium | `PriorityQueue<Student>` Event Processing | $O(N \log N)$ | $O(N)$ | [Java](./Week-3/java-priority-queue/solution.java) |
| 🎓 **[Java Sort](./Week-3/java-sort/)** | HackerRank | 🟢 Easy | Multi-field Student Entity Sorting | $O(N \log N)$ | $O(1)$ | [Java](./Week-3/java-sort/solution.java) |

---

### 🔹 Week 4: 2D Matrices, Subgrid Sums & Transformations

> **Focus:** 2D prefix sums (integral images), concentric ring rotations, diagonal matrices, and 3-loop matrix multiplication.  
> 📖 **Deep Dive:** [Week 4 README](./Week-4/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Source Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔍 **[217. Contains Duplicate](./Week-4/0217-contains-duplicate/)** | LeetCode | 🟢 Easy | HashSet Lookups / Distinct Tracking | $O(N)$ | $O(N)$ | [Java](./Week-4/0217-contains-duplicate/solution.java) |
| 0️⃣ **[283. Move Zeroes](./Week-4/0283-move-zeroes/)** | LeetCode | 🟢 Easy | Two Pointers (In-Place Shift) | $O(N)$ | $O(1)$ | [Java](./Week-4/0283-move-zeroes/solution.java) |
| 🔄 **[867. Transpose Matrix](./Week-4/0867-transpose-matrix/)** | LeetCode | 🟢 Easy | 2D Grid Transposition ($M \times N \to N \times M$) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./Week-4/0867-transpose-matrix/solution.java) |
| 🔲 **[1314. Matrix Block Sum](./Week-4/1314-matrix-block-sum/)** | LeetCode | 🟡 Medium | 2D Prefix Sum (Inclusion-Exclusion) | $O(M \cdot N)$ | $O(M \cdot N)$ | [Java](./Week-4/1314-matrix-block-sum/solution.java) |
| 🗣️ **[1704. Determine if String Halves Are Alike](./Week-4/1704-determine-if-string-halves-are-alike/)** | LeetCode | 🟢 Easy | Symmetric Two-Pointer Vowel Counting | $O(N)$ | $O(1)$ | [Java](./Week-4/1704-determine-if-string-halves-are-alike/solution.java) |
| ⚖️ **[Compare the Triplets](./Week-4/compare-the-triplets/)** | HackerRank | 🟢 Easy | Element-by-Element Vector Comparison | $O(1)$ | $O(1)$ | [Java](./Week-4/compare-the-triplets/solution.java) |
| 📐 **[Diagonal Difference](./Week-4/diagonal-difference/)** | HackerRank | 🟢 Easy | Single-Pass Primary/Secondary Diagonals | $O(N)$ | $O(1)$ | [Java](./Week-4/diagonal-difference/solution.java) |
| 🌀 **[Matrix Layer Rotation](./Week-4/matrix-rotation-algo/)** | HackerRank | 🟡 Medium | Concentric Ring Peeling & Modulo Shift | $O(M \cdot N)$ | $O(M + N)$ | [Java](./Week-4/matrix-rotation-algo/solution.java) |
| ✖️ **[Multiply 2 Matrices](./Week-4/multiply-2-matrices4144/)** | GeeksforGeeks | 🟡 Medium | Canonical 3-Loop Matrix Multiplication | $O(N^3)$ | $O(N^2)$ | [Java](./Week-4/multiply-2-matrices4144/solution.java) |
| ⏰ **[Time Conversion](./Week-4/time-conversion/)** | HackerRank | 🟢 Easy | 12-Hour to 24-Hour Military Format Parsing | $O(1)$ | $O(1)$ | [Java](./Week-4/time-conversion/solution.java) |
| 🔤 **[Two Strings](./Week-4/two-strings/)** | HackerRank | 🟢 Easy | Character Frequency Set Intersection | $O(A+B)$ | $O(1)$ | [Java](./Week-4/two-strings/solution.java) |

---

### 🔹 Week 5: Subarrays, Dynamic Programming & State Machines

> **Focus:** Contiguous subarray optimizations, circular Kadane DP, dynamic sliding windows, deterministic state automata, and isomorphic hashing.  
> 📖 **Deep Dive:** [Week 5 README](./Week-5/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Source Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🪟 **[3. Longest Substring Without Repeating Characters](./Week-5/0003-longest-substring-without-repeating-characters/)** | LeetCode | 🟡 Medium | Dynamic Sliding Window + Last-Seen Set | $O(N)$ | $O(\min(N, \Sigma))$ | [Java](./Week-5/0003-longest-substring-without-repeating-characters/solution.java) |
| 🔢 **[8. String to Integer (atoi)](./Week-5/0008-string-to-integer-atoi/)** | LeetCode | 🟡 Medium | Deterministic State Machine + Clamping | $O(N)$ | $O(1)$ | [Java](./Week-5/0008-string-to-integer-atoi/solution.java) |
| 📈 **[53. Maximum Subarray](./Week-5/0053-maximum-subarray/)** | LeetCode | 🟡 Medium | Kadane's Dynamic Programming | $O(N)$ | $O(1)$ | [Java](./Week-5/0053-maximum-subarray/solution.java) |
| 🔠 **[890. Find and Replace Pattern](./Week-5/0890-find-and-replace-pattern/)** | LeetCode | 🟡 Medium | Bijective Character Mapping Normalization | $O(N \cdot K)$ | $O(K)$ | [Java](./Week-5/0890-find-and-replace-pattern/solution.java) |
| 🔄 **[918. Maximum Sum Circular Subarray](./Week-5/0918-maximum-sum-circular-subarray/)** | LeetCode | 🟡 Medium | Dual Kadane (Max Subarray & Total - Min) | $O(N)$ | $O(1)$ | [Java](./Week-5/0918-maximum-sum-circular-subarray/solution.java) |
| 🔍 **[1408. String Matching in an Array](./Week-5/1408-string-matching-in-an-array/)** | LeetCode | 🟢 Easy | Brute-Force Substring Search | $O(N^2 \cdot L)$ | $O(1)$ | [Java](./Week-5/1408-string-matching-in-an-array/solution.java) |
| ✂️ **[Alternating Characters](./Week-5/alternating-characters/)** | HackerRank | 🟢 Easy | Greedy Adjacent Scan Deletions | $O(N)$ | $O(1)$ | [Java](./Week-5/alternating-characters/solution.java) |
| 📊 **[The Maximum Subarray](./Week-5/maxsubarray/)** | HackerRank | 🟡 Medium | Kadane's DP + Greedy Subsequence Sum | $O(N)$ | $O(1)$ | [Java](./Week-5/maxsubarray/solution.java) |
| 🍫 **[Subarray Division (Birthday Bar)](./Week-5/the-birthday-bar/)** | HackerRank | 🟢 Easy | Fixed-Width Sliding Window Accumulator | $O(N)$ | $O(1)$ | [Java](./Week-5/the-birthday-bar/solution.java) |

---

### 🔹 Week 6: Advanced String Algorithms, Palindromes & Sliding Window

> **Focus:** Center-expansion palindromes, linear Z-algorithm matching, frequency-vector sliding windows, and string periodicity invariance.  
> 📖 **Deep Dive:** [Week 6 README](./Week-6/README.md)

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time | Space | Source Code |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🪞 **[5. Longest Palindromic Substring](./Week-6/0005-longest-palindromic-substring/)** | LeetCode | 🟡 Medium | Expand Around Center ($2N-1$ Centers) | $O(N^2)$ | $O(1)$ | [Java](./Week-6/0005-longest-palindromic-substring/solution.java) |
| 📍 **[28. Find Index of First Occurrence](./Week-6/0028-find-the-index-of-the-first-occurrence-in-a-string/)** | LeetCode | 🟢 Easy | Sliding Window / Rolling Substring Match | $O((N-M+1)M)$ | $O(1)$ | [Java](./Week-6/0028-find-the-index-of-the-first-occurrence-in-a-string/solution.java) |
| 🔠 **[438. Find All Anagrams in a String](./Week-6/0438-find-all-anagrams-in-a-string/)** | LeetCode | 🟡 Medium | Fixed 26-Bucket Frequency Sliding Window | $O(N)$ | $O(1)$ | [Java](./Week-6/0438-find-all-anagrams-in-a-string/solution.java) |
| 🔁 **[459. Repeated Substring Pattern](./Week-6/0459-repeated-substring-pattern/)** | LeetCode | 🟢 Easy | Concatenation Invariance ($(S+S)[1..2N-2]$) | $O(N)$ | $O(N)$ | [Java](./Week-6/0459-repeated-substring-pattern/solution.java) |
| 🔄 **[796. Rotate String](./Week-6/0796-rotate-string/)** | LeetCode | 🟢 Easy | Doubled String Containment ($(A+A)$) | $O(N)$ | $O(N)$ | [Java](./Week-6/0796-rotate-string/solution.java) |
| 🔄 **[Circular Palindromes](./Week-6/circular-palindromes/)** | HackerRank | 🔴 Hard | Rotation-Invariant Palindrome Search | $O(N \log N)$ | $O(N \log N)$ | [Java](./Week-6/circular-palindromes/solution.java) |
| 📡 **[Mars Exploration](./Week-6/mars-exploration/)** | HackerRank | 🟢 Easy | Modulo-3 Periodic Pattern Matching | $O(N)$ | $O(1)$ | [Java](./Week-6/mars-exploration/solution.java) |
| 🧩 **[Palindrome Index](./Week-6/palindrome-index/)** | HackerRank | 🟢 Easy | Two-Pointer Lookahead Mismatch Repair | $O(N)$ | $O(1)$ | [Java](./Week-6/palindrome-index/solution.java) |
| ⚡ **[String Similarity](./Week-6/string-similarity/)** | HackerRank | 🟡 Medium | Z-Algorithm (Longest Common Prefix Array) | $O(N)$ | $O(N)$ | [Java](./Week-6/string-similarity/solution.java) |
| 🔤 **[Two Strings](./Week-6/two-strings/)** | HackerRank | 🟢 Easy | Bitmask / Character Set Matching | $O(A+B)$ | $O(1)$ | [Java](./Week-6/two-strings/solution.java) |

---

## 🧪 Software Testing & Edge-Case Engineering

Software testing is an integral pillar of this repository. Solutions are engineered with comprehensive edge-case validation suites to guarantee correctness across all input profiles.

### 🛡️ Core Testing Checklists

```text
┌─────────────────────────────────────────────────────────────────────────────┐
│                       ALGORITHMIC EDGE-CASE MATRIX                          │
├───────────────────────┬─────────────────────────────────────────────────────┤
│ Category              │ Verification Scenarios                              │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Empty & Single-Item   │ - Null arrays, length 0, length 1                   │
│                       │ - Strings with single character or empty string ""  │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Numeric Boundaries    │ - Integer.MAX_VALUE (2147483647), Integer.MIN_VALUE │
│                       │ - Long accumulation to prevent 32-bit overflow      │
│                       │ - Leading zeros, negative zero, mixed signs         │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Homogeneity & Dups    │ - All identical elements: [0, 0, 0, 0], "aaaaaa"    │
│                       │ - Strictly ascending vs strictly descending inputs  │
│                       │ - Arrays containing all negative values             │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Boundary Geometry     │ - Circular wrap-arounds connecting index N-1 to 0   │
│                       │ - Out-of-bounds matrix coordinates clamped safely   │
│                       │ - Concentric rings of width 1 (odd dimensions)      │
└───────────────────────┴─────────────────────────────────────────────────────┘
```

### 💡 Unit Test Architecture (JUnit 5 Paradigm)

Every problem can be integrated into a standard JUnit 5 test harness. Below is the test harness pattern used to validate edge cases:

```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionVerificationTest {

    @Test
    @DisplayName("Verify Circular Kadane: All Negatives Handled Without Zero Bug")
    void testCircularKadaneAllNegative() {
        Solution solver = new Solution();
        int[] allNegative = {-3, -2, -3};
        // Expected maximum is -2 (single best negative), NOT 0
        assertEquals(-2, solver.maxSubarraySumCircular(allNegative));
    }

    @Test
    @DisplayName("Verify String to Integer (atoi): Overflow Clamping")
    void testAtoiOverflowClamping() {
        Solution solver = new Solution();
        assertEquals(Integer.MAX_VALUE, solver.myAtoi("91283472332"));
        assertEquals(Integer.MIN_VALUE, solver.myAtoi("-91283472332"));
    }

    @Test
    @DisplayName("Verify Largest Number: All Zero Array Defense")
    void testLargestNumberAllZeroes() {
        Solution solver = new Solution();
        int[] zeroes = {0, 0, 0};
        assertEquals("0", solver.largestNumber(zeroes));
    }
}
```

---

## 🗂️ Repository Structure

```text
Problem-solving-and-testing-S2-2/
├── README.md                                  # Master Repository Documentation
├── Week-1/                                    # Week 1: Arrays, Sorting Basics & Lambdas (7 Problems)
│   ├── README.md                              # Week 1 Overview & Detailed Syllabus
│   ├── find-pivot-index/                      # LeetCode 724
│   │   ├── README.md
│   │   └── solution.java
│   ├── java-comparator/
│   ├── java-lambda-expressions/
│   ├── java-sort/
│   ├── richest-customer-wealth/
│   ├── running-sum-of-1d-array/
│   └── squares-of-a-sorted-array/
├── Week-2/                                    # Week 2: In-Place Ops, Frequency Mapping & Sliding (8 Problems)
│   ├── README.md                              # Week 2 Overview & Detailed Syllabus
│   ├── find-the-highest-altitude/
│   ├── group-anagrams/
│   ├── maximum-subarray/
│   ├── remove-duplicates-from-sorted-array/
│   ├── remove-element/
│   ├── running-sum-of-1d-array/
│   ├── shuffle-the-array/
│   └── top-k-frequent-elements/
├── Week-3/                                    # Week 3: Collections, Priority Queues & Date/Time (10 Problems)
│   ├── README.md                              # Week 3 Overview & Detailed Syllabus
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
├── Week-4/                                    # Week 4: 2D Matrices & Subgrid Sums (11 Problems)
│   ├── README.md                              # Week 4 Overview & Detailed Syllabus
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
├── Week-5/                                    # Week 5: Subarrays, Dynamic Programming & State Machines (9 Problems)
│   ├── README.md                              # Week 5 Overview & Detailed Syllabus
│   ├── 0003-longest-substring-without-repeating-characters/
│   ├── 0008-string-to-integer-atoi/
│   ├── 0053-maximum-subarray/
│   ├── 0890-find-and-replace-pattern/
│   ├── 0918-maximum-sum-circular-subarray/
│   ├── 1408-string-matching-in-an-array/
│   ├── alternating-characters/
│   ├── maxsubarray/
│   └── the-birthday-bar/
└── Week-6/                                    # Week 6: Advanced String Algorithms & Palindromes (10 Problems)
    ├── README.md                              # Week 6 Overview & Detailed Syllabus
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
- **Build Tools (Optional):** Maven or Gradle
- **Recommended IDE:** IntelliJ IDEA / VS Code with Language Support for Java

Verify your Java toolchain:

```bash
java -version
javac -version
```

### Cloning the Repository

```bash
git clone https://github.com/Gnanendra942/Problem-solving-and-testing-S2-2.git
cd Problem-solving-and-testing-S2-2
```

### Compiling & Executing Solutions

Every problem directory contains a standalone `solution.java` file. To execute any solution:

```bash
# Example 1: Run Week 5 Circular Kadane Algorithm
cd "Week-5/0918-maximum-sum-circular-subarray"
javac solution.java
java Solution

# Example 2: Run Week 6 Linear Z-Algorithm (String Similarity)
cd "../../Week-6/string-similarity"
javac solution.java
java Solution
```

---

## 🛡️ Coding Standards & Engineering Best Practices

1. **Deterministic Asymptotic Complexity:** Every solution is written to achieve optimal theoretical bounds. Inefficient nested loops ($O(N^2)$) are refactored into prefix accumulators, two pointers, or sliding windows ($O(N)$).
2. **Minimal Space Footprint:** In-place mutations and primitive arrays (`int[]`, `char[]`) are preferred over wrapper objects (`Integer`, `Character`) to minimize JVM garbage collector pressure.
3. **Defensive Arithmetic:** Multiplications and summations are cast to `long` before assigning or comparing against 32-bit integer thresholds (`Integer.MAX_VALUE`, `Integer.MIN_VALUE`).
4. **Self-Documenting Code:** Clean naming conventions, descriptive variable bindings, and structured method breakdowns ensure readability without extraneous comments.

---

<div align="center">

**Crafted with ☕ and passion for Problem Solving, Algorithms, and Software Engineering.**  
*Continuous learning through deliberate practice.*

</div>
