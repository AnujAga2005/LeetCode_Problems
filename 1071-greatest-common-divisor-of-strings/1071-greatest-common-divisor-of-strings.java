class Solution {
    private int gcd(int a , int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int a = str1.length();
            int b = str2.length();
            int g = gcd(a,b);
            return str1.substring(0,g);
        }else{
            return "";
        }
        
    }
}