# 27. Remove Element

**[View Problem on LeetCode](https://leetcode.com/problems/remove-element)**

### 🛠 Pattern: Two Pointers (Reader-Writer)

Just like "Remove Duplicates," this problem utilizes the **Two Pointers** technique to filter an array in-place.



### 💡 The Concept

The goal is to filter out a specific value (`val`) from the array without using extra space. Since arrays are fixed-size blocks of memory, we cannot actually "delete" a cell. Instead, we **overwrite** the unwanted values with the valid ones.

We use two pointers:
1.  **The Writer (`k`):** Tracks the position where the next *valid* element (non-`val`) should go.
2.  **The Reader (`i`):** Iterates through the array to check every number.

### 📝 Step-by-Step Logic

1.  **Initialize:** Start the writer pointer `k` at index `0`.
2.  **Scan:** Loop through the array with the reader pointer `i` from `0` to `n`.
3.  **Check:**
    * **If `nums[i] != val`:** This is a value we want to keep.
        * Copy it to the writer's position: `nums[k] = nums[i]`.
        * Increment the writer (`k++`).
    * **If `nums[i] == val`:** This is the value to remove.
        * Do nothing. We simply skip it. The writer (`k`) stays put, waiting to be overwritten by the next valid number found by the reader.
4.  **Result:** Return `k`. The first `k` elements of the array are now the valid numbers.

### 🚀 Complexity Analysis

* **Time Complexity:** $O(N)$ — We traverse the array exactly once.
* **Space Complexity:** $O(1)$ — We modify the array in-place.

---

### Key Takeaway
When you need to remove specific elements from an array **in-place**, don't think about "deleting." Think about **gathering** the good elements to the front using a writer pointer.
