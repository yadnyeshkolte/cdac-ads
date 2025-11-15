package questions.practicequestions;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		hanoi(num, "A", "C", "B");
	}
	public static void hanoi(int n, String from, String to, String via) {
		if(n == 1){
			System.out.println("Move disk 1 from " + from + " to " + to);
		}
		else{
		    hanoi(n-1, from, via, to);
		    System.out.println("Move disk " + n + " from " + from + " to " + to);
		    hanoi(n-1, via, to, from);
		    }
		}
}
