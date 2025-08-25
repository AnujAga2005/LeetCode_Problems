class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        int totalSteps = m + n - 2;
        int r = Math.min(m - 1, n - 1);
        for (int i = 1; i <= r; i++) {
            res = res * (totalSteps - r + i) / i;
        }
        return (int) res;
    }
}