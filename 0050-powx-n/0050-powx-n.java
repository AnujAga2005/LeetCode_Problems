class Solution {
    public double myPow(double x, int n) {
        long N = (long)n;
        if(n==0){
            return 1;
        }
        if(N<0){
            x = 1/x;
            N = -N;
        }
        return fastPow(x,N);
    }
    public double fastPow(double x , long N){
        double ans =1;
        if(N==0){
            return 1.0;
        }
        double half = fastPow(x,N/2);
        if(N%2==0){
            ans =  half*half;
        }else{
            ans = x*half*half;
        }
        return ans;
    }
}