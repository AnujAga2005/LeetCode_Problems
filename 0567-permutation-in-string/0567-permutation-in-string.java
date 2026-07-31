class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(int i=0; i<s1.length(); i++){
            a1[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            a2[s2.charAt(i)-'a']++;
            if(i>=s1.length()){
                a2[s2.charAt(i-s1.length())-'a']--;
            }
            if(Arrays.equals(a1,a2)){
                return true;
            }
        }
        return false;

        
    }
}