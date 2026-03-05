class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1) return false;
        int check = 1;
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                check+=i;
                if(i!=num/i){
                    check+=num/i;
                }
            }
        }
        return check==num;
    }
}