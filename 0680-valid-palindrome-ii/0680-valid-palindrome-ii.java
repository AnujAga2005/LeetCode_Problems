class Solution {
    public boolean validPalindrome(String s) {
        int si=0;
        int ei=s.length()-1;
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return isValidPalindrome(s,si+1,ei) || isValidPalindrome(s,si,ei-1);
            }
            si++;
            ei--;
        }
        return true;
    }
    public boolean isValidPalindrome(String s, int si, int ei){
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}