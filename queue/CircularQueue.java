package queue;

import java.util.Arrays;

public class CircularQueue {

    int arr[];
    int size;
    int end;
    int start;

    public CircularQueue(int n) {
        arr = new int[n];
        size = n;
        end = -1;
        start = -1;
    }

    public boolean isEmpty() {
        return end == -1 && start == -1;
    }

    public boolean isFull() {
        return (end + 1) % size == start;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            start = 0;
        }

        //System.out.println(end+" = "+(end + 1) % size+"|"+(end+1)+" % "+size);
        end = (end + 1) % size;
        arr[end] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[start];

        if (end == start) {
            end = start = -1;
        } else {
            start = (start + 1) % size;
        }

        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = start;
        System.out.print("Queue: ");
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == end) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();

        System.out.println("Peek: " + cq.peek());

        cq.dequeue();
        cq.dequeue();
        cq.display();

        cq.enqueue(50);
        cq.enqueue(60);
        cq.enqueue(70);
        
        cq.dequeue();
        cq.dequeue();
        
        cq.enqueue(80);
        cq.display();
        
        System.out.println(Arrays.toString(cq.arr));
    }
}
