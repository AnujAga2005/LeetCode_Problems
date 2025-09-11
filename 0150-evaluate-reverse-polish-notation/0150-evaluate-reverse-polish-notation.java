class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> s = new Stack<>();
        int a,b,c;
        for(int i=0; i<tokens.length; i++){
            String t = tokens[i];
            if(t.equals("+")){
                a = s.pop();
                b = s.pop();
                c = b+a;
                s.push(c);
                continue;
            }
            else if(t.equals("-")){
                a = s.pop();
                b = s.pop();
                c = b-a;
                s.push(c);
                continue;
            }
            else if(t.equals("*")){
                a = s.pop();
                b = s.pop();
                c = b*a;
                s.push(c);
                continue;
            }
            else if(t.equals("/")){
                a = s.pop();
                b = s.pop();
                c = b/a;
                s.push(c);
                continue;
            }
            s.push(Integer.parseInt(tokens[i]));
            
        }
        return s.pop();
        
    }
}