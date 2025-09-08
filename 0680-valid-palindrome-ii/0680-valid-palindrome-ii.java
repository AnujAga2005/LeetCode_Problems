class Solution {
    public boolean validPalindrome(String s) {
        int si = 0;
        int ei = s.length()-1;
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return validPalindrome2(s, si+1, ei) || validPalindrome2(s, si, ei-1);
            }else{
                si++;
                ei--;
            }
        }
        return true;
    }

    public boolean validPalindrome2(String s, int si, int ei){
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }else{
                si++;
                ei--;
            }
        }
        return true;
    }
}