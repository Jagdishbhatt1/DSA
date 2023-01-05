package stack;

import java.util.ArrayList;

public class StackWithArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static void push(int data) {

            list.add(data);
        }

        public static void pop(){
            if (list.isEmpty()){
                return;
            }
            list.remove(list.size()-1);
        }
        public static int peek(){
            if (list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String args[]) {
        Stack stack=new Stack();
        stack.push(0);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.list.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}

