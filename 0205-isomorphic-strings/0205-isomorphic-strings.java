import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> hm1  = new HashMap<>();
        HashMap<Character, Character> hm2  = new HashMap<>();
        for(int i=0 ; i<s.length(); i++){
            char cS = s.charAt(i);
            char tS  = t.charAt(i);

            if(hm1.containsKey(cS)){
                if(hm1.get(cS)!=tS){
                    return false;
                }
            }else{
                hm1.put(cS, tS);
            }
            
            if(hm2.containsKey(tS)){
                if(hm2.get(tS)!=cS){
                    return false;
                }
            }else{
                hm2.put(tS, cS);
            }
        }
        return true;
    }
}