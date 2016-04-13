class MinStack {
    /*  Here we maintain a min stack to store 
    *   the corresponsing min value so far.
    */
    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) {
        
        if(min.isEmpty() || min.peek() >= x)
            min.push(x);
        st.push(x);
        
    }

    public void pop() {
        // for stack values, we need to use equal() to compare
        if(st.peek().equals(min.peek()))
            min.pop();
        st.pop();
        
    }

    public int top() {
        
        return st.peek();
        
    }

    public int getMin() {
        
        return min.peek();
        
    }
}