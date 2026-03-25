class Solution {

    public String clearDigits(String s) {
        Stack<Character> ans = new Stack<>();
        StringBuilder output = new StringBuilder();
        int length = s.length();
        for(int i=0; i<length; i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans.push(s.charAt(i));
            }
            else{
                if(!ans.isEmpty()){
                    ans.pop();
                }
            }
        }
        while(!ans.isEmpty()){
            output.append(ans.pop());
        }
        output.reverse();
        return output.toString();
    }
}