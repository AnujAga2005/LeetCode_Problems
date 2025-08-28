class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int write = 1;
        for(int i=1 ; i<=chars.length; i++){
            if (i == chars.length || chars[i] != chars[i - 1]) {
                sb.append(chars[i - 1]);
                if (write > 1) {
                    sb.append(write); 
                }
                write = 1;
            } else {
                write++;
            }
        }
        
        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}