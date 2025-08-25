import java.util.Comparator;
import java.util.PriorityQueue;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        for(int i=0; i<k-1;i++){
            pq.remove();
        }
        return pq.peek();
        
    }
}