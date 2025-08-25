class Solution {
    public void nextPermutation(int[] nums) {
        int pivot  = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot==-1){
            reverse(nums, 0 , nums.length-1);
            return;
        }

        for(int i=n-1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        reverse(nums, pivot+1 , nums.length-1);
        
    }
    public static void reverse(int[] arr ,int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}