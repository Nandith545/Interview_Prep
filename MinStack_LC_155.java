class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

    //If minstack is empty or the top of the minstack is less than equal to the current pushed element push it onto the minstack
    if(minStack.isEmpty() || val <= minStack.peek())
        minStack.push(val);
    }
    
    public void pop() {
        int poppedValue = stack.pop();

        //if popped value is equal to the top element in minstack then pop that too
        if(poppedValue == minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
