class Solution {

    public int lcs(int[][] dp, String t1, String t2, int n, int m){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        int ans = lcs(dp, text1, text2, text1.length(), text2.length());
        return ans;
        
    }
}