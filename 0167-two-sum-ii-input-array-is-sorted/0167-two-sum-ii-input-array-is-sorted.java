class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] ans = new int[2];
        while(left<right){
            if(target == numbers[left]+numbers[right]){
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
            else if(target > numbers[left]+numbers[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
        
    }
}