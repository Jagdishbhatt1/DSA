package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String args[]) {
       // Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
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
