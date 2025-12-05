# 26. Remove Duplicates from Sorted Array

**[View Problem on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array)**

### 🛠 Pattern: Two Pointers (Reader-Writer)

This problem uses the **Two Pointers** technique, specifically distinguishing between a "slow" pointer (the writer) and a "fast" pointer (the reader).



### 💡 The Concept

Since the array is **sorted**, all duplicate elements are grouped together. This allows us to scan the array and eliminate duplicates without using extra space (in-place).

We maintain two pointers:
1.  **The Writer (`i`):** Keeps track of the index where the *next* unique element should be placed.
2.  **The Reader (`j`):** Scans ahead to find unique elements.

### 📝 Step-by-Step Logic

1.  **Initialize:** Start the writer pointer `i` at index `0`.
2.  **Scan:** Start a loop with the reader pointer `j` from index `1` to the end.
3.  **Compare:** Check if the value at the reader `nums[j]` is different from the value at the writer `nums[i]`.
    * **If they are different:** It means we found a new unique number.
        * Move the writer `i` forward (`i++`).
        * Copy the new value: `nums[i] = nums[j]`.
    * **If they are the same:** It is a duplicate. Do nothing; let the reader `j` keep moving forward to skip it.
4.  **Result:** The number of unique elements is `i + 1`.

### 🚀 Complexity Analysis

* **Time Complexity:** $O(N)$ — The reader pointer traverses the array exactly once.
* **Space Complexity:** $O(1)$ — We modify the array in-place without using extra storage.

---

### Key Takeaway
For "in-place" array problems where you need to filter or compress data, use **Two Pointers**: one to read the current values and one to write the valid values, overwriting the data you no longer need.
