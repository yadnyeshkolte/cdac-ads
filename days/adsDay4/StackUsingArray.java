package days.adsDay4;

import java.util.Arrays;

public class StackUsingArray {

	static int arr[];
	int indexT=-1;
	int capacity=0;
	
	public StackUsingArray(int size) {
		capacity = size;
		arr = new int[capacity];
		indexT = -1;
	}
	
	public static void main(String[] args) {
		StackUsingArray sua = new StackUsingArray(5);
		sua.push(10);
		sua.push(10);
		sua.push(10);
		sua.push(10);
		sua.push(12);
		sua.peek();
		
		System.out.println(Arrays.toString(arr));
	}
	
	// push operation is to add element to the top of the stack
	// Check if the stack is full (overflow)
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack Overflow!!!");
			return;
		}
		arr[++indexT] = item;
	}
	
	// delete the top element from the stack
	// is the stack empty (prerequisite)
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!!!");
			return;
		}
		indexT--;
	}
	
	// is to check the element present in the top of the stack
	// is the stack empty (prerequisite)
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!!!");
			return;
		}
		System.out.println("the top element is: "+arr[indexT]);
	}

	// check if the stack in empty.
	// this is a prerequisite check for pop() and peek() operation 
	boolean isEmpty() {
		return indexT==-1;
	}
	
	// checks if the stack is full.
	// this is a prerequisite check for push() operation
	boolean isFull() {
		return indexT == capacity-1;
	}
}
