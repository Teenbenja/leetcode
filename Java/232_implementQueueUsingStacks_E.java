class MyQueue {
    
    private Stack<Integer> sta1 = new Stack<>();
    private Stack<Integer> sta2 = new Stack<>();
    
    // Push element x to the back of queue.
    public void push(int x) {
      
      sta1.push(x);
      
    }

    // Removes the element from in front of queue.
    public void pop() {
      
      while(sta1.size() > 1) {
        sta2.push(sta1.pop());
      }
      sta1.pop();
      
      while(!sta2.isEmpty()) {
        sta1.push(sta2.pop());
      }
      
    }

    // Get the front element.
    public int peek() {
        
        while(sta1.size() > 1) {
        sta2.push(sta1.pop());
      }
      int tmp = sta1.peek();
      sta2.push(sta1.pop());
      
      while(!sta2.isEmpty()) {
        sta1.push(sta2.pop());
      }
      
      return tmp;
      
    }

    // Return whether the queue is empty.
    public boolean empty() {
      
      return sta1.isEmpty();
      
    }
}