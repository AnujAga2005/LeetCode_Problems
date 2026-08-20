class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+"," ");
        StringBuilder sb = new StringBuilder();
        ArrayList<String> str = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }else{
                str.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        str.add(sb.toString());
        sb = new StringBuilder();
        for(int i=str.size()-1; i>=0; i--){
            sb.append(str.get(i));
            if(i!=0) sb.append(" ");
        }

        return sb.toString();
        
    }
}