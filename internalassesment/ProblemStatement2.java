package internalassesment;

import java.util.Scanner;

public class ProblemStatement2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		CircularLinkedList cll = new CircularLinkedList();
		CircularLinkedList cll1 = new CircularLinkedList();
		CircularLinkedList cll2 = new CircularLinkedList();
		//System.out.println(cll.isEmpty());-+++++
		System.out.print("Enter the C Linked List length: ");
		int input = scan.nextInt();
		int[] arr = new int[input];
		System.out.print("Enter the value giving space to add: ");
		for(int i=0;i<input;i++) { 
			arr[i] = scan.nextInt(); 
		}
		for(int i=0;i<input;i++) { 
			cll.addAtEnd(arr[i]);
			cll1.addAtEnd(arr[i]);
			cll2.addAtEnd(arr[i]);
			
		}
		System.out.print("Enter the Index Before Delete: ");
		int input2 = scan.nextInt();
		cll.displayCircularLinkedList();
	
		
		cll1.deleteBeforePosition(input2);
		cll1.displayCircularLinkedList();
		
		cll2.deleteAfterPosition(input2);
		cll2.displayCircularLinkedList();

	}
}

class CircularLinkedList {
	CNode head;
	CNode tail;

	// 6
	// 10 20 30 40 50 60
	void deleteBeforePosition(int pos) {
		int index = pos-1;
		if (index == 0) {
			CNode temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
			return;
		}
		if(index == 1) {
			tail.next = head.next;
			head = tail.next;
			return;
		}
		CNode prev = null;
		CNode temp = head;
		for (int i = 1; i < index; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	void deleteAfterPosition(int pos) {
		int index = pos-1;
		CNode temp = head;
		if(index==4) {
			CNode decoy = head.next;
			tail.next = decoy;
			head = tail.next;
			return;
		}
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		CNode newNode = temp.next.next;
		temp.next = newNode;
	}
	boolean isEmpty() {
		return head == null;
	}

	void addAtEnd(int value) {
		CNode newNode = new CNode(value);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		if (tail == null) {
			tail = newNode;
			head.next = tail;
			tail.next = head;
			return;
		}
		CNode temp = head;
		while (temp.next != head) {

			temp = temp.next;
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	void displayCircularLinkedList() {
		CNode temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data + "-(tail) -> " + temp.next.data + "-(Head)");
		System.out.println(" ");
	}
}

class CNode {
	int data;
	CNode next;

	public CNode(int data) {
		this.data = data;
		this.next = null;
	}
}
