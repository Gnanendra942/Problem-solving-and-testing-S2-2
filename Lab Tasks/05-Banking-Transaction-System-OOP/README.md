# Experiment 5: Banking Transaction System Using Object-Oriented Programming

## 📝 Problem Statement
Simulate a simple banking system that processes a sequence of 'Deposit' and 'Withdraw' transactions and calculates the final account balance.

## 🧠 Core Concepts
- **Object-Oriented Programming (OOP)**: Modeling real-world entities (Bank Account) as objects.
- **Encapsulation**: Hiding internal state (`balance`) and restricting access via public methods (`deposit`, `withdraw`).
- **State Management**: Maintaining an object's state across multiple method calls.

## ⚙️ Algorithmic Approach & Logic
1. **Class Design (`BankAccount`)**:
   - The class contains a `private int balance` to prevent external modification.
   - It exposes controlled operations: `deposit(amount)` increases the balance, and `withdraw(amount)` decreases it.
   - A `getBalance()` method allows read-only access to the final state.
2. **Transaction Processing (`Task5`)**:
   - We instantiate a `BankAccount` object, which starts with a balance of $0$.
   - For $N$ transactions, we read the operation type (`Deposit` or `Withdraw`) and the amount.
   - Based on the string input, we dispatch the corresponding method on the `BankAccount` object.
   - Finally, we print the updated balance.

## ⏱️ Complexity Analysis
- **Time Complexity**: $\mathcal{O}(N)$ where $N$ is the number of transactions. Each transaction is processed in $\mathcal{O}(1)$ time.
- **Space Complexity**: $\mathcal{O}(1)$ since the `BankAccount` object uses a single integer to track the balance, regardless of how many transactions are processed.

## 🚀 How to Run

### Compilation and Execution
```bash
javac Task5.java
java Task5
```

### Input Format
```text
N
Operation_1 Amount_1
Operation_2 Amount_2
...
```

### Sample Input/Output
**Input:**
```text
3
Deposit 1000
Withdraw 200
Deposit 500
```
**Output:**
```text
1300
```
