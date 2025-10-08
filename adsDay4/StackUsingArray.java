package adslabDay4;

import java.util.Arrays;

public class StackUsingArray{
	int arr[];
	int index;
	int size;
	public StackUsingArray(int size) {
		this.size = size;
		arr = new int[size];
		index = -1;
	}
	public static void main(String[] args) {
		StackUsingArray sa = new StackUsingArray(8);
		sa.push(56);
		sa.push(56);
		sa.push(56);
		sa.push(98);
		sa.pop();
		sa.push(18);
		sa.peek();
		System.out.println(Arrays.toString(sa.arr));
		System.out.println(sa.index);
	}
	void push(int item) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		arr[++index] = item;
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return;
		}
		index--;
	}
	void peek() {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return;
		}
		System.out.println("Peek index is "+arr[index]);
	}
	//is empty
	boolean isEmpty() {
		return index==-1;
	}
	//is full
	boolean isFull() {
		return index == size-1;
	}
}