# Design HashSet

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Design a HashSet without using any built-in hash table libraries.

Implement `MyHashSet` class:

- void add(key) Inserts the value key into the HashSet.
- bool contains(key) Returns whether the value key exists in the HashSet or not.
- void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

 

 **Example 1:** 

```
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
```

 

 **Constraints:** 

- 0 <= key <= 106
- At most 104 calls will be made to add, remove, and contains.

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 96.45%)  
**Memory:** 54.4 MB (beats 26.91%)  
**Submitted:** 2026-09-21T05:50:41.604Z  

```java
class MyHashSet {

    private boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1_000_001]; // Initialize array for keys in range [0, 1000000]
    }

    public void add(int key) {
        storage[key] = true; // Mark key as present
    }

    public void remove(int key) {
        storage[key] = false; // Mark key as absent
    }

    public boolean contains(int key) {
        return storage[key]; // Check if key is present
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/design-hashset/)