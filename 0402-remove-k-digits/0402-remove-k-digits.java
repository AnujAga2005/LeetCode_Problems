class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s= new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!s.isEmpty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }
        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s) sb.append(c);
        
        int start = 0;
        while (start < sb.length() - 1 && sb.charAt(start) == '0') start++;
        String result = sb.substring(start);
        
        return result.isEmpty() ? "0" : result;
    }
}