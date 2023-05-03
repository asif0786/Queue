public class Main{
    public static void main(String[] args) {
        // create an object of Queue class
        Queue q = new Queue();

        // insert elements to the queue
        for(int i = 1; i <= 6; i ++) {
            q.enQueue(i);
        }
        q.display();
        System.out.println("");
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.display();
    }
    }
