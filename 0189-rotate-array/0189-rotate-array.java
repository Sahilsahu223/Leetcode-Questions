class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int a[]= nums.clone();
       while(k>n){
        k=k-n;
       }
        for(int i = 0; i<n;i++){
            if(i<(n-k)){
                nums[i+k]=a[i];
            }
            else{
                if(n-i-k<0){
                    nums[i-n+k]=a[i];    
                }
                else{nums[n-i-k]=a[i];}
            }
        }
          }
    
    }
