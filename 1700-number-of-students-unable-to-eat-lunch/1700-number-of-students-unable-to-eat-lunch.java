class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;
        for(int x: students){
            if(x==0) count0++;
            else count1++;
        }
        for(int y: sandwiches){
            if(y==0){
                if(count0==0) break;
                else count0--;
            }else{
                if(count1==0) break;
                else count1--;
            }
        }
        return count0+count1;
    }
}