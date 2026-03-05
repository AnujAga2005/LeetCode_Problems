class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int size = timeSeries.length;
        int output = 0;
        for(int i=0; i<size-1; i++){
            if(timeSeries[i]+duration-1>=timeSeries[i+1]){
                output += timeSeries[i+1]-timeSeries[i];
            }
            else{
                output+= duration;
            }
        }
        output += duration;
        return output;
        
    }
}