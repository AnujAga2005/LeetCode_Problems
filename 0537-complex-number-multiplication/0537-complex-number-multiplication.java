class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int real1 = 0;
        int imag1 = 0;
        int real2 = 0;
        int imag2 = 0;
        boolean isNeg1 = false;
        boolean isNeg2 = false;
        int i = 0;
        int j = 0;
        boolean realNeg1 = false;
        boolean realNeg2 = false;
        if (num1.charAt(i) == '-') {
            realNeg1 = true;
            i++;
        }
        while(num1.charAt(i)!='+'){
            real1 = real1*10 + (num1.charAt(i) - '0');
            i++;
        }
        i++;
        if(num1.charAt(i)=='-') {
            isNeg1 = true;
            i++;
        }
        while(num1.charAt(i)!='i'){
            imag1 = imag1*10 + (num1.charAt(i) - '0');
            i++;
        }
        if(isNeg1) imag1 = imag1*(-1);
        if(realNeg1) real1 = real1*(-1);

        if (num2.charAt(j) == '-') {
            realNeg2 = true;
            j++;
        }
        while(num2.charAt(j)!='+'){
            real2 = real2*10 + (num2.charAt(j) - '0');
            j++;
        }
        j++;
        if(num2.charAt(j)=='-'){
            isNeg2 = true;
            j++;
        } 
        while(num2.charAt(j)!='i'){
            imag2 = imag2*10 + (num2.charAt(j) - '0');
            j++;
        }
        if(isNeg2) imag2 = imag2*(-1);
        if(realNeg2) real2 = real2*(-1);

        

        int real3 = (real1*real2) + (imag1*imag2*(-1));
        int imag3 = (real1*imag2) + (imag1*real2); 

        StringBuilder ans = new StringBuilder();
        ans.append(real3);
        ans.append("+");
        ans.append(imag3);
        ans.append("i");

        return ans.toString();
    }
}