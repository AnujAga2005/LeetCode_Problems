class Solution {

    public void backtrack(int[] nums, List<Integer> ls1, boolean[] used, List<List<Integer>> ls2){
        if(ls1.size()==nums.length){
            ls2.add(new ArrayList<>(ls1));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            ls1.add(nums[i]);
            used[i] = true;
            backtrack(nums,ls1,used, ls2);
            ls1.remove(ls1.size()-1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls2 = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], ls2);
        return ls2;
    }
}