class Solution {

    public void backtrack(String digits, int length, StringBuilder s, HashMap<Character,String> hm , List<String> ans){
        if(length==digits.length()){
            ans.add(s.toString());
            return;
        }
        String curr = hm.get(digits.charAt(length));
        for(int k =0; k<curr.length(); k++){
            s.append(curr.charAt(k));
            backtrack(digits, length+1 , s, hm , ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        backtrack(digits, 0 , new StringBuilder(), hm , ans);
        return ans;
        
    }
}