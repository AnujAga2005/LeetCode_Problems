class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(end>=s){
                end = Math.max(e,end);
            }else{
                ans.add(new int[]{start,end});
                end = e;
                start = s;
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}