class Solution {
    public String decodeString(String s) {
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                intStack.push(num);
                strStack.push(cur.toString());
                num = 0;
                cur = new StringBuilder();
            } else if (c == ']') {
                int n = intStack.pop();
                String repeated = cur.toString();
                StringBuilder sb = new StringBuilder(strStack.pop());
                for (int i = 0; i < n; i++) {
                    sb.append(repeated);
                }
                cur = sb;
            } else {
                cur.append(c);
            }
        }
        return cur.toString();
    }
}