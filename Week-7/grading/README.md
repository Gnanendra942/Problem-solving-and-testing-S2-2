# Grading Students

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

HackerLand University has the following grading policy:

* Every student receives a $grade$ in the inclusive range from $0$ to $100$.
* Any $grade$ less than $40$ is a failing grade. 

Sam is a professor at the university and likes to round each student's $grade$ according to these rules:

* If the difference between the $grade$ and the next multiple of $5$ is less than $3$, round $grade$ up to the next multiple of $5$.
* If the value of $grade$ is less than $38$, no rounding occurs as the result will still be a failing grade.

**Examples**

- $grade = 84$ round to $85$ (85 - 84 is less than 3)  
- $grade = 29$ do not round (result is less than 38)  
- $grade = 57$ do not round (60 - 57 is 3 or higher)   

Given the initial value of $grade$ for each of Sam's $n$ students, write code to automate the rounding process.   

**Function Description**  

Complete the function $gradingStudents$ with the following parameter(s):  

- $int\ grades[n]$: the grades before rounding  

**Returns**

- $int[n]$: the grades after rounding

**Input Format**

The first line contains a single integer, $n$, the number of students. 		
Each line $i$ of the $n$ subsequent lines contains a single integer, $grades[i]$.

**Constraints**

* $ 1 \le n \le 60 $
* $ 0 \le grades[i] \le 100 $

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T05:54:03.330Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        
        for (int grade : grades) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                int remainder = grade % 5;
                if (remainder >= 3) {
                    roundedGrades.add(grade + (5 - remainder));
                } else {
                    roundedGrades.add(grade); 
                }
            }
        }
        
        return roundedGrades;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/grading/problem)