class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0 || g.length==0){
            return 0;
        }
        Arrays.sort(s);
        Arrays.sort(g);
        int k=0;
        int count=0;
        for(int i=0; i<g.length;i++){
            if(k==s.length){
                break;
            }
            if(s[k]>=g[i]){
                count++;
                k++;
            }else{
                k++;
                i--;
            }
           
        }
        return count; 
    }
}