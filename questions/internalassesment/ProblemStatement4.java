package questions.internalassesment;

import java.util.Scanner;
import java.util.Stack;


public class ProblemStatement4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Expression: ");
		String input = scan.nextLine();
		String refinedS = input.replace(" ","");
		if(isBalanced(refinedS)) {
			System.out.println(evaluateExpression(refinedS.toCharArray()));
		}
		else {
			System.out.println("Invalid Expression");
		}
		/*
		String s = "(3 + 2) * (7 - 5)";
		String s1 = "((3 + 4) * 2 ";
		*/
		//String s2 = "((3+4)*2";
		//System.out.println(isBalanced(s2));
	}
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                if (st.isEmpty()) {
                	 	return false; 
                } 
                char top = st.peek();
                if (c == ')' && top != '(') {
                    return false;
                }
                st.pop(); 
            }
        }
        return st.isEmpty(); 
    }
    static int evaluateExpression(char[] arr) {
        Stack<Integer> vStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        opStack.push('(');
        //adding the opening decoy parenthesis 

        int pos = 0;
        while (pos <= arr.length) {
            if (pos == arr.length || arr[pos] == ')') {
                processClosingParenthesis(vStack, opStack);
                pos++;
            } 
            else if (arr[pos] >= '0' && arr[pos] <= '9') {
                pos = processInputNumber(arr, pos, vStack);
            } 
            else {
                processInputOperator(arr[pos], vStack, opStack);
                pos++;
            }
        }
     // result remains on values stack
        return vStack.pop(); 
    }

    static void processClosingParenthesis(Stack<Integer> vStack, Stack<Character> opStack) {
        while (opStack.peek() != '(') {
            executeOperation(vStack, opStack);
        }

        opStack.pop(); 
        // remove the opening parenthesis
    }

    static int processInputNumber(char[] arr, int pos, Stack<Integer> vStack) {
        int value = 0;
        while (pos < arr.length &&
               arr[pos] >= '0' && arr[pos] <= '9') {
            value = 10 * value + (int)(arr[pos++] - '0');
        }

        vStack.push(value);

        return pos;
    }

    static void processInputOperator(char op, Stack<Integer> vStack, Stack<Character> opStack) {
        while (opStack.size() > 0 &&
               operatorCausesEvaluation(op, opStack.peek())) {
            executeOperation(vStack, opStack);
        }

        opStack.push(op);
    }

    static boolean operatorCausesEvaluation(char op, char prevOp) {
        boolean evaluate = false;

        switch (op) {
            case '+':
            case '-':
                evaluate = (prevOp != '(');
                break;
            case '*':
            case '/':
                evaluate = (prevOp == '*' || prevOp == '/');
                break;
            case ')':
                evaluate = true;
                break;
        }

        return evaluate;
    }

    static void executeOperation(Stack<Integer> vStack, Stack<Character> opStack) {
        int rightnumber = vStack.pop();
        int leftnumber = vStack.pop();
        char op = opStack.pop();
        int res = 0;
        switch (op) {
            case '+':
                res = leftnumber + rightnumber;
                break;
            case '-':
                res = leftnumber - rightnumber;
                break;
            case '*':
                res = leftnumber * rightnumber;
                break;
            case '/':
                res = leftnumber / rightnumber;
                break;
        }
        vStack.push(res);
    }
}
