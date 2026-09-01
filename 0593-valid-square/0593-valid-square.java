class Solution {
    public int calcDist(int[] a, int[] b){
        int one = Math.abs(a[0]-b[0]);
        int two = Math.abs(a[1]-b[1]);
        return one*one + two*two;
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> s = new HashSet<>();
        s.add(calcDist(p1,p2));
        s.add(calcDist(p1,p3));
        s.add(calcDist(p1,p4));
        s.add(calcDist(p2,p1));
        s.add(calcDist(p2,p3));
        s.add(calcDist(p2,p4));
        s.add(calcDist(p3,p1));
        s.add(calcDist(p3,p2));
        s.add(calcDist(p3,p4));
        s.add(calcDist(p4,p1));
        s.add(calcDist(p4,p2));
        s.add(calcDist(p4,p3));

        return !s.contains(0) && s.size()==2;
    }
}