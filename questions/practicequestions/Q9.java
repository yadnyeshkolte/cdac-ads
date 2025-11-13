package questions.practicequestions;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int output = sum(input, 0);
		System.out.println(output);
	}
	static int sum(int input, int out) {
		if(input==0) {
			return out;
		}
		out = out+(input%10);
		input = input/10;
		out = sum(input, out);
		return out;
	}
}
