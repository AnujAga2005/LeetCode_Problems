class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int n = needle.length();
        for(int i=0; i<=haystack.length()-needle.length();i++){
            int count = 1;
            if(needle.charAt(0)==haystack.charAt(i)){
            for(int j=1; j<n; j++){
                if(needle.charAt(j)==haystack.charAt(i+j)){
                    count++;
                }else{
                    break;
                }
                
            }
            if(count == n){
                return i;
            }
            }
        }
        return -1;
    }
}