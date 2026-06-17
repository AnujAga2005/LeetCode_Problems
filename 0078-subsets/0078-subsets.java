class Solution {
    public void backtrack(int n, int[] nums, List<Integer> part,List<List<Integer>> ans ){
        if(n==nums.length){
            ans.add(new ArrayList<>(part));
            return;
        }
        part.add(nums[n]);
        backtrack(n+1, nums, part, ans);
        part.remove(part.size()-1);
        backtrack(n+1, nums, part,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> part = new ArrayList<Integer>();
        backtrack(0, nums, part, ans);
        return ans;        
    }
}