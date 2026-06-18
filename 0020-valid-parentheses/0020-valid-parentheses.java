class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
            return false;
        }
        Stack<Character> s1 = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                s1.push(c);
            }
            else if(!s1.isEmpty() && c==')' && s1.peek()=='(' ){
                s1.pop();
            }
            else if(!s1.isEmpty() && c=='}' && s1.peek()=='{'){
                s1.pop();
            }
            else if(!s1.isEmpty() && c==']' && s1.peek()=='['){
                s1.pop();
            }
            else{
                return false;
            }

        }
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}