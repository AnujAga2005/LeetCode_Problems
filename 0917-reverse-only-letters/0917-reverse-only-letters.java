class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0; 
        int j=s.length()-1;
        char[] str = new char[s.length()];
        while(i<j){
            if(!Character.isLetter(s.charAt(i))){
                str[i] = s.charAt(i);
                i++;
            }
            else if(!Character.isLetter(s.charAt(j))){
                str[j] = s.charAt(j);
                j--;
            }
            else{
                str[i] = s.charAt(j);
                str[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        if(i == j){
            str[i] = s.charAt(i);
        }
        return new String(str);
    }
}