package questions.practice2;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		if(s.length()==1) {
			System.out.println("Yes");
			return;
		}
		int left = 0;
		int right = s.length()-1;
		
		while(left<=right) {
			if(s.charAt(left) != s.charAt(right)) {
				System.out.println("No");
				return;
			}
			left++;
			right--;
		}
		System.out.println("Yes");
		
	}
}
