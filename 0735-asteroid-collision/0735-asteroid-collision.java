class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int a : asteroids){
            boolean destroyed = false;
            while(!s.isEmpty() && s.peek()>0 && a<0){
                if(s.peek() < -a){
                    s.pop();
                    continue;
                }else if(s.peek() == -a) {
                    s.pop();
                    destroyed = true;
                    break;
                }else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                s.push(a);
            }
        }
        int[] arr = new int[s.size()];
        for(int i=s.size()-1; i>=0; i--){
            arr[i] = s.pop();
        }
        return arr;
    }
}