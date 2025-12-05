# 33. Search in Rotated Sorted Array

**[View Problem on LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array)**

### 🛠 Pattern: Modified Binary Search

The requirement for $O(\log N)$ complexity immediately suggests **Binary Search**, but since the array is rotated, we cannot apply the standard logic directly. We use a **Modified Binary Search**.



### 💡 The Concept

A rotated sorted array (e.g., `[4,5,6,7,0,1,2]`) has a unique property: **At any pivot point (mid), one half of the array is always sorted.**

To solve this, we don't just check "Is the target larger than mid?". We first check: **"Which side of the array is sorted?"**

1.  **If the Left side is sorted:** We check if the target lies within this sorted range. If yes, go left. If no, go right.
2.  **If the Right side is sorted:** We check if the target lies within this sorted range. If yes, go right. If no, go left.

### 📝 Step-by-Step Logic

1.  **Initialize:** `left = 0`, `right = n - 1`.
2.  **Loop:** While `left <= right`:
    * Calculate `mid`.
    * **Found it?** If `nums[mid] == target`, return `mid`.
    * **Identify Sorted Half:**
        * **Case 1: Left side is sorted** (`nums[left] <= nums[mid]`)
            * Does the target exist here? (`nums[left] <= target < nums[mid]`)?
            * **Yes:** Search Left (`right = mid - 1`).
            * **No:** Search Right (`left = mid + 1`).
        * **Case 2: Right side is sorted** (Implicitly, if left isn't sorted, right must be)
            * Does the target exist here? (`nums[mid] < target <= nums[right]`)?
            * **Yes:** Search Right (`left = mid + 1`).
            * **No:** Search Left (`right = mid - 1`).
3.  **End:** If the loop finishes without finding the target, return `-1`.

### 🚀 Complexity Analysis

* **Time Complexity:** $O(\log N)$ — We divide the search space by half in every iteration, regardless of the rotation.
* **Space Complexity:** $O(1)$ — Iterative binary search requires no extra space.

---

### Key Takeaway
When applying Binary Search to "broken" or "rotated" sorted arrays, always ask: **"Which half is sorted?"** Use the sorted half to make the decision of where to eliminate data.
