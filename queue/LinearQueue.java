package queue;

import java.util.Arrays;

public class LinearQueue {
	int[] arr;
	int capacity;
	int end;
	LinearQueue(int size){
		this.arr = new int[size];
		this.capacity= 0;
		this.end = -1;
	}
	
	public static void main(String[] args) {
		LinearQueue lque = new LinearQueue(5);
		lque.enqueue(1);
		lque.enqueue(2);
		lque.enqueue(3);
		lque.enqueue(4);
		lque.enqueue(5);
		lque.enqueue(1);
		lque.dequeue();
		lque.enqueue(6);
		lque.peek();
		
		System.out.println(Arrays.toString(lque.arr));
	}
	
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Cannot remove");
			return;
		}
		System.out.println(end);
		for(int i=1;i<=end;i++) {
			arr[i-1] = arr[i];

		}
		end--;
		capacity--;
		
	}
	void enqueue(int value) {
		if(isFull()) {
			System.out.println("Cannot able to Enqueue");
			return;
		}
		arr[++end] = value;
		capacity++;
	}
	void peek() {
		if(isEmpty()) {
			System.out.println("It is Empty");
			return;
		}
		System.out.println("Peek is "+arr[0]);
	}
	
	boolean isFull(){
		return capacity == arr.length;
	}
	boolean isEmpty() {
		return end==-1;
	}
}
