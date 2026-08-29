class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int bit = 0; bit<32; bit++){
            int temp = 1<<bit;
            int countZeros = 0;
            int countOnes = 0;
            for(int num: nums){
                if((num & temp) == 0) countZeros++;
                else countOnes++;

            }
            if(countOnes%3==1) result = result | temp;

        }

        return result;
        
    }
}