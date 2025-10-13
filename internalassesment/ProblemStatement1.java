package internalassesment;

import java.util.Scanner;

public class ProblemStatement1 {
	public static void main(String[] args) {
		// 8
		// 12 15 10 11 5 6 2 3 
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();
		
		System.out.print("Enter the LinkedList Size: ");
		int input = scan.nextInt();
		System.out.print("Enter the LinkedList items with spaces: ");
		for(int i=0;i<input;i++) {
			sll.addAtEnd(scan.nextInt());
		}
		sll.diplayLinkedList();
		sll.deleteNode();
		sll.diplayLinkedList();
	}
}
class SinglyLinkedList{
	Node head;
	
	public void deleteNode() {
		
	}
	public void addAtEnd(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void diplayLinkedList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public boolean isEmpty() {
		return head == null;
	}
}
class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}