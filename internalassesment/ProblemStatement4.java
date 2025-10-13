package internalassesment;

import java.util.Scanner;

public class ProblemStatement4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = "(3 + 2) * (7 - 5)";
		String s1 = "((3 + 4) * 2 ";
		
		//System.out.println(3+2*7-5);
		int i = Integer.parseInt(s);
		char c = '3'+'+'+'2'+'*'+'7'+'-'+'5';
		System.out.println(i);
	}
}
