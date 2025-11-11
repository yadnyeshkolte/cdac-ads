package adsDay0;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class ByLevelTreversal {
	public static void main(String[] args) {
		TNode root = new TNode(1);
		root.left = new TNode(2);
		root.right = new TNode(3);
		root.left.left = new TNode(4);
		root.left.right = new TNode(5);
		root.right.left = new TNode(6);
		root.right.right = new TNode(7);
		
		List<List<Integer>> li = new LinkedList<>();
		
		li = levelOrderT(root);
		
		for(List<Integer> re: li) {
			System.out.println(re);
		}
	}
	public static List<List<Integer>> levelOrderT(TNode root){
		List<List<Integer>> li = new LinkedList<>();
		if(root==null) {
			return li;
		}
		Queue<TNode> q = new LinkedList<>(); 
		q.add(root);
		while(q.isEmpty()!=true) {
			List<Integer> level = new LinkedList<>();
			int qlength = q.size();
			
			for(int i=0;i<qlength;i++) {
				TNode temp = q.poll();  //pop
				level.add(temp.data);
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
			li.add(level);
		}
		return li;
	}
}


class TNode{
	int data;
	TNode left;
	TNode right;
	TNode(int value){
		this.data = value;
		this.left = null;
		this.right = null;
		
	}
}