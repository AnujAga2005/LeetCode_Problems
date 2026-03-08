class Solution {
    public boolean checkIfExist(int[] arr) {
        int size = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<size; i++){
            set.add(arr[i]);
        }
        for(int num: arr){
            if(num != 0 && set.contains(num*2)){
                return true;
            }
            if(num == 0){
                int count = 0;
                for(int x : arr){
                    if(x == 0) count++;
                }
                if(count > 1) return true;
            }
        }
        return false;
    }
}