package queue;

import java.util.Arrays;

public class PriorityQueue {
    int[] arr;
    int end;
    int start;
    int capacity;

    public PriorityQueue(int size) {
        arr = new int[size];
        end = -1;
        start = 0;
        capacity = size;
    }

    public boolean isEmpty() {
        return end <start;
    }

    public boolean isFull() {
        return end==capacity-1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        arr[++end] = value;
        //Doing sorting
        for (int i = start; i < end; i++) {
            for (int j = start; j < end - i + start; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int dqueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int temp = arr[start];
        start++;
        return temp;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Priority Queue Elements:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);
        pq.enqueue(70);
        pq.enqueue(20);
        pq.enqueue(40);
        pq.enqueue(30);
        pq.enqueue(10);
        pq.dqueue();
        pq.dqueue(); 
        pq.print();  
        System.out.println(Arrays.toString(pq.arr));
    }
}


/*
yadnyesh

package queue;

import java.util.Arrays;

public class Test {
	int arr[];
	int start;
	int end;
	int capacity;
	
	Test(int size){
		this.arr = new int[size];
		start = 0;
		end = -1;
		capacity = size;
	}
	
	public static void main(String[] args) {
		Test pq = new Test(5);

		pq.enqueue(5);
		pq.enqueue(10);
		pq.enqueue(15);
		pq.enqueue(2);
		pq.enqueue(1);
		pq.enqueue(7);
		pq.dqueue();
		pq.dqueue();
		pq.enqueue(11);
		pq.enqueue(12);
	
		pq.dqueue();
		pq.peek();
		System.out.println(Arrays.toString(pq.arr));
	}
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(arr[end]+" "+end);
	}
	void dqueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		for(int i =1; i<=end;i++) {
			arr[i-1]  = arr[i];
		}
		end--;
	}
	void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		arr[++end] = value;
		int len = end;
		while(len>=start) {
			for(int i=0;i<len; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			len--;
		}
 	}
	boolean isFull() {
		return end == capacity-1;
	}
	boolean isEmpty() {
		return end < start;  
	}
}

*/