class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C")){
                s.pop();
            }else if(operations[i].equals("D")){
                s.push(2*s.peek());
            }else if(operations[i].equals("+")){
                int last = s.pop();
                int secondLast = s.peek();
                s.push(last); 
                s.push(last + secondLast);
            }else{
                s.push(Integer.parseInt(operations[i]));
            }   
        }
        int ans = 0;
        while(!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
    }
    
}