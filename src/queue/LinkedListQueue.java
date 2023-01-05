package queue;

public class LinkedListQueue {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue{
        static Node head;
        static Node tail;

        static boolean isEmpty() {
            return head == null;
        }

        static void add(int data){
            if (isEmpty()){
                head = new Node(data);
                tail = head;
                return;
            }
            Node newNode = new Node(data);
            tail.next = newNode;
            tail= newNode;
        }

        static void peak(){
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            while (head!=null){
                System.out.print(head.data+" ");
                head = head.next;
            }
        }

        static void remove(){
            if (isEmpty()){
                return;
            }
            int result;
            if(head.next==null){
                result = head.data;
                head=null;
            }
            result = head.data;
            head = head.next;
            System.out.println("removed item : "+result);
        }

    }

    public static void main(String args[]){
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.peak();
        queue.remove();
        queue.peak();
        queue.add(4);
        queue.peak();

    }


}
