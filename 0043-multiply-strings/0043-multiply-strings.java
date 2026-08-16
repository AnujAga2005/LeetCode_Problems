class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0") ) return "0";
        int[] ans = new int[num1.length()+num2.length()];
        for(int i= num1.length()-1 ; i>=0; i--){
            for(int j= num2.length()-1; j>=0; j--){
                int digit1 = num1.charAt(i)-'0';
                int digit2 = num2.charAt(j)-'0';
                int mul = digit1*digit2;
                int posLow = i+j+1;
                int posHigh = i+j;
                int sum = mul + ans[posLow];
                ans[posLow] = sum%10;
                ans[posHigh] += sum/10;
            }
        }
        StringBuilder res = new StringBuilder();
        int k =0;
        while(k<ans.length && ans[k]==0){
            k++;
        }
        for(int i =k; i<ans.length; i++){
            res.append(ans[i]);
        }
        return res.length() == 0 ? "0" : res.toString();
        
    }
}