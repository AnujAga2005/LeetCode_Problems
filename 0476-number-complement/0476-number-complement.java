class Solution {
    public int findComplement(int num) {
        int mask = 1;
        while(mask<=num>>1){
            mask = mask<<1;
        }
        mask = (mask<<1)-1;
        int ans = mask^num;
        return ans;
        
    }
}