class MinStack {
    Stack<Integer> s;
    Stack<Integer> p;

    public MinStack() {
        s = new Stack<>();
        p = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(p.isEmpty() || value<=p.peek()){
            p.push(value);
        }
    }
    
    public void pop() {
        int pop = s.pop();
        if(!p.isEmpty() && p.peek()==pop){
            p.pop();
        }
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return p.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */