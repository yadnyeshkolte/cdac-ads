package questions.practicequestions;
import java.util.Scanner;
import java.util.Stack;
public class Q5InEfficient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.length()==0) {
			System.out.println("Not Balanced");
			return;
		}
		if(s.length()==1) {
			System.out.println("Not Balanced");
			return;
		}

		if(checkBalanced(s)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}
	static boolean checkBalanced(String s) {
		Stack<Character> para = new Stack<>();
		Stack<Character> decoy = new Stack<>();
		int index = 0;
		para.add(s.charAt(index));
		index++;
		while(!para.isEmpty() && index<s.length()) {
			if(s.charAt(index)=='{' || s.charAt(index)=='[' || s.charAt(index)=='(') {
				para.add(s.charAt(index));
				index++;
			}
			else {
				if(s.charAt(index) == ']') {
					if(!check1(para, decoy, '[')) {
						return false;
					}
				}
				else if(s.charAt(index) == '}') {
					if(!check2(para, decoy, '{')) {
						return false;
					}
				}
				else if(s.charAt(index) == ')') {
					if(!check3(para, decoy, '(')) {
						return false;
					}
				}
				index++;
			}
		}
		//System.out.println(index);
		return para.isEmpty();
	}
	static boolean check1(Stack<Character> para, Stack<Character> decoy, char ch) {
		int len = para.size();
		while(!para.isEmpty()) {
			if(para.peek()==ch) {
				para.pop();
				break;
			}
			char temp = para.pop();
			decoy.add(temp);
		}
		while(!decoy.isEmpty()) {
			char temp = decoy.pop();
			para.add(temp);
		}
		if(len==para.size()) {
			return false;
		}
		return true;
	}
	static boolean check2(Stack<Character> para, Stack<Character> decoy, char ch) {
		int len = para.size();
		while(!para.isEmpty()) {
			if(para.peek()==ch) {
				para.pop();
				break;
			}
			char temp = para.pop();
			decoy.add(temp);
		}
		while(!decoy.isEmpty()) {
			char temp = decoy.pop();
			para.add(temp);
		}
		if(len==para.size()) {
			return false;
		}
		return true;
	}
	static boolean check3(Stack<Character> para, Stack<Character> decoy, char ch) {
		int len = para.size();
		while(!para.isEmpty()) {
			if(para.peek()==ch) {
				para.pop();
				break;
			}
			char temp = para.pop();
			decoy.add(temp);
		}
		while(!decoy.isEmpty()) {
			char temp = decoy.pop();
			para.add(temp);
		}
		if(len==para.size()) {
			return false;
		}
		return true;
	}
}