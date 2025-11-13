package questions.practicequestions;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		int value = scan.nextInt();
		if(len==1) {
			if(arr[0]==value) {
				System.out.println("1");
			}
			else {
				System.out.println("-1");
			}
		}
		for(int i=0;i<len;i++) {
			if(arr[i]==value) {
				System.out.println(i+1);
				return;
			}
		}
		System.out.println(-1);
	}
}
