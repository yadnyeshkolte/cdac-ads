package internalassesment;

import java.util.Scanner;

public class ProblemStatement2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		CircularLinkedList cll = new CircularLinkedList();
		System.out.println(cll.isEmpty());
		System.out.print("Enter the C Linked List length: ");
		// int input = scan.nextInt();
		int input = 5;
		System.out.print("Enter the value giving space to add: ");

		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			cll.addAtEnd(arr[i]);
		}

		/*
		 * for(int i=0;i<input;i++) { cll.addAtEnd(scan.nextInt()); }
		 */
		System.out.print("Enter the Index Before Delete: ");
		int input2 = scan.nextInt();
		cll.displayCircularLinkedList();
		CircularLinkedList cll1 = cll;
		cll1.deleteBeforeIndex(input2);
		cll1.displayCircularLinkedList();
		//CircularLinkedList cll2 = cll;
		//cll2.deleteAfterIndex(input2);
		//cll2.displayCircularLinkedList();

	}
}

class CircularLinkedList {
	CNode head;
	CNode tail;

	// 6
	// 10 20 30 40 50 60
	void deleteBeforeIndex(int index) {
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
		
		System.out.println(prev.data + " " + temp.data+" "+temp.next.data);
		prev.next = temp.next;
	}

	void deleteAfterIndex(int pos) {
		int index = pos-1;
		//System.out.println(index);
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
		
		System.out.println(temp.data + " " + temp.next.data);
		
		CNode newNode = temp.next.next;
		System.out.println(newNode.data+" NewNode ");
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
