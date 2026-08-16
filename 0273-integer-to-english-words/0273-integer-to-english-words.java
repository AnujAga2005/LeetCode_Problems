class Solution {
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(0,"");
        hm1.put(1,"One");
        hm1.put(2,"Two");
        hm1.put(3,"Three");
        hm1.put(4,"Four");
        hm1.put(5,"Five");
        hm1.put(6,"Six");
        hm1.put(7,"Seven");
        hm1.put(8,"Eight");
        hm1.put(9,"Nine");

        HashMap<Integer, String> hm10 = new HashMap<>();
        hm10.put(10, "Ten");
        hm10.put(11,"Eleven");
        hm10.put(12,"Twelve");
        hm10.put(13,"Thirteen");
        hm10.put(14,"Fourteen");
        hm10.put(15,"Fifteen");
        hm10.put(16,"Sixteen");
        hm10.put(17,"Seventeen");
        hm10.put(18,"Eighteen");
        hm10.put(19,"Nineteen");

        HashMap<Integer, String> hm100 = new HashMap<>();
        hm100.put(1,"Ten");
        hm100.put(2,"Twenty");
        hm100.put(3,"Thirty");
        hm100.put(4,"Forty");
        hm100.put(5,"Fifty");
        hm100.put(6,"Sixty");
        hm100.put(7,"Seventy");
        hm100.put(8,"Eighty");
        hm100.put(9,"Ninety");

        if(num<10){
            return hm1.get(num);
        }
        if(num<20){
            return hm10.get(num);
        }

        if(num<100){
            return hm100.get(num/10) + (num%10==0?"": " " +hm1.get(num%10));
        }

        if(num<1000){
            return numberToWords(num/100) + " Hundred" + (num%100==0?"": " " +numberToWords(num%100));
        }

        if(num<1_000_000){
            return numberToWords(num/1000) + " Thousand" + (num%1000==0?"": " " +numberToWords(num%1000));
        }

        if(num<1_000_000_000){
            return numberToWords(num/1_000_000) + " Million" + (num%1_000_000==0?"": " " +numberToWords(num%1_000_000));
        }

        return numberToWords(num/1_000_000_000) + " Billion" + (num%1_000_000_000==0?"": " " +numberToWords(num%1_000_000_000));

    }
}