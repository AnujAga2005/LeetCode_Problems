class Solution {
    public int digitFrequencyScore(int n) {
        if(n==0){
            return 0;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        while(n>0){
            int temp = n%10;
            hm.put(temp, hm.getOrDefault(temp,0)+1);
            n=n/10;
        }
        for(int key: hm.keySet()){
            int val = key*hm.get(key);
            ans +=val;
        }
        return ans;
    }
}