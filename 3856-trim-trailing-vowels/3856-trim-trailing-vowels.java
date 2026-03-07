class Solution {
    public String trimTrailingVowels(String s) {
        int i = s.length()-1;
        while(i>=0){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                i--;
            }else{
                break;
            }
        }
        return s.substring(0,i+1);
        
    }
}