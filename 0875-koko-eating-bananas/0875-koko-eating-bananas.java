class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int pile: piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }
        while(minSpeed<maxSpeed){
            int mid = minSpeed + (maxSpeed-minSpeed)/2;
            int hours = 0;
            for(int pile: piles){
                hours += (int)Math.ceil((double)pile/mid);
            }
            if(hours>h){
                minSpeed = mid+1;
            }else maxSpeed = mid;
        }
        return minSpeed;
    }
}