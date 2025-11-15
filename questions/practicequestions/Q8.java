package questions.practicequestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n<=0) {
			System.out.println("Not valid number");
			return;
		}
        printBinaryNumber(n);
		
	}
	static void printBinaryNumber(int num) {
		List<String> arr = new ArrayList<>();
		Queue<String> que = new LinkedList<>();
		
		que.offer("1");
		
		for(int i=0;i<num;i++) {
			String temp = que.poll();
			arr.add(temp);
			//storing only two in one for loop
			//remember it ok
			que.offer(temp+"0");
			que.offer(temp+"1");
		}
		
		for(String s: arr) {
			System.out.print(s+" ");
		}
		
	}
}
