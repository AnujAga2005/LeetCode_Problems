class Solution {
    public String reversePrefix(String s, int k) {
        if(s.length()==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}