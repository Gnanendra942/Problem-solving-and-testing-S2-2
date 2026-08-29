<div align="center">

# 🚀 Week 3: Java Collections, Priority Queues & Date/Time Logic

**Java Collections Framework (`ArrayList`, `PriorityQueue`, `HashMap`), custom transitive comparators, system design simulation, and date/time algorithms.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems%20Solved-10-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-problems-solved--java-implementations)
[![LeetCode](https://img.shields.io/badge/LeetCode-5-FFA116.svg?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/HackerRank-5-2EC866.svg?style=for-the-badge&logo=hackerrank&logoColor=white)](https://www.hackerrank.com/)

[⬅️ **Prev: Week 2**](../Week-2/README.md) &nbsp;•&nbsp; [🏠 **Main Repository**](../README.md) &nbsp;•&nbsp; [➡️ **Next: Week 4**](../Week-4/README.md)

</div>

---

## 📌 Table of Contents

- [🎯 Learning Objectives & Paradigms](#-learning-objectives--paradigms)
- [💻 Problems Solved & Java Implementations](#-problems-solved--java-implementations)
- [🧠 Problem-by-Problem Technical Breakdown](#-problem-by-problem-technical-breakdown)
- [📊 Week 3 Summary Statistics](#-week-3-summary-statistics)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Learning Objectives & Paradigms

1. **Custom Transitive Concatenation Sorting:** Formulates custom string comparators $(b+a)\text{.compareTo}(a+b)$ to form mathematically maximal multi-digit numbers.
2. **Priority Queue & Frequency Rebuilding:** Leverages max-heaps with lambda comparators to rebuild strings ordered by character occurrences in $O(N + K \log K)$ time.
3. **Date & Calendar Computations:** Accurately calculates leap years, cumulative ordinal days, and day-of-week determinations via Zeller's congruence and Java `Calendar`/`LocalDate`.
4. **Object-Oriented Design & Stateful Hash Maps:** Designs real-world discount engines (`ApplyDiscountEveryNOrders`) managing transaction states, price maps, and percentage reductions.
5. **Dynamic 2D Structures & Event Queues:** Manages jagged lists (`ArrayList<ArrayList<Integer>>`) and dynamic student registration queues.

---

## 💻 Problems Solved & Java Implementations

| Problem | Platform | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :---: | :--- | :---: | :---: | :---: |
| 🔢 **[179. Largest Number](./0179-largest-number/)** | LeetCode | 🟡 Medium | Custom Transitive Concatenation Sort | $O(N \log N \cdot L)$ | $O(N \cdot L)$ | [Java](./0179-largest-number/solution.java) |
| 🔠 **[451. Sort Characters By Frequency](./0451-sort-characters-by-frequency/)** | LeetCode | 🟡 Medium | Frequency Map + Max-Heap / Bucket Sort | $O(N + K \log K)$ | $O(N)$ | [Java](./0451-sort-characters-by-frequency/solution.java) |
| 📅 **[1154. Day of the Year](./1154-day-of-the-year/)** | LeetCode | 🟢 Easy | ISO Date Parsing & Leap Year Days | $O(1)$ | $O(1)$ | [Java](./1154-day-of-the-year/solution.java) |
| 🗓️ **[1185. Day of the Week](./1185-day-of-the-week/)** | LeetCode | 🟢 Easy | Zeller's Congruence / Calendar Logic | $O(1)$ | $O(1)$ | [Java](./1185-day-of-the-week/solution.java) |
| 🏷️ **[1357/1459. Apply Discount Every n Orders](./1459-apply-discount-every-n-orders/)** | LeetCode | 🟡 Medium | OOP Design / Hash Map Price Lookup | $O(P)$ / call | $O(P)$ | [Java](./1459-apply-discount-every-n-orders/solution.java) |
| 📑 **[Java 1D/2D ArrayList](./java-arraylist/)** | HackerRank | 🟢 Easy | Dynamic 2D ArrayList Indexing | $O(N + Q)$ | $O(N)$ | [Java](./java-arraylist/solution.java) |
| ⚔️ **[Java Comparator](./java-comparator/)** | HackerRank | 🟡 Medium | `Comparator<Checker>` Score/Name Sort | $O(N \log N)$ | $O(1)$ | [Java](./java-comparator/solution.java) |
| ⏰ **[Java Date and Time](./java-date-and-time/)** | HackerRank | 🟢 Easy | `Calendar` / `LocalDate` Day Lookup | $O(1)$ | $O(1)$ | [Java](./java-date-and-time/solution.java) |
| 🏅 **[Java Priority Queue](./java-priority-queue/)** | HackerRank | 🟡 Medium | `PriorityQueue<Student>` Event Processing | $O(N \log N)$ | $O(N)$ | [Java](./java-priority-queue/solution.java) |
| 🎓 **[Java Sort](./java-sort/)** | HackerRank | 🟢 Easy | Multi-key Object Sorting (`CGPA, Name, ID`) | $O(N \log N)$ | $O(1)$ | [Java](./java-sort/solution.java) |

---

## 🧠 Problem-by-Problem Technical Breakdown

### 1. [Largest Number (0179)](./0179-largest-number/)
- **Core Concept:** Convert numbers to strings. Sort using custom comparator: compare $(s2 + s1)$ to $(s1 + s2)$. Edge case: return `"0"` if the largest element is `"0"`.
- **Complexity:** $O(N \log N \cdot L)$ Time &nbsp;\|&nbsp; $O(N \cdot L)$ Space ($L$ digits per number).

### 2. [Sort Characters By Frequency (0451)](./0451-sort-characters-by-frequency/)
- **Core Concept:** Count character frequencies in a hash map. Push distinct characters into a Max-Heap (`PriorityQueue`) ordered by frequency, then poll to construct the result `StringBuilder`.
- **Complexity:** $O(N + K \log K)$ Time &nbsp;\|&nbsp; $O(N)$ Space ($K$ unique characters).

### 3. [Day of the Year (1154)](./1154-day-of-the-year/)
- **Core Concept:** Extract year, month, and day from string. Determine leap year $(Y\%4 == 0 \land (Y\%100 \neq 0 \lor Y\%400 == 0))$. Sum prefix days of previous months + current day.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 4. [Day of the Week (1185)](./1185-day-of-the-week/)
- **Core Concept:** Use Zeller's Congruence or Tomohiko Sakamoto's algorithm to compute day of week for any date since 1971 in $O(1)$ time.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 5. [Apply Discount Every n Orders (1459/1357)](./1459-apply-discount-every-n-orders/)
- **Core Concept:** Maintain `customerCount`, `discount`, and `Map<Integer, Integer> productPrices`. Apply discount formula $\text{total} \times (100 - \text{discount}) / 100.0$ when $\text{count} \pmod n == 0$.
- **Complexity:** $O(1)$ init, $O(P)$ per `getBill()` query &nbsp;\|&nbsp; $O(P)$ Space.

### 6. [Java 1D/2D ArrayList](./java-arraylist/)
- **Core Concept:** Store variable-length integer sequences in `ArrayList<ArrayList<Integer>>` and handle $Q$ boundary-checked index queries with `IndexOutOfBoundsException` handling.
- **Complexity:** $O(N + Q)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 7. [Java Comparator](./java-comparator/)
- **Core Concept:** Implement custom `Comparator<Checker>` sorting by score descending, then player name ascending.
- **Complexity:** $O(N \log N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 8. [Java Date and Time](./java-date-and-time/)
- **Core Concept:** Use `LocalDate.of(year, month, day).getDayOfWeek().name()` or Java `Calendar` to determine weekday names.
- **Complexity:** $O(1)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

### 9. [Java Priority Queue](./java-priority-queue/)
- **Core Concept:** Implement a priority queue for `Student` objects prioritizing higher CGPA $\to$ alphabetical name $\to$ lower ID, processing `ENTER` and `SERVED` events.
- **Complexity:** $O(N \log N)$ Time &nbsp;\|&nbsp; $O(N)$ Space.

### 10. [Java Sort](./java-sort/)
- **Core Concept:** Sort a list of student records using `Collections.sort()` with composite lambda expressions.
- **Complexity:** $O(N \log N)$ Time &nbsp;\|&nbsp; $O(1)$ Space.

---

## 📊 Week 3 Summary Statistics

<div align="center">

| Metric | Value |
| :--- | :---: |
| **Total Problems** | **10** |
| **LeetCode** | 5 |
| **HackerRank** | 5 |
| **Difficulty Breakdown** | 🟢 Easy: 5 &nbsp;\|&nbsp; 🟡 Medium: 5 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Primary Focus** | Collections, PriorityQueue, Comparators, Dates, OOP Design |

</div>

---

## ⚙️ How to Compile & Run

```bash
# Navigate to problem folder
cd Week-3/0179-largest-number

# Compile and execute
javac solution.java
java Solution
```

---

<div align="center">

[⬅️ Back to Week 2](../Week-2/README.md) &nbsp;•&nbsp; [🏠 Main README](../README.md) &nbsp;•&nbsp; [➡️ Next: Week 4](../Week-4/README.md)

</div>
