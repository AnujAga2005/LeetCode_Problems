class Solution {

    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList();
        
        HashMap<String,List> hm = new HashMap<>();
        for(String str: strs){
            int[] key = new int[26];
            for(char c: str.toCharArray()){
                key[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: key){
                sb.append("#");
                sb.append(i);
            }
            String s = sb.toString();
            if(!hm.containsKey(s)){
                hm.put(s, new ArrayList<String>());
            }
            hm.get(s).add(str);
        }
        return new ArrayList(hm.values());
        
    }
}