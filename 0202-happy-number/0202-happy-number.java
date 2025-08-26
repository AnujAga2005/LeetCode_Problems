class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            ArrayList<Integer> arr = new ArrayList<>();
            while (n != 0) {
                int temp = n % 10;
                arr.add(temp);
                n = n / 10;
            }
            int sum = 0;
            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i) * arr.get(i);
            }
            if (sum == 1) return true;
            n = sum;
        }
        return false;
    }
}