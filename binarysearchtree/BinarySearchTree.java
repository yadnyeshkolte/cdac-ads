package binarysearchtree;

public class BinarySearchTree {
	Tnode root;
	
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		System.out.println("Inserting items");
		bt.insert(bt.root, 40);
		bt.insert(bt.root, 35);
		bt.insert(bt.root, 45);
		bt.insert(bt.root, 33);
		bt.insert(bt.root, 44);
		bt.insert(bt.root, 47);
		bt.insert(bt.root, 32);
		bt.insert(bt.root, 34);
		bt.insert(bt.root, 36);
		bt.insert(bt.root, 37);
		
		bt.preorder(bt.root);
		
		System.out.println(bt.search(bt.root).data);
		
	}
	
	Tnode search(Tnode current) {
		if(current.left==) {
			
		}
		
		return root;
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
	void preorder(Tnode current) {
		if(current!=null) {
			System.out.print(current.getData()+" ");
			preorder(current.left);
			preorder(current.right);
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