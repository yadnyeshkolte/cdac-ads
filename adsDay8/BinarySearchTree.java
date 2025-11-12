package adsDay8;

public class BinarySearchTree {
	Tnode root;
	
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		System.out.println("Inserting items");
		bt.insert(bt.root, 10);
	}
	
	public void insert(Tnode current, int value) {
		if(current==null) {
			current = new Tnode(value);
			root = current;
			System.out.println("Data inserted at root");
			return;
		}
		// We don't have duplicates in binary search tree
		if(value<current.getData()) {
			if(current.left==null) {
				current.left = new Tnode(value);
				System.out.println("Data is inserted left of: "+current.getData());
				return;
			}
			else {
				insert(current.left, value);
			}
		}
		else {
			if(current.right==null) {
				current.right = new Tnode(value);
				System.out.println("Data is inserted right of: "+current.getData());
				return;
			}
			else {
				insert(current.right, value);
			}
		}
	}
	
}


class Tnode{
	int data;
	Tnode left;
	Tnode right;
	
	Tnode(int data){
		this.data = data;
		left = null;
		right = null;
	}
	int getData() {
		return this.data;
	}
}