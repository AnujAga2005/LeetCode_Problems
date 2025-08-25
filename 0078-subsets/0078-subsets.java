import java.util.ArrayList;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls2 = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        findSubsets(nums, 0, ls1, ls2);
        return ls2;
    }
    public void findSubsets(int[] nums, int i, List<Integer> ls1, List<List<Integer>> ls2) {
        if (i == nums.length) {
            ls2.add(new ArrayList<>(ls1));
            return;
        }
        ls1.add(nums[i]);
        findSubsets(nums, i + 1, ls1, ls2);
        ls1.remove(ls1.size() - 1);
        findSubsets(nums, i + 1, ls1, ls2);
    }
}
