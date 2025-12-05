# 11. Container With Most Water

**[View Problem on LeetCode](https://leetcode.com/problems/container-with-most-water)**

### 🛠 Pattern: Two Pointers (Greedy Approach)

This problem is a classic example of the **Two Pointers** pattern optimized with a greedy choice.



### 💡 The Concept

Instead of calculating the area for every single pair of lines (which would be $O(N^2)$ and too slow), we start with the **maximum possible width** and shrink our window inwards.

1.  **Initialize Pointers:** Place one pointer (`left`) at the beginning and one (`right`) at the end of the array.
2.  **Calculate Area:** Compute the current area:
    $$Area = (right - left) \times \min(height[left], height[right])$$
3.  **The Greedy Move:** To potentially find a larger area, we need to overcome the reduction in width. The only way to get a larger area is to find a **taller line**.
    * If `height[left] < height[right]`: Move the `left` pointer forward. (The left line is the bottleneck).
    * Else: Move the `right` pointer backward.
4.  **Repeat:** Continue until the pointers meet.

### 🚀 Complexity Analysis

* **Time Complexity:** $O(N)$ — We scan the array exactly once, visiting each element at most once.
* **Space Complexity:** $O(1)$ — No extra data structures are used.

---

### Key Takeaway
When trying to maximize an area determined by `width * height`, start with the maximum width (Two Pointers at ends) and logically eliminate the limiting factor (the shorter height) at each step.
