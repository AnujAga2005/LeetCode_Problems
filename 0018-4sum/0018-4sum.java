class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n;){
                int p = j+1, q=n-1;

                while(p<q){
                    List<Integer> part = new ArrayList<>();
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[p]+(long)nums[q];
                    if(sum<target){
                        p++;
                    }else if(sum>target){
                        q--;
                    }else{
                        part.add(nums[i]);
                        part.add(nums[j]);
                        part.add(nums[p]);
                        part.add(nums[q]);
                        ans.add(part);
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]) p++;
                    }
                }
                j++;
                while(j<n && nums[j]==nums[j-1]) j++;
            }
        }
        return ans;
    }
}