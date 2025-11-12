package practice;

public class SinglyLinkedList {
	static Node head;
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insetAtEnd(10);
		sl.insetAtEnd(20);
		sl.insetAtEnd(30);
		sl.insetAtEnd(40);
		sl.insetAtEnd(50);
		sl.insertAtBegin(5);
		
		sl.insertAfterElement(30, 35);
		sl.insertBeforeElement(10, 7);

		sl.deleteLast();
		sl.deleteAtStart();
		sl.deleteBetween(7);
		sl.displayLinkedList();
	}
	void deleteBetween(int target) { 
		if(head.data == target) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			temp = null;
			System.out.println("Delete the element: "+target);
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.next!=null && temp.data!=target) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		temp.next = null;
		System.out.println("Deleted the target: "+target);
	}
	
	void deleteAtStart() {
		Node temp = head;
		head = head.next;
		temp.next = null;
		temp = null;
		System.out.println("Deleted at Start");
	}
	void deleteLast() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		temp = null;
		System.out.println("Deleted at Last");
	}
	
	void insertBeforeElement(int target, int value) {
		Node newnode = new Node(value);
		if(head==null) {
			head= newnode;
			head.next = null;
			return;
		}
		Node temp = head;
		Node prev = null;
		
		if(head.data == target) {
			newnode.next = head;
			head = newnode;
			return;
		}
		while(temp.next!=null && temp.data!=target) {
			prev = temp;
			temp = temp.next;
		}
		newnode.next = temp;
		prev.next = newnode;
		
	}
	void insertAfterElement(int target, int value) {
		Node newnode = new Node(value);
		if(head==null) {
			head=newnode;
			head.next = null;
			return;
		}
		Node temp = head;
		while(temp.next!=null && temp.data!=target) {
			temp=temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	
	void insertAtBegin(int value) {
		Node newnode = new Node(value);
		if(head==null){
			head = newnode;
			head.next = null;
			return;
		}
		newnode.next = head;
		head = newnode;
		
	}
	
	void insetAtEnd(int value) {
		Node newnode = new Node(value);
		if(head==null) {
			head = newnode;
			head.next = null;
			return;
		}
		Node temp =head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}
	
	void displayLinkedList() {
		Node temp = head;
		while(temp.next!=null) {
			System.out.print(temp.data+" "+"->"+" ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}