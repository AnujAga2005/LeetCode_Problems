class Solution {
    public int digitFrequencyScore(int n) {
        if(n==0){
            return 0;
        }
        int ans = 0;
        while(n>0){
            int temp = n%10;
            ans+=temp;
            n=n/10;
        }
        
        return ans;
    }
}