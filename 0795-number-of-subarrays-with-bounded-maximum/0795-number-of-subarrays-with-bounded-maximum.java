class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int lastValid = 0;
        int prev = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= left && nums[i] <= right) {
                lastValid = i - prev;
                ans += lastValid;
            } else if (nums[i] < right + 1 && nums[i] < left) {
                ans += lastValid;
            } else {
                lastValid = 0;
                prev = i;
            }
        }
        return ans;
    }
}