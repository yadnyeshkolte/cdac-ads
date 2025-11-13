package questions.practicequestions;
import java.util.Scanner;
public class Q13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		bubbleSort(arr);
		
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void bubbleSort(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>=arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
