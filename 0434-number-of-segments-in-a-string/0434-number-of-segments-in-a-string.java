class Solution {
    public int countSegments(String s) {
        if(s==null || s.isEmpty()) return 0;
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)== ' ' && s.charAt(i-1)!= ' ' ){
                count++;
            }
        }
        if(s.charAt(s.length()-1) != ' '){
            count++;
        }
        return count;
        
    }
}