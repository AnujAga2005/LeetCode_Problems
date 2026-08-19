class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<nums.length; i++){
            s.push(nums[i]);
        }
        
        for(int lap=0; lap<2; lap++){
            for(int i=n-1; i>=0; i--){
                while(!s.isEmpty()){
                    if(s.peek()>nums[i]){
                        ans[i] = s.peek();
                        break;
                    }
                    s.pop();
                    if(s.isEmpty()){
                        ans[i] = -1;
                        break;
                    }
                }
                s.push(nums[i]);
            }
        }
        return ans;
    }
}