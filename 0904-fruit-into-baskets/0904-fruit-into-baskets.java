class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int left = 0, max = 0;
        for(int right=0; right<fruits.length; right++){
            int currentCount = hm.getOrDefault(fruits[right],0);
            hm.put(fruits[right],currentCount+1);
            while(hm.size()>2){
                int fruitCount = hm.get(fruits[left]);
                if(fruitCount == 1) hm.remove(fruits[left]);
                else hm.put(fruits[left],fruitCount-1);
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
        
    }
}