public class Queue {
    int SIZE = 5;
    int arr[];//Storing element
    int front, rear;

    Queue() {
        arr = new int[SIZE];//Initializing an array
        front = -1;
        rear = -1;
    }

    // check if the queue is full
    boolean isFull() {
        return rear == SIZE - 1;
    }

    // check if the queue is empty
    boolean isEmpty() {
        return (front == -1);
    }

    // insert elements to the queue
    public void enQueue(int element) {
        // if queue is full
        if (isFull()) {
            System.out.println("====================================");
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                // mark front denote first element of queue
                front = 0;
            }
            rear++;
            // insert element at the rear
            arr[rear] = element;
            System.out.println("Inserted " + element);
        }

    }

    //Remove element from queue
    public int deQueue() {
        int element;
        //if queue is empty
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
        } else {
            element = arr[front];
            //if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                //mark next element as front
                front++;
            }
            System.out.println(element + " is Removed");
            //return element;
        }
        return 0;
    }

    // display element of the queue
    public void display() {
        System.out.println("Elements of Queue are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ; ");
        }
        System.out.println(" ");
    }
}

