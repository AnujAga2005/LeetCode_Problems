class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                openStack.push(i);
            }else if(s.charAt(i)==')'){
                if(!openStack.isEmpty()){
                    openStack.pop();
                }else if(!starStack.isEmpty()){
                    starStack.pop();
                }else{
                    return false;
                }
            }else{
                starStack.push(i);
            }
        }

        while(!openStack.isEmpty() && !starStack.isEmpty()){
            int openIndex = openStack.pop();
            int starIndex = starStack.pop();
            if(starIndex<openIndex){
                return false;
            }
        }
        return openStack.isEmpty();

        
    }
}