class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C")){
                s.pop();
            }else if(operations[i].equals("D")){
                int temp = 2*s.peek();
                s.push(temp);
            }else if(operations[i].equals("+")){
                int last = s.pop();
                int secondLast = s.peek();
                s.push(last); 
                s.push(last + secondLast);
            }else{
                s.push(Integer.parseInt(operations[i]));
            }   
        }
        int ans = total(s);
        return ans;
        
    }
    public int total(Stack<Integer> s){
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.peek();
            s.pop();
        }
        return sum;
    }
}