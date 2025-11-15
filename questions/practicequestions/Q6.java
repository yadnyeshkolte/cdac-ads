package questions.practicequestions;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		if(s.charAt(0)=='+' || s.charAt(0)=='-' || s.charAt(0)=='*' || s.charAt(0)=='/') {
			System.out.println("Not Possible");
		}
		
		String[] arr = s.split(" "); 
		Stack<Integer> ist = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("+")) {
				ist.add(calculate(ist, '+'));
			}
			else if(arr[i].equals("-")) {
				ist.add(calculate(ist, '-'));
			}
			else if(arr[i].equals("*")) {
				ist.add(calculate(ist, '*'));
			}
			else if(arr[i].equals("/")) {
				ist.add(calculate(ist, '/'));
			}
			else {
				ist.add(Integer.parseInt(arr[i]));
			}
			System.out.println(ist);
		}
		System.out.println(ist.peek());
	}
	static int calculate(Stack<Integer> st, char ch) {
		int num1 = st.pop();
		int num2 = st.pop();
		if(ch=='+') {
			return num1+num2;
		}
		else if(ch=='-') {
			return num2-num1;
		}
		else if(ch=='*') {
			return num1*num2;
		}
		else if(ch=='/') {
			return num2/num1;
		}
		else {
			st.add(num2);
			return num1;
		}
	}

	
}
