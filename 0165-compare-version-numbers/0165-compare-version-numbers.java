class Solution {
    public int compareVersion(String version1, String version2) {
        String[] tokens1 = version1.split("\\.");
        String[] tokens2 = version2.split("\\.");
        int n1 = tokens1.length;
        int n2 = tokens2.length;
        int p1 = 0, p2 = 0;
        while(p1<n1 || p2<n2){
            int num1 = (p1<n1)? Integer.parseInt(tokens1[p1]):0;
            int num2 = (p2<n2)? Integer.parseInt(tokens2[p2]):0;
            if(num1!=num2){
                return (num1>num2)?1:-1;
            }
            p1++;
            p2++;
        }
        return 0;

    }
}