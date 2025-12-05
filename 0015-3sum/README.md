# 15. 3Sum

**[View Problem on LeetCode](https://leetcode.com/problems/3sum)**

### 🛠 Pattern: Two Pointers (with Sorting)

This problem is essentially an extension of **Two Sum**, but applied multiple times.



### 💡 The Concept

The brute force approach requires three nested loops, resulting in $O(N^3)$ complexity. We can optimize this significantly by **Sorting** the array first.

Once the array is sorted, the logic becomes:
1.  **Fix one number** (`nums[i]`).
2.  **Find two other numbers** (`nums[left]` and `nums[right]`) that sum up to `-nums[i]` using the **Two Pointers** pattern.

### 📝 Step-by-Step Logic

1.  **Sort the Array:** This is crucial. It allows us to use the Two Pointers technique and makes skipping duplicates easy.
2.  **Iterate:** Loop through the array with index `i`. This is our "fixed" number.
3.  **Two Pointers:** Set `left = i + 1` and `right = n - 1`.
4.  **Check Sum:**
    * If `nums[i] + nums[left] + nums[right] < 0`: We need a larger sum, so move `left` forward.
    * If `sum > 0`: We need a smaller sum, so move `right` backward.
    * If `sum == 0`: We found a triplet! Add it to the result.
5.  **Handle Duplicates:**
    * Skip `i` if it's the same as the previous number.
    * After finding a valid triplet, skip `left` and `right` forward/backward if they point to the same values to avoid duplicate triplets in the output.

### 🚀 Complexity Analysis

* **Time Complexity:** $O(N^2)$ — Sorting takes $O(N \log N)$. The nested loop structure (outer loop + inner two pointers) runs in $O(N^2)$. Since $N^2$ dominates, the total is $O(N^2)$.
* **Space Complexity:** $O(1)$ (or $O(\log N)$ depending on sorting implementation) — We do not use extra data structures like Hash Maps; we only store the output.

---

### Key Takeaway
Whenever you need to find **multiple elements** that satisfy a condition (like summing to 0) and the output order doesn't matter, **Sorting** is usually the first step. It simplifies the problem into a linear scan using Two Pointers.
