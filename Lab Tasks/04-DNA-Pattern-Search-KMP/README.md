# Experiment 4: Intelligent DNA Pattern Search System Using KMP Algorithm

## 📝 Problem Statement
Given a large DNA text sequence and a shorter pattern sequence, find and print the starting indices of all occurrences of the pattern within the text.

## 🧠 Core Concepts
- **String Matching**: Finding occurrences of a substring within a larger string.
- **KMP Algorithm (Knuth-Morris-Pratt)**: An optimal $\mathcal{O}(N+M)$ string searching algorithm.
- **LPS Array (Longest Prefix Suffix)**: The core pre-processing component of KMP.

## ⚙️ Algorithmic Approach & Logic
A naive search checks every possible starting position, leading to $\mathcal{O}(N \times M)$ worst-case time. KMP improves this by never re-evaluating matched characters:
1. **LPS Pre-processing (`buildLPS`)**:
   - We construct an array `lps` of the same length as the pattern.
   - `lps[i]` stores the length of the longest proper prefix of the pattern that is also a suffix of `pattern[0..i]`.
   - This array tells us how far we can safely skip ahead when a mismatch occurs.
2. **Searching (`search`)**:
   - We iterate through the `text` using index `i` and the `pattern` using index `j`.
   - If characters match (`text.charAt(i) == pattern.charAt(j)`), we increment both.
   - If we reach the end of the pattern (`j == m`), a match is found at index `i - j`, and we use `lps[j-1]` to continue searching.
   - On a mismatch (`text.charAt(i) != pattern.charAt(j)`), we update `j` using the `lps` array (`j = lps[j-1]`). If `j` is already $0$, we simply move to the next character in the text (`i++`).

## ⏱️ Complexity Analysis
- **Time Complexity**: 
  - LPS Array Construction: $\mathcal{O}(M)$ where $M$ is the length of the pattern.
  - Text Scanning: $\mathcal{O}(N)$ where $N$ is the length of the text.
  - Overall Time Complexity: $\mathcal{O}(N + M)$.
- **Space Complexity**: $\mathcal{O}(M)$ for storing the `lps` array.

## 🚀 How to Run

### Compilation and Execution
```bash
javac Task4.java
java Task4
```

### Input Format
```text
text
pattern
```

### Sample Input/Output
**Input:**
```text
ABABDABACDABABCABAB
ABABCABAB
```
**Output:**
```text
10
```
