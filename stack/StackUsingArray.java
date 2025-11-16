package stack;

import java.util.Arrays;

public class StackUsingArray {
	int arr[];
	int top;
	int capacity;
	StackUsingArray(int size){
		this.arr = new int[size];
		this.top = -1;
		this.capacity = 0;
	}
	
	public static void main(String[] args) {
		StackUsingArray scc = new StackUsingArray(5);
		scc.push(1);
		scc.push(2);
		scc.push(3);
		scc.push(4);
		scc.push(5);
		scc.pop();
		scc.push(6);
		scc.pop();
		scc.peek();
		
		
		System.out.println(Arrays.toString(scc.arr));
	}
	
	void push(int value) {
		if(isFull()) {
			System.out.print("Cannot able to push");
			return;
		}
		arr[++top] = value;
		capacity++;
	}
	void pop() {
		if(isEmpty()) {
			System.out.print("It is Empty Cannot pop");
			return;
		}
		top--;
		capacity--;
	}
	void peek() {
		if(isEmpty()) {
			System.out.print("-1");
			return;
		}
		if(isFull()) {
			System.out.println(arr[arr.length-1]);
			return;
		}
		System.out.println(arr[top]);
		
	}
	boolean isFull() {
		return capacity==arr.length;
	}
	boolean isEmpty() {
		return top==-1;
	}
}
