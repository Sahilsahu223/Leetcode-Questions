class Solution {
    public int countPrimes(int n) {
        boolean[] marked = new boolean[n + 1];
        int ans = 0;
        for (int i = 2; i * i < n; i++){
            if (!marked[i]){
                for (int j = i * i; j < n; j += i){
                    marked[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++){
            if (!marked[i]){
                ans++;
            }
        }
        return ans;
    }
}