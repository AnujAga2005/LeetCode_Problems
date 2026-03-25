class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        for(int x: students) stu.add(x);
        int i =0;
        int count = 0;
        while(!stu.isEmpty() && count < stu.size()){
            if(stu.peek() == sandwiches[i]){
                i++;
                stu.remove();
                count =0;
            }else{
                stu.add(stu.remove());
                count++;
            }
        }
        return stu.size();
    }
}