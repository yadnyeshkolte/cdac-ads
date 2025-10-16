package internalassesment;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		String s = "(3+2)*(7-5)";
		int number = evaluateExp(s);
		System.out.println(number);
	}

	static int evaluateExp(String s) {
		Stack<Character> st = new Stack<>();
		for (char c : s.toCharArray()) {

		}

		return 0;
	}
}
