class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                st.push(c);
                count++;
            }else if(!st.isEmpty() && c==')' && st.peek()=='('){
                st.pop();
                count--;
            }
            else if(c==')'){
                count++;
            }
        }
        return count;
    }
}