package adsDay0;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class ByLevelTreversal {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		List<List<Integer>> la = new ArrayList<>();
		la = levelTreverse(root);
		for (List<Integer> result : la) {
			System.out.println(result);
		}
	}
	public static List<List<Integer>> levelTreverse(Node root){
		List<List<Integer>> li = new LinkedList<>();
		if(root==null) {
			return li;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(q.isEmpty()==false) {
			List<Integer> levels = new LinkedList<>();
			int qlen = q.size();
			for(int i=0;i<qlen;i++) {
				Node temp = q.poll();
				levels.add(temp.data);
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
			li.add(levels);
		}
		return li;
	}

}
