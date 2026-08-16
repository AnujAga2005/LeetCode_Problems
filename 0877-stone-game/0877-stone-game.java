class Solution {
    int[][] t;
    int solve(int[] piles, int i, int j) {
        if (i>j) {
            return 0;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }
        int takeI = piles[i] + Math.min(
            solve(piles, i+2, j),
            solve(piles, i+1, j-1)
        );
        int takeJ = piles[j] + Math.min(
            solve(piles, i, j-2),
            solve(piles, i+1, j-1)
        );

        return t[i][j] = Math.max(takeI, takeJ);
    }

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        t = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(t[i], -1);
        }
        int sum = 0;
        for (int x : piles) {
            sum += x;
        }
        int aliceScore = solve(piles, 0, n - 1);
        return aliceScore > sum - aliceScore;
    }
}