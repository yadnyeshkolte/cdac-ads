package practice;

public class CircularLinkedList {
	Cnode head;
	Cnode tail;
	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		
		cl.insertAtBegin(10);
		cl.insertAtBegin(5);
		cl.insertAtBegin(3);
		cl.insertAtEnd(15);
		cl.insertAtEnd(20);
		cl.insertAtEnd(25);
		cl.insetAfterElement(10, 12);
		cl.insetAfterElement(100, 35);
		cl.insetBeforeElement(20, 18);
		cl.insetBeforeElement(200, 1);
		cl.insetBeforeElement(35, 30);
		cl.deleteLast();
		cl.deleteFirst();
		cl.deleteElement(10);
		cl.displayCircularLinkedList();
	}

	void deleteElement(int target) {
		if(head==null || tail==null) {
			System.out.println("Connot able to Delete it");
			return;
		}
		if(head.data==target) {
			deleteFirst();
			return;
		}
		if(tail.data==target) {
			deleteLast();
			return;
		}
		Cnode temp = head;
		Cnode prev = null;
		while(temp.next!=head && temp.data!=target) {
			prev = temp;
			temp = temp.next;
		}
		Cnode tempc = temp.next;
		prev.next = null;
		prev.next = tempc;
		
	}
	void deleteFirst() {
		if(head==null || tail==null) {
			System.out.println("Cannot able to Delete it");
			return;
		}
		Cnode temp = head.next;
		head = null;
		head = temp;
		tail.next = head;
	}
	void deleteLast() {
		if(head==null || tail==null) {
			System.out.println("Cannot able to Delete it");
			return;
		}
		Cnode temp = head;
		Cnode prev = null;
		while(temp.next!=head) {
			prev = temp;
			temp = temp.next;
		}	
		Cnode tempc = head;
		prev.next = null;
		tail = prev;
		tail.next = tempc;
	}
	
	void insetBeforeElement(int target, int value) {
		if(head.data==target) {
			insertAtBegin(value);
			return;
		}
		Cnode newnode = new Cnode(value);
		Cnode temp = head;
		Cnode prev = null;
		while(temp.next!=head && temp.data!=target) {
			prev = temp;
			temp = temp.next;
		}
		if(tail.data==target) { // if tail data is same as value it will do it here
			newnode.next = temp;
			prev.next = newnode;
			return;
		}
		
		if(temp.next==head) { //if value didnot exit it will at the the front
			insertAtBegin(value);
			return;
		}
		newnode.next = temp;
		prev.next = newnode;
	}
	
	
	void insetAfterElement(int target, int value) {
		if(tail.data==target) {
			insertAtEnd(value);
			return;
		}
		Cnode newnode = new Cnode(value);
		Cnode temp = head;
		while(temp.next!=tail && temp.data!=target) { //may be problem in 2nd last one
			temp = temp.next;
		}
		if(temp.next==tail) { //if value didnot exist it will add at the end
			insertAtEnd(value);
			return;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	void insertAtEnd(int value) {
		Cnode newnode = new Cnode(value);
		if(head==null) {
			head = newnode;
			return;
		}
		if(tail==null) {
			tail = newnode;
			head.next = tail;
			tail.next = head;
			return;
		}
		
		tail.next = newnode;
		tail = newnode;
		tail.next = head;
	}
	void insertAtBegin(int value) {
		Cnode newnode = new Cnode(value);
		if(head==null) {
			head= newnode;
			return;
		}
		if(tail==null) {
			Cnode temp = head;
			head = newnode;
			head.next = temp;
			tail = temp;
			tail.next = head;
			return;
		}
		newnode.next = head;
		head = newnode;
		tail.next = head;
	}
	void displayCircularLinkedList() {
		Cnode temp = head;
		System.out.print(head.data+" -> ");
		while(temp.next!=tail) {
			temp=temp.next;
			System.out.print(temp.data+" -> ");
		}
		System.out.print(tail.data+"(Tail)"+" -> ");
		System.out.println(tail.next.data+"(Head)"+" -> ");
	}
}

class Cnode{
	int data;
	Cnode next;
	Cnode(int data){
		this.data = data;
		next = null;
	}
}
