package internalassesment;

import java.util.Scanner;

public class ProblemStatement2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		CircularLinkedList cll = new CircularLinkedList();
		System.out.println(cll.isEmpty());
		System.out.print("Enter the C Linked List length: ");
		int input = scan.nextInt();
		System.out.print("Enter the value giving space to add: ");
		for(int i=0;i<input;i++) {
			cll.addAtEnd(scan.nextInt());
		}
		System.out.print("Enter the Index Before and After Delete: ");
		int input2 = scan.nextInt();
		cll.displayCircularLinkedList();
		cll.deleteBeforeIndex(input2);
		cll.deleteAfterIndex(input2);
		cll.displayCircularLinkedList();
		
	}
}

class CircularLinkedList{
	CNode head;
	CNode tail;
	void deleteBeforeIndex(int index) {
		
	}
	void deleteAfterIndex(int index) {
		
	}
	boolean isEmpty() {
		return head==null;
	}
	void addAtEnd(int value) {
		CNode newNode = new CNode(value);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		if(tail==null) {
			tail = newNode;
			head.next = tail;
			tail.next = head;
			return;
		}
		CNode temp = head;
		while(temp.next!=head) {
		
			temp = temp.next;
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		// 6
		// 10 20 30 40 50 60 
	}
	void displayCircularLinkedList() {
		CNode temp = head;
		while(temp.next!=head) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.print(temp.data+" -> "+temp.next.data);
		System.out.println(" ");
	}
}

class CNode{
	int data;
	CNode next;
	public CNode(int data) {
		this.data = data;
		this.next = null;
	}
}

