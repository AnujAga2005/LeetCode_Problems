class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#' && s1.length()>0){
                s1.deleteCharAt(s1.length()-1);
            }else if(s.charAt(i)!='#'){
                s1.append(s.charAt(i));
            }
        }
        for(int j=0; j<t.length(); j++){
            if(t.charAt(j)=='#' && s2.length()>0){
                s2.deleteCharAt(s2.length()-1);
            }else if(t.charAt(j)!='#'){
                s2.append(t.charAt(j));
            }
        }
        if(s1.toString().equals(s2.toString())){
            return true;
        }
        return false;
        
    }
}