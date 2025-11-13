package questions.internalassesment;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		int number;
		String s = "(3+2)"; //*(7-5)
		Stack<Character> sc = new Stack<>();
		Stack<Character> cal = new Stack<>();
		int index = 0;
		do {
			if(s.charAt(index)==')') {
				while(sc.peek()=='(') {
					char ch = sc.pop();
					cal.push(ch);
				}
				sc.pop();
				sc.push(returnEval(cal));
				System.out.println(sc);
				
			}
			sc.push(s.charAt(index));
			index++;
			
		}while(!sc.isEmpty());
	}
	public static char returnEval(Stack<Character> cal) {
		if(cal.size()==1) {
			return 0;
		}
		int number1 = (int) cal.pop();
		char oper = cal.pop();
		int number2 = (int) cal.pop();
		if(oper=='+') {
			return (char) (number1+number2);
		}
		else if(oper=='-') {
			return (char) (number1-number2);
		}
		else if(oper=='*') {
			return (char) (number1*number2);
		}
		else if(oper=='/') {
			return (char) (number1/number2);
		}
		else {
			return (char) number1;
		}
	}


}
