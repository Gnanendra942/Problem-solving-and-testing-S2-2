# Experiment 3: Maximum Profit Analyzer Using Kadane's Algorithm

## 📝 Problem Statement
Given an array of values (representing profits or losses over time), find the contiguous subarray that yields the maximum possible sum. This simulates finding the most profitable continuous sequence of days in a given timeframe.

## 🧠 Core Concepts
- **Dynamic Programming**: Kadane's algorithm is a greedy/dynamic programming approach.
- **Local vs Global Optima**: Maintaining the best possible result ending at the current position vs the best overall result seen so far.

## ⚙️ Algorithmic Approach & Logic
The solution implements **Kadane’s Algorithm**, which solves the Maximum Subarray Sum problem efficiently in a single pass.
1. **Initialization**: We track `currentSum` (the maximum sum of the subarray ending at the current index) and `maxSum` (the maximum sum found globally). Both are initialized to the first element of the array.
2. **Iteration**: For every subsequent element, we have two choices:
   - Extend the existing subarray: `currentSum + value`
   - Start a new subarray from the current element: `value`
   We set `currentSum = Math.max(value, currentSum + value)`.
3. **Global Update**: If the newly calculated `currentSum` is strictly greater than `maxSum`, we update `maxSum`.
4. **Termination**: Once the loop finishes, `maxSum` holds the largest contiguous sum.

## ⏱️ Complexity Analysis
- **Time Complexity**: $\mathcal{O}(N)$ where $N$ is the number of values. The algorithm scans the array exactly once.
- **Space Complexity**: $\mathcal{O}(1)$. We only require two integer variables (`currentSum` and `maxSum`) regardless of the input size, as we process the inputs on-the-fly without explicitly storing the array.

## 🚀 How to Run

### Compilation and Execution
```bash
javac Task3.java
java Task3
```

### Input Format
```text
n
value_1 value_2 ... value_n
```

### Sample Input/Output
**Input:**
```text
9
-2 1 -3 4 -1 2 1 -5 4
```
**Output:**
```text
6
```
*(Note: The optimal contiguous subarray is `[4, -1, 2, 1]` which sums to `6`)*
