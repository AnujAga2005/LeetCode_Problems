class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder output = new StringBuilder();
        int idx = word.indexOf(ch);
        if(idx == -1) return word;

        output.append(word.substring(0,idx+1)).reverse().append(word.substring(idx+1));
    
        return output.toString();
        
    }
}