package days.adsDay5;

import java.util.Arrays;

public class CircularQueue {
    // https://www.geeksforgeeks.org/dsa/introduction-to-circular-queue/
    int arr[], size, front, rear, capacity;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        size = 0;
        front = -1;
        rear = -1;
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);

        cq.enqueue(12);
        cq.enqueue(45);
        cq.enqueue(23);
        cq.displayQueue();
        cq.dequeue();
        cq.enqueue(514);
        cq.displayQueue();
        cq.enqueue(54);
        cq.displayQueue();

        System.out.println("===================================");
        cq.enqueue(22);
        cq.displayQueue();
        cq.enqueue(90);
        cq.displayQueue();
        cq.enqueue(89);
        cq.displayQueue();

        System.out.println("===================================");

        cq.dequeue();
        cq.displayQueue();
        cq.enqueue(33);
        cq.displayQueue();
        cq.peek();
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        int i = front;
        for (int cnt = 0; cnt < size; cnt++) {
            System.out.print(arr[i]);
            if (cnt != size - 1) {
                System.out.print(", ");
            }
            i = (i + 1) % capacity;
        }
        System.out.print("]");
        
        System.out.print(" Front is: "+front);
        System.out.print(" Rear is: "+rear);
        
        System.out.println(" "+Arrays.toString(arr));
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Full Circular Queue");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        if (front == -1) {
            front = rear;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty Circular Queue");
            return;
        }
        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            rear = -1;
            front = -1;
        }
        System.out.println("Dequeued value is: " + removed);
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Empty Circular Queue");
            return;
        }
        System.out.println("Peek value is: " + arr[front]);
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
