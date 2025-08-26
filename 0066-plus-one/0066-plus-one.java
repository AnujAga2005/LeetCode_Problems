class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length+1];
        int length = digits.length-1;
        int carry = 0;
        int j = ans.length-1;
        for(int i=1; i<=digits.length; i++){
            ans[i] = digits[i-1];
        }
        ans[j]+=1;
        while(ans[j--]>=10){
            ans[j+1] = ans[j+1]-10;
            ans[j]  = ans[j]+1;
        }
        if (ans[0] == 0) {
            int[] res = new int[digits.length];
            System.arraycopy(ans, 1, res, 0, digits.length);
            return res;
        }
        return ans;
    }
}