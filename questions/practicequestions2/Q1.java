package questions.practicequestions2;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		int rot = scan.nextInt();
		rotateArray(arr, rot);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotateArray(int[] arr, int k) {
		if(k==arr.length) {
			return;
		}
		if(k>arr.length){
			k = k-arr.length;
		}
		
	}
}
