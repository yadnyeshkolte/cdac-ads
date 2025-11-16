package linkedlist;

public class SinglyHeadTail {
	Dnode head;
	Dnode tail;
	public static void main(String[] args) {
		SinglyHeadTail dll = new SinglyHeadTail();
		dll.insertAtEnd(3);
		dll.insertAtEnd(5);
		dll.insertAtEnd(10);
		dll.insertAtEnd(15);
		dll.insertAtEnd(16);
		dll.insertAtEnd(18);
		dll.insertAtEnd(20);
		dll.insertAtBeginning(1);
		dll.insertAfterElement(13, 10);
		dll.insertBeforeElement(11, 13);
		dll.deleteLastElement();
		dll.deleteFirstElement();
		dll.deleteAnElement(13);
		
		
		dll.displayLinkedList();
	}
	
	void deleteAnElement(int target) {
		if(head.data==target) {
			deleteFirstElement();
			return;
		}
		if(tail.data==target) {
			deleteLastElement();
			return;
		}
		Dnode temp = head;
		Dnode prev = null;
		while(temp!=tail && temp.data!=target) {
			prev= temp;
			temp = temp.next;
		}
		Dnode temp2 = temp.next;
		prev.next = null;
		prev.next = temp2;
	}
	
	void deleteFirstElement() {
		head = head.next;
	}
	
	
	void deleteLastElement() {
		Dnode temp = head;
		while(temp.next!=tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
	}
	void insertBeforeElement(int value, int target) {
		if(head.data == target) {
			insertAtBeginning(value);
			return;
		}
		Dnode newnode = new Dnode(value);
		Dnode prev = null;
		Dnode temp = head;
		while(temp.next!=tail && temp.data!=target) {
			prev = temp;
			temp = temp.next;
		}
		newnode.next = prev.next;
		prev.next = newnode;
		
	}
	void insertAfterElement(int value, int target) {
		if(tail.data == target) {
			insertAtEnd(value);
			return;
		}
		Dnode newnode = new Dnode(value);
		Dnode temp = head;
		while(temp.next!=tail && temp.data!=target) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	void insertAtEnd(int value) {
		Dnode newnode = new Dnode(value);
		if(head==null) {
			head = newnode;
			return;
		}
		if(tail==null) {
			tail = newnode;
			head.next = tail;
			return;
		}
		tail.next = newnode;
		tail = newnode;
	}
	void insertAtBeginning(int value) {
		Dnode newnode = new Dnode(value);
		if(head==null) {
			head = newnode;
			return;
		}
		if(tail==null) {
			Dnode temp = head;
			head = newnode;
			tail = temp;
			head.next = tail;
			return;
		}
		newnode.next = head.next;
		head = newnode;
		
	}
	
	void displayLinkedList() {
		Dnode temp = head;
		System.out.print(temp.data+"(Head) -> ");
		while(temp.next!=tail) {

			temp = temp.next;
			System.out.print(temp.data+" -> ");
		}
		System.out.print(temp.next.data+"(tail)");
		
	}
}

class Dnode{
	int data;
	Dnode next;
	Dnode(int data){
		this.data = data;
		next = null;
	}
}


