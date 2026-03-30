class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean destroyed = false;

            while (!s.isEmpty() && s.peek() > 0 && curr < 0) {
                if (Math.abs(s.peek()) < Math.abs(curr)) {
                    s.pop();
                } 
                else if (Math.abs(s.peek()) == Math.abs(curr)) {
                    s.pop();
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                s.push(curr);
            }
        }
        int[] output = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            output[i] = s.pop();
        }
        return output;
    }
}