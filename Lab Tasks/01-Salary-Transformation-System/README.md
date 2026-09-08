# Experiment 1: Salary Transformation System Using Functional Programming Techniques

## 📝 Problem Statement
Given a list of `N` employee salaries, apply a 10% raise to each salary and print the updated salaries. This must be done without using traditional `for` or `while` loops to mutate the data.

## 🧠 Core Concepts
- **Java Collections Framework**: Using `ArrayList` to store integer sequences.
- **Functional Programming**: Immutably processing data via pipelines.
- **Java Stream API**: Specifically using `stream()`, `map()`, and `forEach()`.

## ⚙️ Algorithmic Approach & Logic
Instead of iterating through the salaries and updating them in-place, the solution leverages the Java 8 Stream API:
1. **Creation**: `salaries.stream()` creates a sequential stream from the list.
2. **Transformation (`map`)**: The intermediate operation `.map(salary -> salary + (salary * 10 / 100))` takes each salary and maps it to a new value representing the 10% raise.
3. **Consumption (`forEach`)**: The terminal operation `.forEach(salary -> System.out.print(salary + " "))` consumes the transformed stream and prints each element.

## ⏱️ Complexity Analysis
- **Time Complexity**: $\mathcal{O}(N)$ where $N$ is the number of salaries. The stream processes each element exactly once.
- **Space Complexity**: $\mathcal{O}(N)$ to store the original salaries in the `ArrayList`. The stream operations themselves use $\mathcal{O}(1)$ auxiliary space.

## 🚀 How to Run

### Compilation and Execution
```bash
javac Task1.java
java Task1
```

### Input Format
```text
N
salary_1 salary_2 ... salary_N
```

### Sample Input/Output
**Input:**
```text
3
1000 2000 3000
```
**Output:**
```text
1100 2200 3300 
```
