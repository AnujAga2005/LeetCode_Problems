class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && c == st.peek()){
                st.pop();
                continue;
            }else{
                st.push(c);
            }
        }
        for(char x: st){
            output.append(x);
        }
        return output.toString();
        
    }
}