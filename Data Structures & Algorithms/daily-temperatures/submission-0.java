class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helperStack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for(int i = n-1; i >= 0; i--){
            while(!helperStack.isEmpty() 
            && temperatures[i] >= temperatures[helperStack.peek()]){
                helperStack.pop();
            }

            if(!helperStack.isEmpty()){
                result[i] = helperStack.peek() - i;
            }

            helperStack.push(i);
        }
        return result;
    }
}

/*
similar to Next Greater Element
temperature[] = [30,38,30,36,35,40,28]
result[] 
stack -> helper stack storing indices
start from reverse -> n-1 to 0
1. if stack is not empty and the stack's top element is < current value, 
    continue popping the element from stack till a greater value is found in the stack
2. if stack till has element, that is the answer, store the diff of indices
3. push the current index to the jhelper stack
*/