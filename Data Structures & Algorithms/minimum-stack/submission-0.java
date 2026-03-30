class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int poppedValue = stack.pop();
        if(minStack.peek() == poppedValue){
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
/*  1. two stacks - stack and minStack
    2. push(int val) - a. push the value to the stack
                       b. push to minStack only if minStack is Empty or minStack.peek() >= val
    3. pop() - a. pop from main stack
               b. if pop value == minstack.peek() - pop minstack top
    4. top() - return stack peek
    5. getMin() - return minstack peek
*/