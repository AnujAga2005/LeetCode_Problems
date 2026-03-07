class Solution {
    public static int recurse(String s, int i){
        if(i<0 || (s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')){
            return i;
        }
        i--;
        return recurse(s, i);
    }
    public String trimTrailingVowels(String s) {
        int i = s.length()-1;
        int sub = recurse(s,i);
        String ans = s.substring(0,sub+1);
        return ans;
        
    }
}