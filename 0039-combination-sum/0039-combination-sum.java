class Solution {
    public void backtrack(int[] candidates, int target, List<Integer> part, List<List<Integer>> ans, int sum,int i){
        if(sum==target){
            ans.add(new ArrayList<>(part));
            return;
        }
        if(sum>target || i>=candidates.length){
            return;
        }
        part.add(candidates[i]);
        backtrack(candidates, target, part, ans, sum + candidates[i],i);
        part.remove(part.size() - 1);
        backtrack(candidates, target, part, ans, sum,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> part = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, part, ans, 0,0);
        return ans;
        
    }
}