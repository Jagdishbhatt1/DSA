package queue;

public class CircularArrayClass {
        static class Queue {

            int[] arr;
            int size;
            int rear = -1;
            int front = -1;

            public Queue(int size) {
                arr = new int[size];
                this.size = size;
            }

            boolean isEmpty() {
                return rear == -1 && front == -1;
            }

            boolean isFull() {
                return (rear+1)%arr.length==front;
            }

            //Enqueue
            void add(int data) {
                if (isFull()) {
                    System.out.println("Queue is full");
                    return;
                }
                //first element add
                if(front==-1) {
                    front = 0;
                }

                rear = (rear+1)%size;
                arr[rear]= data;
            }

            void peek() {
                if (isEmpty()){
                    System.out.println("Queue is empty");
                    return;
                }
                while (isFull()){
                    System.out.print(arr[front]+" ");
                    front = (front+1)%size;
                }
            }

            public void remove() {
                int result = arr[front];

                if (isEmpty()){
                    System.out.println("Circular Array is empty");
                }

                //single element condition
                if(front==rear){
                    front = rear = -1;
                } else {
                    front = (front+1)%size;
                }
                System.out.println("removed item : "+result);
            }

        public static void main(String args[]) {

            queue.QueueClass.Queue queue = new queue.QueueClass.Queue(10);
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.peek();
            queue.remove();
            queue.peek();

        }
    }


}
