package binarytree;

import java.util.ArrayList;

public class BinaryTree {
	static Node root;
	static ArrayList<Integer> as = new ArrayList<>();
	public static void main(String args[]) {
		BinaryTree bs = new BinaryTree();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		bs.inOrder(root);
		System.out.println("In-Order: "+as);
		as.removeAll(as);
		bs.preOrder(root);
		System.out.println("Pre-Order: "+as);
		as.removeAll(as);
		bs.postOrder(root);
		System.out.println("Post-Order: "+as);
		as.removeAll(as);

	}
	void inOrder(Node current){
		if(current==null) {
			return;
		}
		inOrder(current.left);
		as.add(current.data); // add between the 
		inOrder(current.right);	
	}
	void preOrder(Node current) {
		if(current==null) {
			return;
		}
		as.add(current.data);
		preOrder(current.left); //add first for the pre order
		preOrder(current.right);
	}
	void postOrder(Node current) {
		if(current==null) {
			return;
		}
		postOrder(current.left);
		postOrder(current.right);
		as.add(current.data);   //add last for the post Order
	}
}
class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
