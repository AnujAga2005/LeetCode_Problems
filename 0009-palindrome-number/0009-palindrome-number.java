class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        if(x<0){
            return false;
        }
        while(temp!=0){
            int z = temp%10;
            rev = rev*10 + z;
            temp=temp/10;
            
        }
        if(rev == x){
            return true;
        }
        return false;
    }
}