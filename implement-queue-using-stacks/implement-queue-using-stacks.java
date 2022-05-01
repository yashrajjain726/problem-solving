class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;
    int size;
    
    public MyQueue() {
       stack = new Stack<>();
       temp = new Stack<>();
       size = 0;
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(temp.isEmpty())
            while(stack.isEmpty()==false)
                temp.push(stack.pop());
        return temp.pop();
        
    }
    
    public int peek() {
        if(temp.isEmpty())
            while(stack.isEmpty()==false)
                temp.push(stack.pop());
        return temp.peek();
    }
    
    public boolean empty() {
       return (stack.isEmpty() && temp.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */