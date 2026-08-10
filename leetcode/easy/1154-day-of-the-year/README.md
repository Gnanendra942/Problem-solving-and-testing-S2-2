# Day of the Year

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `date` representing a Gregorian calendar date formatted as `YYYY-MM-DD`, return  *the day number of the year*.

 

 **Example 1:** 

```
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.

```

 **Example 2:** 

```
Input: date = "2019-02-10"
Output: 41

```

 

 **Constraints:** 

- date.length == 10
- date[4] == date[7] == '-', and all other date[i]'s are digits
- date represents a calendar date between Jan 1st, 1900 and Dec 31st, 2019.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 100.00%)  
**Memory:** 46.9 MB (beats 63.18%)  
**Submitted:** 2026-08-10T06:06:19.737Z  

```java
class Solution {
    // public int dayOfYear(String date) {
    //     int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    //     int[] arr = new int[3];
    //     boolean leap = false;
    //     int i = 0;
    //     int k = 0;
    //     while(i<date.length()){
    //         int temp = 0;
    //         while(i < date.length() && date.charAt(i) != '-'){
    //             temp = temp*10 + (date.charAt(i) - '0');
    //             i++;
    //         }
    //         arr[k++] = temp;
    //         i++;
    //     }
    //     if((arr[0]%400 == 0) || (arr[0] %4 == 0 && arr[0] %100 != 0)) leap = true;
    //     int ans = 0;
    //     for(int x = 1;x<arr[1];x++){
    //         if(x == 2 && leap) {
    //             ans += 29;
    //             continue;
    //         }
    //         ans += days[x];
    //     }
    //     return ans + arr[2];
    // }
    public int dayOfYear(String date) {
        int[] days = {0,31,59,90,120,151,181,212,243,273,304,334,365};
        int[] arr = new int[3];
        boolean leap = false;
        int i = 0;
        int k = 0;
        while(i<date.length()){
            int temp = 0;
            while(i < date.length() && date.charAt(i) != '-'){
                temp = temp*10 + (date.charAt(i) - '0');
                i++;
            }
            arr[k++] = temp;
            i++;
        }
        if((arr[0]%400 == 0) || (arr[0] %4 == 0 && arr[0] %100 != 0)) leap = true;
        return leap && (arr[1]-1 >=2) ? days[arr[1]-1] + arr[2] + 1: days[arr[1]-1] + arr[2];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/day-of-the-year/)