class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int first = 0;
        int second = 0;
        for(String token: tokens){
            switch(token){
                
                case "+": s.push( s.pop() + s.pop()); break;
                
                case "-":
                    second = s.pop();
                    first = s.pop();
                    s.push( first - second); break;
                
                case "*": s.push( s.pop() * s.pop()); break;
               
               case "/":
                    second = s.pop();
                    first = s.pop();
                    s.push( first / second); break;
                default: s.push(Integer.parseInt(token));
            }
            }
            return s.peek();
        }
    }

