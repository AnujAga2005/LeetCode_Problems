import java.util.ArrayList;
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] nums = new int[k+1];
        int m = 1 , n=0 , i=0;
        while(n < k){
            if(i < arr.length && arr[i] == m){
                i++;
            } else {
                nums[n] = m;
                n++;
            }
            m++;
        }
        int ans = nums[k-1];
        return ans;
        
    }
}