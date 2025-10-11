package adsDay5;

import java.util.Arrays;

public class LinearQueue {
//https://www.geeksforgeeks.org/dsa/array-implementation-of-queue-simple/
	int arr[], capacity, front, rear;
	public LinearQueue(int size) {
		arr = new int[size];
		capacity = size;
		rear = -1;
		front = 0;
	}
	public static void main(String[] args) {
		LinearQueue lq = new LinearQueue(8);
		System.out.println(lq.isEmpty());
		System.out.println(lq.isFull());
		lq.enqueue(44);
		lq.enqueue(41);
		lq.enqueue(33);
		lq.enqueue(23);
		lq.enqueue(89);

		lq.dequeue();
		lq.dequeue();
		lq.dequeue();
		lq.dequeue();
		lq.peek();
		
		for(int i =lq.front;i<=lq.rear;i++) {
			System.out.print(lq.arr[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println(Arrays.toString(lq.arr));
	}
	void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		arr[++rear] = item;
		
	}
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		rear--;
	}
	void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		System.out.println("Front is: "+arr[front]);
	}
	boolean isFull() {
		return rear == capacity-1;
	}
	boolean isEmpty() {
		return front > rear;
	}
}
