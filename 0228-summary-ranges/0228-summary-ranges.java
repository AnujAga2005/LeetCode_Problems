class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();
        if (nums.length == 0) return arr;

        int start = nums[0];

        for (int i = 1; i<=nums.length; i++) {
            if (i<nums.length && nums[i-1]+1 == nums[i]) {
                continue;
            }
            int end = nums[i-1];
            arr.add(start == end ? String.valueOf(start) : start + "->" + end);
            if (i<nums.length) start = nums[i];
        }
        return arr;
    }
}