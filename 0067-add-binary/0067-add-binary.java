class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int digit1 = (i>=0) ? a.charAt(i)-'0' : 0;
            int digit2 = (j>=0) ? b.charAt(j)-'0' : 0;
            int res = digit1+digit2+carry;
            if(carry>=1){
                carry--;
            }
            if(res==2){
                res = 0;
                carry++;
            }else if(res==3){
                res = 1;
                carry++;
            }
            i--;
            j--;
            sb.append(res);
        }
        if(carry!=0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}