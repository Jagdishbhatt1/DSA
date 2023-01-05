package queue;

public class QueueClass {

    static class Queue {

        int[] arr;
        int size;
        int rear = -1;
        //int front = -1;

        public Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        //Enqueue
        void add(int data) {
            if (rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }

        void peek() {
            if (isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int front=0;
            while (front<=rear){
                System.out.print(arr[front++]+" ");
            }
        }

        public void remove() {
            int front = arr[0];
            for (int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            System.out.println("removed item : "+front);
            peek();
        }
    }

    public static void main(String args[]) {

        Queue queue = new Queue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.peek();
        queue.remove();
    }
}
