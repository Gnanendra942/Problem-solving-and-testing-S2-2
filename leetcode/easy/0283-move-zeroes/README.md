# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.90%)  
**Memory:** 47.8 MB (beats 57.66%)  
**Submitted:** 2026-08-11T08:59:01.182Z  

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i =0;
        for (int j =0;j<n;j++)
        {
            if(nums[j] != 0)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k = i ; k<n ;k++)
        {
            nums[k] = 0;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)