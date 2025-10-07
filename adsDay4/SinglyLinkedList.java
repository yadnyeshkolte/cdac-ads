package adsDay4;

public class SinglyLinkedList {
	static SinglyLinkedListNode head;
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		head = new SinglyLinkedListNode(99);
		
		sll.insertAtTheBeginning(98);
		sll.insertAtTheBeginning(101);
		sll.insertAtTheBeginning(304);
		sll.insertAtTheEnd(7777);
		sll.insertAtAfterGivenElement(999, 101);
		//sll.insertAtBeforeGivenElement(200, 101);

		
		SinglyLinkedListNode temp = head;
		System.out.println(temp.data);
		System.out.println(temp.next);
		while(temp.next!=null) {
			temp = temp.next;
			System.out.println(temp.data);
			System.out.println(temp.next);
		}
	}
	//
	public void insertAtBeforeGivenElement(int value, int bvalue) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(value);
		SinglyLinkedListNode temp = head;
		while(temp.next.data!=bvalue) {
			temp = temp.next;
			
		}
		temp.next = value;
		value.next = bvalue;
	}
//
	public void insertAtAfterGivenElement(int value, int avalue) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(value);
		SinglyLinkedListNode temp = head;
		while(temp.next!=null) {
			if(temp.data==avalue) {
	            newnode.next = temp.next;
	            temp.next = newnode;
	            return; // insertion done, exit

			}
			temp = temp.next;
		}
	}
	public void insertAtTheEnd(int value) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(value);
		if(head==null) {
			System.out.println("Head is not present");
			head = newnode;
			return;
		}
		SinglyLinkedListNode temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}
	public void insertAtTheBeginning(int value) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(value);
		newnode.next = head;
		head = newnode;
	}
}

class SinglyLinkedListNode{
	int data;
	SinglyLinkedListNode next;
	
	SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
