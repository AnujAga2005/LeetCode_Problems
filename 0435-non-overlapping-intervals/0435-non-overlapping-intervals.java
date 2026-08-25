class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length ==0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[1]));
        int prev_interval = 0;
        int count = 1;
        for(int i =1 ; i<intervals.length; i++){
            if(intervals[i][0]>=intervals[prev_interval][1]){
                prev_interval = i;
                count++;
            }
        }
        return intervals.length-count;
        
    }
}