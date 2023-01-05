package stack;

import java.util.Stack;

public class ReverseStack {

    public static void pushButton(Stack stack, int data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = (int) stack.pop();
        pushButton(stack, data);
        stack.push(top);


    }
    public static void reverse(Stack stack){
        if (stack.isEmpty()){
            return;
        }
        int top = (int) stack.pop();
        reverse(stack);
        pushButton(stack, top);


    }
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(22);
        stack.push(34);
        stack.push(56);

        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
