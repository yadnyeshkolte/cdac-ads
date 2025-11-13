package questions.practicequestions;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		if(len<1) {
			System.out.println("Invalid Input");
			return;
		}
		SinglyLinkedList sll = new SinglyLinkedList();
		for(int i=0;i<len;i++) {
			sll.insertAtEnd(scan.nextInt());
		}
		int pos = scan.nextInt();
		int value = scan.nextInt();
		
		if(pos>len) {
			sll.insertAtEnd(value);
		}
		else {
			sll.insertAtPosition(pos, value);
		}
		sll.displayLinkedList();
	}
}

class SinglyLinkedList{
	Node head;
	
	void insertAtPosition(int pos, int value) {
		Node newnode = new Node(value);
		if(pos==1) {
			newnode.next = head;
			head = newnode;
			return;
		}
		Node temp = head;
		Node prev = null;
		int count = 1;
		while(count<pos) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		newnode.next = temp;
		prev.next = newnode;
		
	}
	void insertAtEnd(int value){
		Node newnode = new Node(value);
		if(head==null) {
			head = newnode;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = newnode;
	}
	void displayLinkedList() {
		Node temp = head;
		while(temp.next!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(temp.data);
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