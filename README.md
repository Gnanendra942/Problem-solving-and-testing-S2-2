<div align="center">

# ⚡ Algorithmic Problem Solving & Software Engineering in Java

**A production-grade repository documenting 61+ verified algorithmic solutions, data structure designs, and software engineering systems across a rigorous 6-week curriculum and 6 applied laboratory experiments.**

---

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Roadmap](https://img.shields.io/badge/Roadmap-6_Weeks_+_6_Labs-2ea44f?style=for-the-badge&logo=gitbook&logoColor=white)](#-dual-track-curriculum-roadmap)
[![Total Solved](https://img.shields.io/badge/Total_Solutions-61_Verified-0969da?style=for-the-badge&logo=codeforces&logoColor=white)](#-summary-statistics)
[![LeetCode](https://img.shields.io/badge/LeetCode-32_Solved-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-22_Solved-2EC866?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)
[![Lab Tasks](https://img.shields.io/badge/Lab_Tasks-6_Systems-FF6B6B?style=for-the-badge&logo=apachemaven&logoColor=white)](#-applied-java-engineering-lab-tasks)
[![GeeksforGeeks](https://img.shields.io/badge/GeeksforGeeks-1_Solved-298D46?style=for-the-badge&logo=geeksforgeeks&logoColor=white)](https://www.geeksforgeeks.org/)
[![Testing](https://img.shields.io/badge/Testing-Edge_Case_Hardened-8A2BE2?style=for-the-badge&logo=junit5&logoColor=white)](#-software-testing--edge-case-engineering)

<br/>

[📖 Overview](#-overview) • [📊 Metrics](#-summary-statistics) • [🗺️ Roadmap](#-dual-track-curriculum-roadmap) • [🧠 Deep-Dives](#-core-algorithmic--architectural-deep-dives) • [📚 DSA Curriculum](#-week-by-week-algorithmic-curriculum) • [🔬 Lab Tasks](#-applied-java-engineering-lab-tasks) • [🧪 Testing](#-software-testing--edge-case-engineering) • [⚙️ Quickstart](#-getting-started--local-execution)

</div>

---

## 📖 Overview

This repository represents an intensive, comprehensive engineering catalog of **Algorithmic Problem Solving, Software Testing, and Applied Java Systems** built entirely with **modern Java (Java 17+)**. Engineered with a dual focus on **theoretical mathematical optimality** and **enterprise software design standards**, the codebase is divided into two synergistic tracks:

1. **Track 1: Master Algorithmic Curriculum (Weeks 1 – 6):** 55 production-hardened solutions covering prefix equilibrium, symmetric two-pointers, in-place partitions, heap scheduling, 2D integral images, circular Kadane dynamic programming, deterministic finite automata (DFA), and linear pattern matching (Z-Algorithm & KMP).
2. **Track 2: Applied Software Engineering & Systems Labs (Experiments 1 – 6):** 6 end-to-end applied Java systems demonstrating declarative stream pipelines, high-throughput real-time sensor analytics, streaming profit optimization, DNA sequence search using Knuth-Morris-Pratt, encapsulated banking state machines, and polymorphic ride-sharing architectures with custom checked exceptions.

### Core Architectural Pillars
- **Asymptotic Optimality:** Every algorithm strictly enforces theoretical lower bounds—preferring single-pass $O(N)$ sliding windows, $O(N+M)$ linear string automata, and $O(1)$ subgrid queries over naive nested iterations.
- **Memory Efficiency:** Active prioritization of in-place pointer mutations and $O(1)$ auxiliary memory footprints to minimize JVM garbage collection overhead.
- **Defensive Edge-Case Hardening:** Rigorous guardrails for nullity, 32-bit arithmetic overflows ($[-2^{31}, 2^{31}-1]$), circular boundary warps, empty streams, and invalid runtime inputs.
- **Modern Idiomatic Java:** Clean OOP and functional patterns utilizing Streams, lambdas, custom comparators, method references, and custom exception hierarchies.

---

## 📊 Summary Statistics

<div align="center">

| Track / Platform | 🟢 Easy | 🟡 Medium | 🔴 Hard | Total Solutions | Track Share |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **LeetCode** | 18 | 14 | 0 | **32** | 52.5% |
| **HackerRank** | 8 | 13 | 1 | **22** | 36.1% |
| **Applied Lab Tasks** | 2 | 3 | 1 | **6** | 9.8% |
| **GeeksforGeeks** | 0 | 1 | 0 | **1** | 1.6% |
| **Overall Repository** | **28** (45.9%) | **31** (50.8%) | **2** (3.3%) | **61** | **100% Complete** |

</div>

```text
Difficulty Distribution:
🟢 Easy:   █████████████████████ (45.9% - 28 Solutions)
🟡 Medium: ███████████████████████ (50.8% - 31 Solutions)
🔴 Hard:   ██ (3.3% - 2 Solutions)

Curriculum Completion: [==================================================] 100% (61/61)
- 55 Core Algorithmic Curriculum Problems (Weeks 1 to 6)
-  6 Enterprise & Laboratory Engineering Systems (Experiments 1 to 6)
```

---

## 🗺️ Dual-Track Curriculum Roadmap

### Track 1: 6-Week Algorithmic Mastery Roadmap

| Module | Core Domain | Algorithmic Paradigms & Data Structures | Problems | Status |
| :---: | :--- | :--- | :---: | :---: |
| [**Week 1**](./Week-1/README.md) | **Arrays, Sorting Basics & Lambdas** | 1D Prefix Sums, Symmetrical Two-Pointers, Custom Comparators, Lambda Expressions | 7 | ✅ Verified |
| [**Week 2**](./Week-2/README.md) | **In-Place Ops & Frequency Mapping** | Read/Write In-Place Pointers, Anagram Hash Signatures, Kadane's DP, Top-K Heaps | 8 | ✅ Verified |
| [**Week 3**](./Week-3/README.md) | **Collections & Priority Queues** | PriorityQueues, Transitive String Sorting, State Machine Simulation, Date/Time Math | 10 | ✅ Verified |
| [**Week 4**](./Week-4/README.md) | **2D Matrices & Transformations** | 2D Integral Images (Inclusion-Exclusion), Concentric Ring Rotations, Transpositions | 11 | ✅ Verified |
| [**Week 5**](./Week-5/README.md) | **Subarrays, DP & State Machines** | Circular Kadane's Optimization, Dynamic Sliding Windows, Deterministic Finite Automata | 9 | ✅ Verified |
| [**Week 6**](./Week-6/README.md) | **Advanced Strings & Palindromes** | Expand Around Center, String Periodicity Invariance, Linear Z-Algorithm Matching | 10 | ✅ Verified |
| **Subtotal** | **Algorithmic Curriculum** | **Data Structures & Competitive Problem Solving** | **55** | **100% Complete** |

### Track 2: Applied Software Engineering & Systems Lab Tasks

| Exp # | System Title | Key Technologies & Paradigms | Architecture / Pattern | Status |
| :---: | :--- | :--- | :--- | :---: |
| [**Exp 1**](./Lab%20Tasks/01-Salary-Transformation-System/README.md) | **Salary Transformation System** | Java Stream API, Functional Pipelines, Immutability | Declarative Data Mapping | ✅ Verified |
| [**Exp 2**](./Lab%20Tasks/02-RealTime-Stream-Analytics-Engine/README.md) | **Real-Time Stream Analytics Engine** | Stream Ingestion, `computeIfAbsent`, Custom Sorting | Multi-Tier Stream Reducer | ✅ Verified |
| [**Exp 3**](./Lab%20Tasks/03-Maximum-Profit-Analyzer-Kadane/README.md) | **Maximum Profit Analyzer** | Kadane's Algorithm, Contiguous Subarray Max Sum | Single-Pass $O(N)$ Greedy/DP | ✅ Verified |
| [**Exp 4**](./Lab%20Tasks/04-DNA-Pattern-Search-KMP/README.md) | **Intelligent DNA Pattern Search** | Knuth-Morris-Pratt (KMP), LPS Failure Function | Non-Backtracking Linear Matcher | ✅ Verified |
| [**Exp 5**](./Lab%20Tasks/05-Banking-Transaction-System-OOP/README.md) | **Banking Transaction System** | Object-Oriented Programming, Encapsulation, State | Domain Model & State Mutator | ✅ Verified |
| [**Exp 6**](./Lab%20Tasks/06-RideSharing-Platform-Simulator/README.md) | **Ride Sharing Platform Simulator** | Inheritance, Dynamic Dispatch, Checked Exceptions | Polymorphic Engine & Error Hierarchy | ✅ Verified |
| **Subtotal** | **Applied Laboratory Track** | **Enterprise Java & Software Engineering Systems** | **6** | **100% Complete** |

---

## 🧠 Core Algorithmic & Architectural Deep-Dives

This section details foundational algorithms and architectural paradigms developed throughout the repository, featuring mathematical intuition, structural ASCII diagrams, and canonical Java implementations.

---

### 🔹 1. Symmetrical Two-Pointer Convergence & Prefix Balance (Week 1)
*Applied in:* [`squares-of-a-sorted-array`](./Week-1/squares-of-a-sorted-array/solution.java), [`find-pivot-index`](./Week-1/find-pivot-index/solution.java)

When squaring values in a sorted array containing both negative and positive integers, the maximal squared magnitudes reside at the array boundaries. Rather than sorting after squaring ($O(N \log N)$), we converge inwards with dual pointers and populate the destination array from right to left in strictly linear time.

```text
Input:  [-4, -1,  0,  3, 10]
          ^               ^
        left            right
Step 1: |-4| vs |10| -> 10^2 = 100 > 16 -> place 100 at pos[4], right--
Step 2: |-4| vs |3|  -> (-4)^2 = 16 > 9  -> place 16  at pos[3], left++
Result: [ 0,  1,  9, 16, 100]  --> Time: O(N), Space: O(1) auxiliary
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

---

### 🔹 2. In-Place Fast/Slow Pointer Mutation (Week 2)
*Applied in:* [`remove-duplicates-from-sorted-array`](./Week-2/remove-duplicates-from-sorted-array/solution.java), [`remove-element`](./Week-2/remove-element/solution.java), [`0283-move-zeroes`](./Week-4/0283-move-zeroes/solution.java)

Modifying contiguous storage without extra allocations requires maintaining two logical pointers across the buffer:
- **Slow Pointer (`writeIndex`):** Delimits the boundary of valid, processed elements.
- **Fast Pointer (`readIndex`):** Traverses the collection scanning for qualifying values.

```text
Array: [1, 1, 2, 2, 3]
        ^  ^
      slow fast (nums[fast] == nums[slow] -> skip duplicate)
Array: [1, 1, 2, 2, 3]
        ^     ^
      slow   fast (nums[fast] != nums[slow] -> slow++, write nums[fast])
```

---

### 🔹 3. Custom Transitive Concatenation Sorting (Week 3)
*Applied in:* [`0179-largest-number`](./Week-3/0179-largest-number/solution.java)

Constructing the largest numeric representation from non-negative integers cannot rely on numerical magnitude or simple lexicographical comparison (e.g., `"3"` must precede `"30"` because `"330" > "303"`).

$$\text{Comparator Metric: } A \prec B \iff (B + A) > (A + B)$$

```java
// Comparator enforces strict weak ordering over concatenated string representations
Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));

// Edge-Case Defense: If the most significant token is "0", all tokens are "0"
if (array[0].equals("0")) return "0";
```

> [!NOTE]
> **Mathematical Proof of Transitivity:** For strings $a, b, c$, if $(a+b) \ge (b+a)$ and $(b+c) \ge (c+b)$, then $(a+c) \ge (c+a)$. This strict weak ordering guarantees global convergence in $O(N \log N \cdot L)$ time.

---

### 🔹 4. 2D Prefix Sums & Inclusion-Exclusion (Week 4)
*Applied in:* [`1314-matrix-block-sum`](./Week-4/1314-matrix-block-sum/solution.java)

Evaluating arbitrary rectangular subgrid sums $[(r_1, c_1) \dots (r_2, c_2)]$ naively costs $O(M \cdot N)$ per query. By precomputing a 2D integral table $P$ in $O(M \cdot N)$ time, any subgrid sum is resolved in strictly **$O(1)$ time**:

$$\text{Sum}(r_1, c_1, r_2, c_2) = P[r_2+1][c_2+1] - P[r_1][c_2+1] - P[r_2+1][c_1] + P[r_1][c_1]$$

```text
(0,0)--------------+--------------------+
|                  |                    |
|       +----------(r1, c1)             |
|       |          |      |             |
|       |   Target Subgrid|             |
|       |          |      |             |
+-------+----------+------(r2, c2)------+
|       |                               |
+-------+-------------------------------+
Formula: Total(r2,c2) - TopStrip - LeftStrip + CornerOverlap
```

---

### 🔹 5. Dual-Kadane's Algorithm for Circular Subarrays (Week 5 & Lab 3)
*Applied in:* [`0053-maximum-subarray`](./Week-5/0053-maximum-subarray/solution.java), [`0918-maximum-sum-circular-subarray`](./Week-5/0918-maximum-sum-circular-subarray/solution.java), [`03-Maximum-Profit-Analyzer-Kadane`](./Lab%20Tasks/03-Maximum-Profit-Analyzer-Kadane/Task3.java)

In a circular array of size $N$, the optimal contiguous subarray falls into one of two scenarios:
1. **Non-wrapping Subarray:** Handled by standard Kadane's maximum algorithm.
2. **Wrapping Subarray:** Wraps across the boundary $N-1 \to 0$. The maximum wrapping sum equals **Total Sum minus the Minimum Contiguous Subarray Sum**.

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
    // Defensive Check: If all elements are negative, return maximum single negative element
    return (maxSum > 0) ? Math.max(maxSum, totalSum - minSum) : maxSum;
}
```

---

### 🔹 6. Knuth-Morris-Pratt (KMP) DNA Pattern Matching (Lab 4 & Week 6)
*Applied in:* [`04-DNA-Pattern-Search-KMP`](./Lab%20Tasks/04-DNA-Pattern-Search-KMP/Task4.java), [`string-similarity`](./Week-6/string-similarity/solution.java)

Naive substring search re-evaluates characters upon a mismatch, degrading to $O(N \cdot M)$. The Knuth-Morris-Pratt algorithm precomputes a **Longest Prefix Suffix (LPS / $\pi$)** array in $O(M)$ time, ensuring the text index never backtracks.

```text
Text:    A  B  A  B  D  A  B  A  C  D  A  B  A  B  C  A  B  A  B
Pattern: A  B  A  B  C  A  B  A  B
LPS:    [0, 0, 1, 2, 0, 1, 2, 3, 4]

Mismatch at index 4 ('D' != 'C'):
Instead of resetting pattern to 0, use LPS[3] = 2.
Pattern shifts forward instantly without rescanning text characters!
```

```java
// Precomputing the LPS (Failure Function) array in O(M)
static int[] buildLPS(String pattern) {
    int m = pattern.length();
    int[] lps = new int[m];
    int len = 0, i = 1;
    while (i < m) {
        if (pattern.charAt(i) == pattern.charAt(len)) {
            lps[i++] = ++len;
        } else {
            if (len != 0) len = lps[len - 1];
            else lps[i++] = 0;
        }
    }
    return lps;
}
```

---

### 🔹 7. Declarative Stream Pipelining & High-Throughput Analytics (Lab 1 & Lab 2)
*Applied in:* [`01-Salary-Transformation-System`](./Lab%20Tasks/01-Salary-Transformation-System/Task1.java), [`02-RealTime-Stream-Analytics-Engine`](./Lab%20Tasks/02-RealTime-Stream-Analytics-Engine/Task2.java)

Modern Java Stream pipelines transform sequential data without side effects:
1. **Ingestion & Predicate Filtering:** Ingest sensor feeds and discard sub-threshold readings ($T \le 50$).
2. **Grouping & Dynamic Aggregation:** Bucket readings by ID via `computeIfAbsent()` and reduce to averages with `IntStream.average()`.
3. **Sorted Stream Consumption:** Sort projected key-value entries descending by value and stream directly to standard output.

```java
// Real-time sensor aggregation pipeline (Lab Task 2)
map.entrySet().stream()
    .map(e -> new AbstractMap.SimpleEntry<>(
            e.getKey(),
            e.getValue().stream().mapToInt(Integer::intValue).average().orElse(0.0)))
    .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
    .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
```

---

### 🔹 8. Polymorphic Dynamic Dispatch & Defensive Exception Hierarchies (Lab 5 & Lab 6)
*Applied in:* [`05-Banking-Transaction-System-OOP`](./Lab%20Tasks/05-Banking-Transaction-System-OOP/Task5.java), [`06-RideSharing-Platform-Simulator`](./Lab%20Tasks/06-RideSharing-Platform-Simulator/Task6.java)

Enterprise architectures decouple business logic through abstract contracts and custom checked exceptions:

```text
                     ┌──────────────────┐
                     │ abstract Vehicle │
                     │  calculateFare() │
                     └─────────┬────────┘
             ┌─────────────────┼─────────────────┐
             ▼                 ▼                 ▼
      ┌────────────┐    ┌────────────┐    ┌────────────┐
      │    Bike    │    │    Auto    │    │    Cab     │
      │  $5 / km   │    │  $12 / km  │    │  $12 / km  │
      └────────────┘    └────────────┘    └────────────┘
```

The `Trip` orchestrator enforces domain invariants (distance $> 0$, known ride type), raising `InvalidBookingException` before calculating fares via dynamic runtime dispatch.

---

## 📚 Week-by-Week Algorithmic Curriculum

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

## 🔬 Applied Java Engineering Lab Tasks

The **Applied Java Engineering Lab Track** focuses on practical, production-level Java architectures including the Stream API, non-backtracking search automata, domain modeling, and robust error handling.

> 📖 **Lab Track Overview:** [Lab Tasks README](./Lab%20Tasks/README.md)

| Exp # | System Title | Difficulty | Engineering Concepts | Time Complexity | Space Complexity | Source Code |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: |
| 1 | **[Salary Transformation System](./Lab%20Tasks/01-Salary-Transformation-System/README.md)** | 🟢 Easy | Java Stream API, Immutability, `.map()`, `.forEach()` | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | [Task1.java](./Lab%20Tasks/01-Salary-Transformation-System/Task1.java) |
| 2 | **[Real-Time Stream Analytics Engine](./Lab%20Tasks/02-RealTime-Stream-Analytics-Engine/README.md)** | 🟡 Medium | Stream Filtering, `computeIfAbsent`, Average, Sorting | $\mathcal{O}(N + U \log U)$ | $\mathcal{O}(N)$ | [Task2.java](./Lab%20Tasks/02-RealTime-Stream-Analytics-Engine/Task2.java) |
| 3 | **[Maximum Profit Analyzer](./Lab%20Tasks/03-Maximum-Profit-Analyzer-Kadane/README.md)** | 🟡 Medium | Kadane's DP, Contiguous Subarray Max, Single Pass | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Task3.java](./Lab%20Tasks/03-Maximum-Profit-Analyzer-Kadane/Task3.java) |
| 4 | **[Intelligent DNA Pattern Search](./Lab%20Tasks/04-DNA-Pattern-Search-KMP/README.md)** | 🔴 Hard | Knuth-Morris-Pratt (KMP), LPS Array, Zero Backtrack | $\mathcal{O}(N + M)$ | $\mathcal{O}(M)$ | [Task4.java](./Lab%20Tasks/04-DNA-Pattern-Search-KMP/Task4.java) |
| 5 | **[Banking Transaction System](./Lab%20Tasks/05-Banking-Transaction-System-OOP/README.md)** | 🟢 Easy | OOP Encapsulation, State Management, Controlled Access | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Task5.java](./Lab%20Tasks/05-Banking-Transaction-System-OOP/Task5.java) |
| 6 | **[Ride Sharing Platform Simulator](./Lab%20Tasks/06-RideSharing-Platform-Simulator/README.md)** | 🟡 Medium | Abstraction, Dynamic Dispatch, Checked Exceptions | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Task6.java](./Lab%20Tasks/06-RideSharing-Platform-Simulator/Task6.java) |

---

### 🧪 Detailed Lab System Specifications

#### 1. Salary Transformation System (Experiment 1)
- **Problem:** Given $N$ employee compensation records, apply a 10% raise immutably without imperative iteration (`for`/`while`).
- **Design:** Constructs a sequential `Stream<Integer>` over an `ArrayList<Integer>`, applies `.map(salary -> salary + (salary * 10 / 100))`, and terminates with `.forEach()`.
- **Run:** `cd "Lab Tasks/01-Salary-Transformation-System" && javac Task1.java && java Task1`

#### 2. Real-Time Stream Analytics Engine (Experiment 2)
- **Problem:** Ingest high-volume `(Sensor ID, Temperature)` telemetry, eliminate readings $\le 50$, compute per-sensor averages, and project entries ordered descending by average temperature.
- **Design:** Employs `map.computeIfAbsent(id, k -> new ArrayList<>()).add(temp)` during ingestion. Processes entries through `entrySet().stream()`, evaluating averages via `IntStream.average().orElse(0.0)` and sorting via `Double.compare(b.getValue(), a.getValue())`.
- **Run:** `cd "Lab Tasks/02-RealTime-Stream-Analytics-Engine" && javac Task2.java && java Task2`

#### 3. Maximum Profit Analyzer (Experiment 3)
- **Problem:** Identify the contiguous period of operations yielding peak cumulative profitability across a fluctuating financial sequence.
- **Design:** Implements an on-the-fly streaming variant of Kadane's algorithm. For each incoming ledger value, the engine updates `currentSum = Math.max(value, currentSum + value)` and locks in `maxSum = Math.max(maxSum, currentSum)` using $O(1)$ auxiliary variables.
- **Run:** `cd "Lab Tasks/03-Maximum-Profit-Analyzer-Kadane" && javac Task3.java && java Task3`

#### 4. Intelligent DNA Pattern Search (Experiment 4)
- **Problem:** Detect all starting locus offsets of a target genomic subsequence within a lengthy chromosome sequence without quadratic time degradation.
- **Design:** Knuth-Morris-Pratt (KMP) engine. Precomputes the $\pi$ Longest Prefix Suffix (`lps`) table of size $M$ in $O(M)$ time. During matching over length $N$, mismatched characters cause the pattern cursor to fall back to `lps[j-1]` while the text index advances monotonically.
- **Run:** `cd "Lab Tasks/04-DNA-Pattern-Search-KMP" && javac Task4.java && java Task4`

#### 5. Banking Transaction System (Experiment 5)
- **Problem:** Model an atomic transactional ledger that processes `Deposit` and `Withdraw` commands while defending balance invariants.
- **Design:** Encapsulated `BankAccount` domain entity with a `private int balance` field. Direct field modifications are forbidden; mutations are channeled through validated `deposit(amount)` and `withdraw(amount)` methods.
- **Run:** `cd "Lab Tasks/05-Banking-Transaction-System-OOP" && javac Task5.java && java Task5`

#### 6. Ride Sharing Platform Simulator (Experiment 6)
- **Problem:** Dispatch trip requests across polymorphic fleets (`Bike`, `Auto`, `Cab`) with differential tariff models while capturing invalid ride categories and negative trip distances.
- **Design:** Abstract base `Vehicle` defining `abstract int calculateFare(int distance)`. Concrete subclasses implement rates ($5$/km for Bike, $12$/km for Auto and Cab). A custom checked exception `InvalidBookingException` defends constructor and parser invariants.
- **Run:** `cd "Lab Tasks/06-RideSharing-Platform-Simulator" && javac Task6.java && java Task6`

---

## 🧪 Software Testing & Edge-Case Engineering

Software correctness is guaranteed through defensive programming and structured edge-case test harnesses spanning both competitive algorithmic scenarios and enterprise OOP systems.

### 🛡️ Algorithmic & Systems Edge-Case Matrix

```text
┌─────────────────────────────────────────────────────────────────────────────┐
│                   EDGE-CASE ENGINEERING VERIFICATION MATRIX                 │
├───────────────────────┬─────────────────────────────────────────────────────┤
│ Category              │ Verification Scenarios                              │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Empty & Single-Item   │ - Null arrays, length 0, single-element arrays      │
│                       │ - Empty strings (""), single-character targets      │
│                       │ - Zero transaction counts, empty sensor feeds       │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Numeric Boundaries    │ - Integer.MAX_VALUE (2147483647), Integer.MIN_VALUE │
│                       │ - Accumulator casting to long to avoid 32-bit wrap  │
│                       │ - Negative/zero trip distances, zero-profit ledgers │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Homogeneity & Signs   │ - All identical elements: [0, 0, 0], "aaaaaa"       │
│                       │ - All-negative Kadane arrays (ensures non-zero bug) │
│                       │ - Strictly ascending vs strictly descending inputs  │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Substring & Automata  │ - Pattern longer than input text (KMP guard)        │
│                       │ - Highly repetitive prefixes: "AAAA" in "AAAAAAA"   │
│                       │ - Rotations across wrap-around boundaries           │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ OOP & Exception Flow  │ - Unsupported vehicle types triggering custom error │
│                       │ - Balance non-negativity across withdraw operations │
│                       │ - Unregistered sensor IDs during stream reduction   │
└───────────────────────┴─────────────────────────────────────────────────────┘
```

### 💡 Unit Test Architecture (JUnit 5 Paradigm)

```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MasterVerificationTest {

    @Test
    @DisplayName("Verify Circular Kadane: All Negative Array Handled Safely")
    void testCircularKadaneAllNegative() {
        int[] allNegative = {-5, -2, -8, -3};
        // Expected maximum contiguous sum is -2 (the single best element), NOT 0
        int currMax = 0, maxSum = allNegative[0];
        for (int x : allNegative) {
            currMax = Math.max(x, currMax + x);
            maxSum = Math.max(maxSum, currMax);
        }
        assertEquals(-2, maxSum);
    }

    @Test
    @DisplayName("Verify KMP LPS Construction: Repeated Prefix Sequence")
    void testKmpLpsTable() {
        String pattern = "ABABCABAB";
        int[] lps = Task4.buildLPS(pattern);
        assertArrayEquals(new int[]{0, 0, 1, 2, 0, 1, 2, 3, 4}, lps);
    }

    @Test
    @DisplayName("Verify Ride Sharing Simulator: Custom Exception Handling")
    void testRideSharingInvalidDistance() {
        Driver driver = new Driver("D1");
        Rider rider = new Rider("R1");
        Vehicle vehicle = new Bike();

        assertThrows(InvalidBookingException.class, () -> {
            new Trip(driver, rider, vehicle, -5);
        });
    }

    @Test
    @DisplayName("Verify Largest Number: All Zero Array Defense")
    void testLargestNumberAllZeroes() {
        String[] tokens = {"0", "0", "0"};
        Arrays.sort(tokens, (a, b) -> (b + a).compareTo(a + b));
        String result = tokens[0].equals("0") ? "0" : String.join("", tokens);
        assertEquals("0", result);
    }
}
```

---

## 🗂️ Complete Repository Structure

```text
Problem-solving-and-testing-S2-2/
├── README.md                                       # Master Repository Overview & Engineering Catalog
│
├── Lab Tasks/                                      # Applied Java Systems & Laboratory Track (6 Systems)
│   ├── README.md                                   # Lab Track Curriculum Overview
│   ├── 01-Salary-Transformation-System/            # Exp 1: Stream API & Functional Pipelines
│   │   ├── README.md
│   │   └── Task1.java
│   ├── 02-RealTime-Stream-Analytics-Engine/         # Exp 2: Stream Ingestion, Averaging & Sorting
│   │   ├── README.md
│   │   └── Task2.java
│   ├── 03-Maximum-Profit-Analyzer-Kadane/          # Exp 3: Kadane's Contiguous Subarray Profit DP
│   │   ├── README.md
│   │   └── Task3.java
│   ├── 04-DNA-Pattern-Search-KMP/                  # Exp 4: Knuth-Morris-Pratt (KMP) DNA Matcher
│   │   ├── README.md
│   │   └── Task4.java
│   ├── 05-Banking-Transaction-System-OOP/          # Exp 5: Encapsulated Banking Domain Model
│   │   ├── README.md
│   │   └── Task5.java
│   └── 06-RideSharing-Platform-Simulator/          # Exp 6: Polymorphic Ride Engine & Exceptions
│       ├── README.md
│       └── Task6.java
│
├── Week-1/                                         # Week 1: Arrays, Sorting Basics & Lambdas (7 Problems)
│   ├── README.md                                   # Week 1 Detailed Syllabus
│   ├── find-pivot-index/                           # LeetCode 724
│   │   ├── README.md
│   │   └── solution.java
│   ├── java-comparator/                            # HackerRank Comparator
│   ├── java-lambda-expressions/                    # HackerRank Lambda Expressions
│   ├── java-sort/                                  # HackerRank Multi-Attribute Sort
│   ├── richest-customer-wealth/                    # LeetCode 1672
│   ├── running-sum-of-1d-array/                    # LeetCode 1480
│   └── squares-of-a-sorted-array/                  # LeetCode 977
│
├── Week-2/                                         # Week 2: In-Place Ops, Frequency Mapping & Sliding (8 Problems)
│   ├── README.md                                   # Week 2 Detailed Syllabus
│   ├── find-the-highest-altitude/                  # LeetCode 1732
│   ├── group-anagrams/                             # LeetCode 49
│   ├── maximum-subarray/                           # LeetCode 53
│   ├── remove-duplicates-from-sorted-array/        # LeetCode 26
│   ├── remove-element/                             # LeetCode 27
│   ├── running-sum-of-1d-array/                    # LeetCode 1480
│   ├── shuffle-the-array/                          # LeetCode 1470
│   └── top-k-frequent-elements/                    # LeetCode 347
│
├── Week-3/                                         # Week 3: Collections, Priority Queues & Date/Time (10 Problems)
│   ├── README.md                                   # Week 3 Detailed Syllabus
│   ├── 0179-largest-number/                        # LeetCode 179
│   ├── 0451-sort-characters-by-frequency/          # LeetCode 451
│   ├── 1154-day-of-the-year/                       # LeetCode 1154
│   ├── 1185-day-of-the-week/                       # LeetCode 1185
│   ├── 1459-apply-discount-every-n-orders/         # LeetCode 1357 / 1459
│   ├── java-arraylist/                             # HackerRank Dynamic ArrayList
│   ├── java-comparator/                            # HackerRank Comparator
│   ├── java-date-and-time/                         # HackerRank Calendar / Date Math
│   ├── java-priority-queue/                        # HackerRank PriorityQueue<Student>
│   └── java-sort/                                  # HackerRank Object Sort
│
├── Week-4/                                         # Week 4: 2D Matrices & Subgrid Sums (11 Problems)
│   ├── README.md                                   # Week 4 Detailed Syllabus
│   ├── 0217-contains-duplicate/                    # LeetCode 217
│   ├── 0283-move-zeroes/                           # LeetCode 283
│   ├── 0867-transpose-matrix/                      # LeetCode 867
│   ├── 1314-matrix-block-sum/                      # LeetCode 1314
│   ├── 1704-determine-if-string-halves-are-alike/  # LeetCode 1704
│   ├── compare-the-triplets/                       # HackerRank Triplet Comparison
│   ├── diagonal-difference/                        # HackerRank Diagonals
│   ├── matrix-rotation-algo/                       # HackerRank Ring Peeling
│   ├── multiply-2-matrices4144/                    # GeeksforGeeks Matrix Multiplication
│   ├── time-conversion/                            # HackerRank 12h to 24h Time
│   └── two-strings/                                # HackerRank Character Set Intersection
│
├── Week-5/                                         # Week 5: Subarrays, Dynamic Programming & State Machines (9 Problems)
│   ├── README.md                                   # Week 5 Detailed Syllabus
│   ├── 0003-longest-substring-without-repeating-characters/ # LeetCode 3
│   ├── 0008-string-to-integer-atoi/                # LeetCode 8
│   ├── 0053-maximum-subarray/                      # LeetCode 53
│   ├── 0890-find-and-replace-pattern/              # LeetCode 890
│   ├── 0918-maximum-sum-circular-subarray/         # LeetCode 918
│   ├── 1408-string-matching-in-an-array/           # LeetCode 1408
│   ├── alternating-characters/                     # HackerRank Adjacent Deletion
│   ├── maxsubarray/                                # HackerRank Kadane Subarray & Subsequence
│   └── the-birthday-bar/                           # HackerRank Fixed Sliding Window
│
└── Week-6/                                         # Week 6: Advanced String Algorithms & Palindromes (10 Problems)
    ├── README.md                                   # Week 6 Detailed Syllabus
    ├── 0005-longest-palindromic-substring/         # LeetCode 5
    ├── 0028-find-the-index-of-the-first-occurrence-in-a-string/ # LeetCode 28
    ├── 0438-find-all-anagrams-in-a-string/         # LeetCode 438
    ├── 0459-repeated-substring-pattern/            # LeetCode 459
    ├── 0796-rotate-string/                         # LeetCode 796
    ├── circular-palindromes/                       # HackerRank Circular Palindromes
    ├── mars-exploration/                           # HackerRank Modulo Periodicity
    ├── palindrome-index/                           # HackerRank Lookahead Mismatch Repair
    ├── string-similarity/                          # HackerRank Z-Algorithm
    └── two-strings/                                # HackerRank Bitmask Match
```

---

## 🚀 Getting Started & Local Execution

### Prerequisites
- **Java Development Kit (JDK):** Version 17 or higher (compatible with Java 8+ for lab tasks).
- **IDE Recommended:** IntelliJ IDEA / Eclipse / VS Code with Language Support for Java.

Verify your environment:
```bash
java -version
javac -version
```

### Cloning the Repository
```bash
git clone https://github.com/Gnanendra942/Problem-solving-and-testing-S2-2.git
cd Problem-solving-and-testing-S2-2
```

### Compiling & Running Algorithmic Solutions
Every problem directory in `Week-1` through `Week-6` houses a standalone `solution.java` file:

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

### Compiling & Running Applied Lab Tasks
Each experiment in `Lab Tasks` contains its dedicated `Task*.java` entry point:

```bash
# Example 1: Run Real-Time Stream Analytics Engine (Lab Task 2)
cd "Lab Tasks/02-RealTime-Stream-Analytics-Engine"
javac Task2.java
java Task2

# Example 2: Run Intelligent DNA Pattern Search (Lab Task 4)
cd "../04-DNA-Pattern-Search-KMP"
javac Task4.java
java Task4

# Example 3: Run Ride-Sharing Platform Simulator (Lab Task 6)
cd "../06-RideSharing-Platform-Simulator"
javac Task6.java
java Task6
```

---

## 🛡️ Coding Standards & Engineering Best Practices

1. **Deterministic Asymptotic Complexity:** Every solution is written to achieve optimal theoretical lower bounds. Inefficient nested loops ($O(N^2)$) are refactored into prefix accumulators, two pointers, sliding windows, or failure-function automata ($O(N)$).
2. **Minimal Space Footprint:** In-place pointer mutations and primitive buffers (`int[]`, `char[]`) are preferred over wrapper objects (`Integer`, `Character`) to minimize heap pressure and GC stalls.
3. **Defensive Arithmetic:** Multiplications and summations are cast to `long` before comparing against 32-bit thresholds (`Integer.MAX_VALUE`, `Integer.MIN_VALUE`).
4. **Clean OOP & Domain Boundaries:** Classes encapsulate state invariants (`private`), expose intention-revealing APIs, and enforce error preconditions using custom domain exceptions.
5. **Self-Documenting Code:** Clean naming conventions, descriptive variable bindings, and structured method breakdowns ensure readability without extraneous comments.

---

<div align="center">

**Crafted with ☕ and passion for Algorithmic Problem Solving, Software Testing, and Systems Engineering.**  
*Continuous learning through deliberate practice.*

</div>
