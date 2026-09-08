<div align="center">

# 🔬 Applied Java Engineering Lab Tasks

**An enterprise-grade laboratory suite demonstrating declarative functional programming, high-throughput stream processing, optimal string automata, dynamic programming, and robust object-oriented system architectures in Java.**

---

[![Java](https://img.shields.io/badge/Language-Java%2017%2B-orange.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Experiments](https://img.shields.io/badge/Experiments-6_Verified-blue.svg?style=for-the-badge&logo=codeforces&logoColor=white)](#-laboratory-experiments-catalog)
[![Paradigms](https://img.shields.io/badge/Paradigms-Streams_•_KMP_•_OOP_•_DP-8A2BE2.svg?style=for-the-badge&logo=apachemaven&logoColor=white)](#-core-architectural-paradigms)
[![Status](https://img.shields.io/badge/Status-100%25_Tested-2ea44f.svg?style=for-the-badge&logo=gitbook&logoColor=white)](#-testing--edge-case-hardening)

[🏠 **Main Repository**](../README.md) &nbsp;•&nbsp; [🧪 **JUnit Testing**](../README.md#-software-testing--edge-case-engineering)

</div>

---

## 📌 Table of Contents

- [🎯 Core Architectural Paradigms](#-core-architectural-paradigms)
- [💻 Laboratory Experiments Catalog](#-laboratory-experiments-catalog)
- [🧠 In-Depth Technical Breakdown (Experiments 1 – 6)](#-in-depth-technical-breakdown-experiments-1--6)
  - [Exp 1: Salary Transformation System](#1-salary-transformation-system-using-functional-programming)
  - [Exp 2: Real-Time Stream Analytics Engine](#2-real-time-stream-analytics-engine-using-stream-processing)
  - [Exp 3: Maximum Profit Analyzer (Kadane's DP)](#3-maximum-profit-analyzer-using-kadanes-algorithm)
  - [Exp 4: Intelligent DNA Pattern Search (KMP Algorithm)](#4-intelligent-dna-pattern-search-using-kmp-algorithm)
  - [Exp 5: Banking Transaction System (OOP & Encapsulation)](#5-banking-transaction-system-using-object-oriented-programming)
  - [Exp 6: Ride Sharing Platform Simulator (Polymorphism & Exceptions)](#6-ride-sharing-platform-simulator-using-oop-and-polymorphism)
- [🛡️ Testing & Edge-Case Hardening](#-testing--edge-case-hardening)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)

---

## 🎯 Core Architectural Paradigms

1. **Declarative Stream Pipelining:** Replaces imperative mutation loops with functional pipelines (`stream()`, `map()`, `filter()`, `forEach()`), preventing data corruption and thread hazards.
2. **Real-Time Telemetry Aggregation:** Implements map-based bucketing (`computeIfAbsent`) combined with primitive stream reducers (`IntStream.average()`) to produce sorted metric reports in $O(N + U \log U)$ time.
3. **Continuous State Tracking (Kadane's DP):** Achieves single-pass $O(N)$ determination of optimal contiguous subarray values using local-versus-global recurrence relations in $O(1)$ auxiliary memory.
4. **Deterministic String Automata (KMP):** Employs the Knuth-Morris-Pratt failure function ($\pi$ / Longest Prefix Suffix array) to achieve linear $O(N+M)$ pattern recognition over DNA sequences without character backtracking.
5. **Encapsulated Domain Modeling:** Enforces data hiding by isolating balance states behind strict domain mutators (`deposit`, `withdraw`), preventing external boundary breaches.
6. **Polymorphic Dynamic Dispatch & Fault Tolerance:** Uses abstract contracts (`Vehicle`) and runtime method dispatch to calculate tariffs, coupled with checked custom exception hierarchies (`InvalidBookingException`) for resilient validation.

---

## 💻 Laboratory Experiments Catalog

| Exp # | Experiment Title | Difficulty | Architectural Focus | Time Complexity | Space Complexity | Solution Code |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: |
| 1 | **[Salary Transformation System](./01-Salary-Transformation-System/)** | 🟢 Easy | Stream API, Immutability, Pipelines | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | [Task1.java](./01-Salary-Transformation-System/Task1.java) |
| 2 | **[Real-Time Stream Analytics Engine](./02-RealTime-Stream-Analytics-Engine/)** | 🟡 Medium | Ingestion, `computeIfAbsent`, Average, Sorting | $\mathcal{O}(N + U \log U)$ | $\mathcal{O}(N)$ | [Task2.java](./02-RealTime-Stream-Analytics-Engine/Task2.java) |
| 3 | **[Maximum Profit Analyzer](./03-Maximum-Profit-Analyzer-Kadane/)** | 🟡 Medium | Kadane's Algorithm, Continuous Max Sum | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Task3.java](./03-Maximum-Profit-Analyzer-Kadane/Task3.java) |
| 4 | **[Intelligent DNA Pattern Search](./04-DNA-Pattern-Search-KMP/)** | 🔴 Hard | Knuth-Morris-Pratt (KMP), LPS Array | $\mathcal{O}(N + M)$ | $\mathcal{O}(M)$ | [Task4.java](./04-DNA-Pattern-Search-KMP/Task4.java) |
| 5 | **[Banking Transaction System](./05-Banking-Transaction-System-OOP/)** | 🟢 Easy | Encapsulation, State Control, Mutators | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Task5.java](./05-Banking-Transaction-System-OOP/Task5.java) |
| 6 | **[Ride Sharing Platform Simulator](./06-RideSharing-Platform-Simulator/)** | 🟡 Medium | Polymorphism, Dynamic Dispatch, Exceptions | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Task6.java](./06-RideSharing-Platform-Simulator/Task6.java) |

---

## 🧠 In-Depth Technical Breakdown (Experiments 1 – 6)

---

### 1. Salary Transformation System Using Functional Programming
*Directory:* [`01-Salary-Transformation-System`](./01-Salary-Transformation-System/) &nbsp;\|&nbsp; *Source:* [`Task1.java`](./01-Salary-Transformation-System/Task1.java)

#### Problem Statement
Given $N$ employee compensation figures, apply a mandatory 10% increment to every record and output the transformed values. The solution must strictly adhere to functional paradigms, prohibiting mutable accumulator loops (`for`, `while`).

#### Architecture & Pipeline
1. **List Ingestion:** Collect raw integers into an `ArrayList<Integer>`.
2. **Transformation (`map`):** Stream elements sequentially; compute `salary + (salary * 10 / 100)` for each value immutably.
3. **Terminal Consumer (`forEach`):** Stream elements directly to standard output.

```text
Raw Salaries:   [ 1000, 2000, 3000 ]
                     │
              .stream().map(s -> s + s*0.10)
                     ▼
Output Stream:  [ 1100, 2200, 3300 ]
```

```java
salaries.stream()
        .map(salary -> salary + (salary * 10 / 100))
        .forEach(salary -> System.out.print(salary + " "));
```

- **Complexity:** $\mathcal{O}(N)$ Time &nbsp;\|&nbsp; $\mathcal{O}(N)$ Space
- **Sample I/O:**
  ```text
  Input:          Output:
  3               1100 2200 3300
  1000 2000 3000
  ```

---

### 2. Real-Time Stream Analytics Engine Using Stream Processing
*Directory:* [`02-RealTime-Stream-Analytics-Engine`](./02-RealTime-Stream-Analytics-Engine/) &nbsp;\|&nbsp; *Source:* [`Task2.java`](./02-RealTime-Stream-Analytics-Engine/Task2.java)

#### Problem Statement
Simulate a streaming ingestion engine monitoring continuous sensor feeds. Given telemetry pairs `(Sensor ID, Temperature)`, the system must:
1. Filter out sub-threshold readings where $\text{Temperature} \le 50$.
2. Bucket readings per unique sensor identifier.
3. Calculate the arithmetic mean temperature for each active sensor.
4. Output the sensor summaries sorted descending by mean temperature.

#### Architecture & Pipeline
1. **Dynamic Bucketing:** Uses `Map<String, List<Integer>>` populated via `map.computeIfAbsent(id, k -> new ArrayList<>()).add(temp)` only if `temp > 50`.
2. **Intermediate Reduction:** Transforms `map.entrySet()` into `SimpleEntry<String, Double>` pairs via `.mapToInt(Integer::intValue).average().orElse(0.0)`.
3. **Descending Projection:** Applies `.sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))` and consumes via `.forEach()`.

```java
map.entrySet().stream()
        .map(e -> new AbstractMap.SimpleEntry<>(
                e.getKey(),
                e.getValue().stream().mapToInt(Integer::intValue).average().orElse(0.0)))
        .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
        .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
```

- **Complexity:** $\mathcal{O}(N + U \log U)$ Time ($U = \text{unique sensors}$) &nbsp;\|&nbsp; $\mathcal{O}(N)$ Space
- **Sample I/O:**
  ```text
  Input:       Output:
  4            S3 80.0
  S1 60        S1 65.0
  S2 45
  S1 70
  S3 80
  ```

---

### 3. Maximum Profit Analyzer Using Kadane's Algorithm
*Directory:* [`03-Maximum-Profit-Analyzer-Kadane`](./03-Maximum-Profit-Analyzer-Kadane/) &nbsp;\|&nbsp; *Source:* [`Task3.java`](./03-Maximum-Profit-Analyzer-Kadane/Task3.java)

#### Problem Statement
Given a historical ledger of $N$ periodic financial returns (positive for profits, negative for losses), determine the maximum cumulative return attainable from any contiguous operating window.

#### Algorithmic Approach
Kadane's algorithm maintains two dynamic states in a single linear sweep:
- **Local Optimum (`currentSum`):** Decides whether to continue the existing contiguous subarray or start fresh from the current day:
  $$\text{currentSum}_i = \max(\text{value}_i, \text{currentSum}_{i-1} + \text{value}_i)$$
- **Global Optimum (`maxSum`):** Retains the peak cumulative sum observed across all states:
  $$\text{maxSum}_i = \max(\text{maxSum}_{i-1}, \text{currentSum}_i)$$

```java
int currentSum = sc.nextInt();
int maxSum = currentSum;

for (int i = 1; i < n; i++) {
    int value = sc.nextInt();
    currentSum = Math.max(value, currentSum + value);
    maxSum = Math.max(maxSum, currentSum);
}
System.out.println(maxSum);
```

- **Complexity:** $\mathcal{O}(N)$ Time &nbsp;\|&nbsp; $\mathcal{O}(1)$ Auxiliary Space
- **Sample I/O:**
  ```text
  Input:                         Output:
  9                              6  (Subarray: [4, -1, 2, 1])
  -2 1 -3 4 -1 2 1 -5 4
  ```

---

### 4. Intelligent DNA Pattern Search Using KMP Algorithm
*Directory:* [`04-DNA-Pattern-Search-KMP`](./04-DNA-Pattern-Search-KMP/) &nbsp;\|&nbsp; *Source:* [`Task4.java`](./04-DNA-Pattern-Search-KMP/Task4.java)

#### Problem Statement
Locate all 0-indexed starting loci of a genomic pattern sequence within a reference DNA chromosome without suffering quadratic worst-case slowdowns on repetitive sequences.

#### Algorithmic Approach
1. **LPS (Longest Proper Prefix which is also Suffix) Pre-processing:** Constructs table `lps` of size $M$. If a mismatch occurs at `pattern[j]`, `lps[j-1]` denotes the length of the longest matching prefix, allowing the search pattern to slide forward without resetting the text cursor $i$.
2. **Linear Text Traversal:**
   - On character match: advance both $i$ and $j$.
   - On complete match ($j == M$): record match offset $i - j$, transition $j = \text{lps}[j-1]$.
   - On mismatch: if $j \neq 0$, fall back to $j = \text{lps}[j-1]$; if $j == 0$, increment $i$.

```text
Pattern:  A  B  A  B  C  A  B  A  B
LPS:     [0, 0, 1, 2, 0, 1, 2, 3, 4]
```

```java
static int[] buildLPS(String pattern) {
    int m = pattern.length();
    int[] lps = new int[m];
    int len = 0, i = 1;

    while (i < m) {
        if (pattern.charAt(i) == pattern.charAt(len)) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) len = lps[len - 1];
            else { lps[i] = 0; i++; }
        }
    }
    return lps;
}
```

- **Complexity:** $\mathcal{O}(N + M)$ Time &nbsp;\|&nbsp; $\mathcal{O}(M)$ Space
- **Sample I/O:**
  ```text
  Input:                    Output:
  ABABDABACDABABCABAB       10
  ABABCABAB
  ```

---

### 5. Banking Transaction System Using Object-Oriented Programming
*Directory:* [`05-Banking-Transaction-System-OOP`](./05-Banking-Transaction-System-OOP/) &nbsp;\|&nbsp; *Source:* [`Task5.java`](./05-Banking-Transaction-System-OOP/Task5.java)

#### Problem Statement
Design an atomic ledger component to manage a user's bank account. The system must process a stream of $N$ incoming operations (`Deposit` or `Withdraw`) while preventing unauthorized external tampering of the internal state.

#### Domain Architecture & Encapsulation
- **Class `BankAccount`:** Enforces encapsulation by declaring `balance` with `private` visibility.
- **State Mutators:** Public mutators `deposit(int amount)` and `withdraw(int amount)` control state transitions safely.
- **State Observer:** `getBalance()` returns the final computed balance.

```java
class BankAccount {
    private int balance = 0;

    void deposit(int amount)  { balance += amount; }
    void withdraw(int amount) { balance -= amount; }
    int getBalance()          { return balance; }
}
```

- **Complexity:** $\mathcal{O}(N)$ Time ($\mathcal{O}(1)$ per transaction) &nbsp;\|&nbsp; $\mathcal{O}(1)$ Space
- **Sample I/O:**
  ```text
  Input:           Output:
  3                1300
  Deposit 1000
  Withdraw 200
  Deposit 500
  ```

---

### 6. Ride Sharing Platform Simulator Using OOP and Polymorphism
*Directory:* [`06-RideSharing-Platform-Simulator`](./06-RideSharing-Platform-Simulator/) &nbsp;\|&nbsp; *Source:* [`Task6.java`](./06-RideSharing-Platform-Simulator/Task6.java)

#### Problem Statement
Build an extensible fare calculation engine for a multi-modal ride sharing application (`Bike`, `Auto`, `Cab`). The platform must calculate distance-dependent tariffs via polymorphic dynamic dispatch and gracefully handle invalid ride types or non-positive journey distances.

#### Architecture & Dynamic Dispatch
1. **Abstract Contract:** Base class `abstract class Vehicle` defines `abstract int calculateFare(int distance)`.
2. **Polymorphic Specialization:**
   - `Bike`: Tariff rate is $\$5$ per km (`distance * 5`).
   - `Auto`: Tariff rate is $\$12$ per km (`distance * 12`).
   - `Cab`: Tariff rate is $\$12$ per km (`distance * 12`).
3. **Checked Exception Architecture:** `InvalidBookingException` is thrown when distance $\le 0$ or when an unsupported vehicle string is supplied.

```java
abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    int calculateFare(int distance) { return distance * 5; }
}

class Auto extends Vehicle {
    int calculateFare(int distance) { return distance * 12; }
}

class Cab extends Vehicle {
    int calculateFare(int distance) { return distance * 12; }
}
```

- **Complexity:** $\mathcal{O}(N)$ Time ($\mathcal{O}(1)$ per ride dispatch) &nbsp;\|&nbsp; $\mathcal{O}(1)$ Space
- **Sample I/O:**
  ```text
  Input:             Output:
  3                  50
  Bike 10            60
  Auto 5             Invalid ride type
  Helicopter 100
  ```

---

## 🛡️ Testing & Edge-Case Hardening

The laboratory implementations incorporate defense mechanisms against critical operational edge cases:

```text
┌─────────────────────────────────────────────────────────────────────────────┐
│                 LABORATORY EDGE-CASE VERIFICATION SCENARIOS                 │
├───────────────────────┬─────────────────────────────────────────────────────┤
│ Module                │ Defensive Guardrail Tested                          │
├───────────────────────┼─────────────────────────────────────────────────────┤
│ Exp 1: Salary Streams │ Zero employee entries, large individual salaries    │
│ Exp 2: Stream Engine  │ All readings below threshold (<= 50), single sensor │
│ Exp 3: Profit Kadane  │ All negative profit entries (prevents zero bug)     │
│ Exp 4: DNA KMP Match  │ Pattern longer than text, repeated prefixes "AAAA"  │
│ Exp 5: Bank Account   │ Rapid consecutive deposits/withdrawals, zero balance│
│ Exp 6: Ride Platform  │ Zero or negative distance, unregistered ride types  │
└───────────────────────┴─────────────────────────────────────────────────────┘
```

---

## ⚙️ How to Compile & Run

Every experiment is self-contained. Navigate to any experiment directory and compile with `javac`:

```bash
# Experiment 1: Salary Transformation System
cd "01-Salary-Transformation-System"
javac Task1.java
java Task1

# Experiment 2: Real-Time Stream Analytics Engine
cd "../02-RealTime-Stream-Analytics-Engine"
javac Task2.java
java Task2

# Experiment 3: Maximum Profit Analyzer
cd "../03-Maximum-Profit-Analyzer-Kadane"
javac Task3.java
java Task3

# Experiment 4: Intelligent DNA Pattern Search
cd "../04-DNA-Pattern-Search-KMP"
javac Task4.java
java Task4

# Experiment 5: Banking Transaction System
cd "../05-Banking-Transaction-System-OOP"
javac Task5.java
java Task5

# Experiment 6: Ride Sharing Platform Simulator
cd "../06-RideSharing-Platform-Simulator"
javac Task6.java
java Task6
```

---

<div align="center">

[⬅️ Back to Master README](../README.md)

</div>
