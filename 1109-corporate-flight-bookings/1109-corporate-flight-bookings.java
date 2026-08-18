class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n+2];
        for(int i=0; i<bookings.length; i++){
            int start = bookings[i][0];
            int end = bookings[i][1];
            int seats = bookings[i][2];
            ans[start] += seats;
            ans[end+1] -= seats;
        }
        for(int i=1; i<ans.length; i++){
            ans[i] += ans[i-1];
        }
        return Arrays.copyOfRange(ans, 1, n + 1);
    }
}