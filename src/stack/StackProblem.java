package stack;

import java.util.Stack;

public class StackProblem {

    public static void pushButton(Stack stack, int data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = (int) stack.pop();
        pushButton(stack, data);
        stack.push(top);


    }
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(22);
        stack.push(34);
        stack.push(56);

        pushButton(stack, 23423);
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
