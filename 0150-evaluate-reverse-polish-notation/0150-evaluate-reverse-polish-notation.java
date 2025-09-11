class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> s = new Stack<>();
        int a,b;
        for(int i=0; i<tokens.length; i++){
            String t = tokens[i];
            if(t.equals("+")){
                s.push(s.pop()+s.pop());
                continue;
            }
            else if(t.equals("-")){
                a = s.pop();
                b = s.pop();
                s.push(b-a);
                continue;
            }
            else if(t.equals("*")){
                s.push(s.pop()*s.pop());
                continue;
            }
            else if(t.equals("/")){
                a = s.pop();
                b = s.pop();
                s.push(b/a);
                continue;
            }
            s.push(Integer.parseInt(tokens[i]));
            
        }
        return s.pop();
        
    }
}