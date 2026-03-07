class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> output = new ArrayList<>();
        int size = s.length();
        for(int i=0; i<size; i++){
            if(i+2 < size && s.charAt(i) == s.charAt(i+1) && s.charAt(i)==s.charAt(i+2)){
                List<Integer> part = new ArrayList<>();
                int j=i+2;
                while(j+1 < size && s.charAt(j+1)==s.charAt(i)){
                    j++;
                }
                part.add(i);
                part.add(j);
                output.add(part);
                i=j;
            }
            
        }
        return output;
    }
}