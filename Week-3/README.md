# 🚀 Week 3: Java Collections Framework, Priority Queues & Date/Time Logic

Welcome to **Week 3** of the Problem Solving and Testing journey! This week is dedicated to mastering the Java Collections Framework (`ArrayList`, `PriorityQueue`, `HashMap`, `TreeMap`), custom comparators for lexicographical optimization, system design simulation, and date/time algorithms.

---

## 🎯 Learning Objectives & Algorithmic Paradigms

- **Custom Lexicographical Comparators:** Solves the largest number concatenation problem using transitive custom comparators $(S_1 + S_2 \text{ vs } S_2 + S_1)$ in $O(N \log N)$ time.
- **Priority Queue & Heap Operations:** Employs `PriorityQueue<T>` with custom lambda comparators for frequency-based string rebuilding and event-driven priority queues.
- **Dynamic 2D Structures:** Implements dynamic 2D array lists (`ArrayList<ArrayList<Integer>>`) for $O(1)$ fast indexed queries.
- **Date & Calendar Computations:** Parses ISO date strings, calculates leap years, and determines day of week via Zeller's congruence and the Java `Calendar`/`LocalDate` APIs.
- **Object-Oriented System Design:** Implements stateful cash register/discount models (`Apply Discount Every N Orders`) using hash map product lookup and transaction counters.

---

## 💻 Problems Solved & Java Implementation

### LeetCode Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🔢 **[179. Largest Number](./0179-largest-number/)** | 🟡 Medium | Custom String Concatenation Comparator | $O(N \log N \cdot L)$ | $O(N \cdot L)$ | [Java](./0179-largest-number/solution.java) |
| 🔠 **[451. Sort Characters By Frequency](./0451-sort-characters-by-frequency/)** | 🟡 Medium | Frequency Map + Max-Heap / Bucket Sort | $O(N + K \log K)$ | $O(N)$ | [Java](./0451-sort-characters-by-frequency/solution.java) |
| 📅 **[1154. Day of the Year](./1154-day-of-the-year/)** | 🟢 Easy | Date Parsing & Leap Year Cumulative Days | $O(1)$ | $O(1)$ | [Java](./1154-day-of-the-year/solution.java) |
| 🗓️ **[1185. Day of the Week](./1185-day-of-the-week/)** | 🟢 Easy | Zeller's Congruence / Calendar Logic | $O(1)$ | $O(1)$ | [Java](./1185-day-of-the-week/solution.java) |
| 🏷️ **[1357/1459. Apply Discount Every n Orders](./1459-apply-discount-every-n-orders/)** | 🟡 Medium | Design / Hash Map Price Lookup | $O(P)$ / order | $O(P)$ | [Java](./1459-apply-discount-every-n-orders/solution.java) |

### HackerRank Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 📑 **[Java 1D/2D ArrayList](./java-arraylist/)** | 🟢 Easy | Dynamic List-of-Lists Indexing | $O(N + Q)$ | $O(N)$ | [Java](./java-arraylist/solution.java) |
| ⚔️ **[Java Comparator](./java-comparator/)** | 🟡 Medium | `Comparator<Checker>` Score & Name Sorting | $O(N \log N)$ | $O(1)$ | [Java](./java-comparator/solution.java) |
| ⏰ **[Java Date and Time](./java-date-and-time/)** | 🟢 Easy | `Calendar` / `LocalDate` Day of Week Query | $O(1)$ | $O(1)$ | [Java](./java-date-and-time/solution.java) |
| 🏅 **[Java Priority Queue](./java-priority-queue/)** | 🟡 Medium | `PriorityQueue<Student>` Event Processing | $O(N \log N)$ | $O(N)$ | [Java](./java-priority-queue/solution.java) |
| 🎓 **[Java Sort](./java-sort/)** | 🟢 Easy | Multi-attribute Student Sorting | $O(N \log N)$ | $O(1)$ | [Java](./java-sort/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **10** |
| **Platforms** | LeetCode (5) · HackerRank (5) |
| **Difficulty** | 🟢 Easy: 5 &nbsp;\|&nbsp; 🟡 Medium: 5 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 3 completed successfully!*

</div>
