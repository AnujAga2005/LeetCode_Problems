class Solution {

    public int lcs(int[][] memo, String t1, String t2, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if(memo[n][m]!=-1){
            return memo[n][m];
        }
        if(t1.charAt(n-1) == t2.charAt(m-1)){
            return memo[n][m] = 1+lcs(memo, t1,t2,n-1,m-1);
        }
        else{
            int ans1 = lcs(memo, t1,t2,n,m-1);
            int ans2 = lcs(memo, t1,t2,n-1,m);
            return memo[n][m] = Math.max(ans1,ans2);
        }

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] memo = new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<text1.length()+1; i++){
            for(int j=0; j<text2.length()+1; j++){
                memo[i][j] = -1;
            }
        }
        int ans = lcs(memo, text1, text2, text1.length(), text2.length());
        return ans;
        
    }
}