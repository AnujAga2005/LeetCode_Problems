class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] mapP = new int[26];
        int[] mapS = new int[26];
        List<Integer> ans = new ArrayList<>();
        for(char c : p.toCharArray()) mapP[c-'a']++;
        for(int i=0; i<s.length(); i++){
            mapS[s.charAt(i)-'a']++;
            if(i>=p.length()){
                mapS[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(mapP,mapS)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}