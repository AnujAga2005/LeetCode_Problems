class Solution {
    public int firstUniqChar(String s) {
        int length = s.length();
            for(int i=0; i<length; i++){
                char a = s.charAt(i);
                for(int j=0; j<length; j++){
                    if(a==s.charAt(j) && i!=j){
                        break;
                    }
                    if(j==length-1){
                        return i;
                    }
                }
            }
            return -1;
    }
}