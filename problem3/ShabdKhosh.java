package problem3;
import java.util.Arrays;
import java.util.Scanner;
public class ShabdKhosh {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		String[] newArr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.next();
		}
		System.out.println(Arrays.toString(arr));
		// 2
		// start finish
		// 8
		// whisper format perform sonnet person shopper workshop network
		int index = 0;
		
		
		String s = "stfink";
		String s2 = "finkish";
		for(int i=0;i<arr.length;i++) {
			
		}
		if(s2.substring(0,3).endsWith(s.substring(s.length()-3))) {
			System.out.println(s2.substring(0,3));
			System.out.println(s.substring(s.length()-3));
			System.out.println("Mayconnect");
		}
		else {
			System.out.println("Hthe ");
		}
	}
}
