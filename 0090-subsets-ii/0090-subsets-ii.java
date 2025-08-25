import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        backtrack(nums,0, new ArrayList<>(), set);
        return new ArrayList<>(set);
    }
    private void backtrack(int[] nums, int i, List<Integer> ls1, Set<List<Integer>> set) {
        if (i==nums.length) {
            set.add(new ArrayList<>(ls1));
            return;
        }
        ls1.add(nums[i]);
        backtrack(nums, i + 1, ls1, set);
        ls1.remove(ls1.size()-1);
        backtrack(nums, i+1, ls1, set);
    }
}
