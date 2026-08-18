class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] diff = new int[s.length()+1];
        for(int[] shift : shifts){
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            int val = dir == 0 ? -1 : 1;
            diff[start] += val;
            diff[end + 1] -= val;
        }
        char[] ans = s.toCharArray();
        int net = 0;
        for(int i=0; i<ans.length; i++){
            net += diff[i];
            int shiftedValue = ((ans[i] - 'a' + net) % 26 + 26) % 26;
            ans[i] = (char)('a'+shiftedValue);
        }
        return new String(ans);
    }
}