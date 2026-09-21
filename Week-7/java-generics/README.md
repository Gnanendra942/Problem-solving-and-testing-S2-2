# Java Generics

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a **single** method *printArray* that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

    1
    2
    3
    Hello
    World

Do not use method overloading because your answer will not be accepted.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T06:00:22.939Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    // Generic method to print array elements of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Create integer and string arrays
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        
        // Pass both arrays to the same generic method
        printArray(intArray);
        printArray(stringArray);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-generics/problem)