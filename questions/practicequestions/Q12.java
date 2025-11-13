package questions.practicequestions;
import java.util.Scanner;
public class Q12 {
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
		int left = 0;
		int right = len-1;
		while(left<=right) {
			
			int mid = (left+right)/2;
			if(value<arr[mid]) {
				right = mid-1;
			}
			else if(value>arr[mid]){
				left = mid+1;
			}
			else {
				if(arr[mid]==value) {
					System.out.println(mid+1);
					return;
				}
			}
		}
		System.out.println(-1);
	}
}
