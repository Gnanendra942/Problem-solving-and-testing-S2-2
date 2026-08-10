# Java Arraylist

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Sometimes it's better to use dynamic size arrays. Java's  [Arraylist](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) can provide you this feature. Try to solve this problem using Arraylist.<br>

You are given $n$ lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in $y^{th}$ position of $x^{th}$ line. <br>

Take your input from System.in.

**Input Format**<br>
The first line has an integer $n$. In each of the next $n$ lines there will be an integer $d$ denoting number of integers on that line and then there will be $d$ space-separated integers. In the next line there will be an integer $q$ denoting number of queries. Each query will consist of two integers $x$ and $y$.

**Constraints**<br>

* $1<=n<=20000$
* $0<=d<=50000$
* $1<=q<=1000$
* $1<=x<=n$

Each number will fit in signed integer.<br>
Total number of integers in $n$ lines will not cross $10^5$.<br>

**Output Format**<br>
In each line, output the number  located in $y^{th}$ position of $x^{th}$ line. If there is no such position, just print "ERROR!"



**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T06:28:21.775Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of lines (n)
        int n = sc.nextInt();
        
        // Use an ArrayList of ArrayLists to store the 2D dynamic structure
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // Number of integers in the current line
            ArrayList<Integer> currentLine = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                currentLine.add(sc.nextInt());
            }
            
            lines.add(currentLine);
        }
        
        // Read the number of queries (q)
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // 1-based line index
            int y = sc.nextInt(); // 1-based position index
            
            // Convert 1-based indexing to 0-based indexing for Java ArrayLists
            int lineIndex = x - 1;
            int elementIndex = y - 1;
            
            try {
                // Check if the line exists and the element index is within range
                if (lineIndex < lines.size() && elementIndex < lines.get(lineIndex).size()) {
                    System.out.println(lines.get(lineIndex).get(elementIndex));
                } else {
                    System.out.println("ERROR!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-arraylist/problem)