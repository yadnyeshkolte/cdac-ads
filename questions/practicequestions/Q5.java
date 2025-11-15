package questions.practicequestions;
import java.util.Scanner;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        if(checkBalanced(s)) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
    
    static boolean checkBalanced(String s) {
        if(s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch =='{' || ch =='[' || ch =='(') {
                stack.push(ch);
            }

            else if(ch=='}' || ch ==']' || ch ==')') {
                if(stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if(ch=='}' && top!='{') {
                    return false;
                }
                if(top!='[' && ch==']') {
                    return false;
                }
                if(ch==')' && top !='(') {
                    return false;
                }
                System.out.println("top: "+top);
            }
            System.out.println(stack);
        }
        
        return stack.isEmpty();
    }
}