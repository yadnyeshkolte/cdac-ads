package test;

import java.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Test {
	int arr[];
	int start;
	int end;
	int size;
	Test(int size){
		this.arr = new int[size];
		start = -1;
		end = -1;
		this.size = size;
	}
	public static void main(String[] args) {
		Test cq = new Test(5);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.peek();
		cq.display();
		
		System.out.println(Arrays.toString(cq.arr));
		
		
	}
	
	void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i= start;
        while(true) {
        	System.out.println(arr[i]+" ");
        		if(i==end) {
        			break;
        		}
        		i = (i+1) % size;
        		
        }
        
	}
	void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        if(end==start) {
        	end=-1;
        	start=-1;
        }
        else {
        		start = (start+1) % size; 
        }
	}
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty ");
			return;
		}
		System.out.println(arr[start]);
	}
	void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if(isEmpty()) {
			start = 0;
		}
		
		end = (end+1)%size;
		arr[end] = value;
	}
	boolean isEmpty() {
		return end==-1 && start==-1;
	}
	
	boolean isFull() {
		return ( end+1 ) % size == start;
	}
	
	
	
}
