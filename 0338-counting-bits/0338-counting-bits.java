class Solution {
    public int ones(int n){
        int one = 0;
        while(n>0){
            if(n%2==1){
                one++;
            }
            n=n/2;
        }
        return one;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i] = ones(i);
        }
        return ans;
        
    }
}