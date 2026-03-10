class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            if(pq.size()<3){
                pq.add(nums[i]);
                set.add(nums[i]);
            } 
            else{
                if(nums[i]>pq.peek()){
                    set.remove(pq.poll());
                    pq.add(nums[i]);
                    set.add(nums[i]);
                }
            }
        }
        if(pq.size()!=2) return pq.peek();
        pq.poll();
        return pq.peek();
    }
}