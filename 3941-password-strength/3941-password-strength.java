class Solution {
    public int passwordStrength(String password) {
        Set<Character> hs = new HashSet<>();
        int score = 0;
        for(char c: password.toCharArray()){
            hs.add(c);
        }
        for(char z: hs){
            if(z>='a' && z<='z'){
                score = score+1;
            }
            if(z>='A' && z<='Z'){
                score = score+2;
            }
            if(z>='0' && z<='9'){
                score = score+3;
            }
            if( z=='!' || z=='@' || z=='#' || z=='$'){
                score = score+5;
            }
        }
        return score;
        
    }
}