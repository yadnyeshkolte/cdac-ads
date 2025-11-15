package questions.practicequestions;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		if(len<1) {
			System.out.println("Invalid Input");
			return;
		}
		SinglyLinkedListDelete sll = new SinglyLinkedListDelete();
		for(int i=0;i<len;i++) {
			sll.insertAtEnd(scan.nextInt());
		}
		
		int value = scan.nextInt();
		sll.deleteItem(value);

	}
}

class SinglyLinkedListDelete{
	Dnode head;
	
	void deleteItem(int value) {
		if(head.data == value) {
			head = head.next;
			return;
		}
		Dnode temp = head;
		Dnode prev = null;
		while(temp.next!=null && temp.data!=value) {
			prev = temp;
			temp=temp.next;
		}
		if(temp.data!=value && temp.next==null) {
			System.out.println("Not Found");
			return;
		}
		prev.next = temp.next;
		displayLinkedList();
	}
	void insertAtEnd(int value){
		Dnode newnode = new Dnode(value);
		if(head==null) {
			head = newnode;
			return;
		}
		Dnode temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = newnode;
	}
	void displayLinkedList() {
		Dnode temp = head;
		while(temp.next!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(temp.data);
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