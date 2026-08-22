class Solution {
    public int nthUglyNumber(int n) {
        int i2 = 1 ,  i3 = 1, i5 = 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            int min2 = dp[i2]*2;
            int min3 = dp[i3]*3;
            int min5 = dp[i5]*5;
            int minUgly = Math.min(min2, Math.min(min3,min5));
            dp[i] = minUgly;
            if(minUgly==min2) i2++;
            if(minUgly==min3) i3++;
            if(minUgly==min5) i5++;
        }
        return dp[n];
    }
}