package questions.practicequestions;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		if(len<1) {
			System.out.println("Not valid");
			return;
		}
		if(len==1) {
			int num = scan.nextInt();
			System.out.println(num);
			return;
		}
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		
		
		reverseArray(arr, 0, len-1);
		
		//just for printing it v
		int index=0;
		while(index<len) {
			System.out.print(arr[index]+" ");
			index++;
		}
		
	}
	static void reverseArray(int arr[], int left, int right) {
		while(left<=right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
