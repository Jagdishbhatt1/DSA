package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueWith2Stack {

    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int peek(){
            if (s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }

        int remove(){
            if (s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

    }

    public static void main(String args[]) {
        // Queue<Integer> queue = new LinkedList<>();
       // Queue<Integer> queue = new ArrayDeque<>();
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while(!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }

    }
}
