class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder fpart = new StringBuilder();
        StringBuilder lpart = new StringBuilder();
        int idx = 0;
        boolean contains = false;
        for(int i=0; i<word.length(); i++){
            fpart.append(word.charAt(i));
            idx++;
            if(word.charAt(i)==ch){
                contains = true;
                break;
            }
        }
        if(!contains){
            return word;
        }
        fpart.reverse();
        for(int i=idx; i<word.length(); i++){
            lpart.append(word.charAt(i));
        }
        fpart.append(lpart);
        return fpart.toString();
        
    }
}