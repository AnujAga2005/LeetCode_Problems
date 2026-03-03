class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        int t_length = t.length();
        int s_length = s.length();
        for(int i =0; i<t_length; i++){
            total+=t.charAt(i);
        }
        for(int i =0; i<s_length; i++){
            total-=s.charAt(i);
        }
        return (char)total;

        

        
    }
}