package adsDay5;

import java.util.Arrays;

public class PriorityQueue {
    private int[] arr;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // Insert element with priority
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Priority Queue is Full");
            return;
        }
        arr[size++] = item;
        heapifyUp(size - 1);
    }

    // Remove the highest priority element (root of heap)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Priority Queue is Empty");
            return -1;
        }
        int removed = arr[0];
        arr[0] = arr[size - 1];
        size--;
        heapifyDown(0);
        return removed;
    }

    // Peek at highest priority item
    public int peek() {
        if (isEmpty()) {
            System.out.println("Priority Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    private void heapifyUp(int index) {
        while (index > 0 && arr[parent(index)] < arr[index]) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);

        System.out.println("Is empty? " + pq.isEmpty());
        System.out.println("Is full? " + pq.isFull());

        pq.enqueue(44);
        pq.enqueue(23);
        pq.enqueue(89);
        pq.enqueue(33);
        pq.enqueue(41);
        
        System.out.println(Arrays.toString(pq.arr));
        System.out.println("Is full? " + pq.isFull());
        pq.enqueue(99); // Should print "Priority Queue is Full"

        System.out.println("Highest priority: " + pq.peek());

        pq.dequeue(); // removes 89

        System.out.println("Highest priority after dequeue: " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }

        System.out.println("Is empty? " + pq.isEmpty());
    }
}
