package problem3;
import java.util.Arrays;
import java.util.Scanner;
public class ShabdKhosh {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		//String[] arr = new String[n];
		//String[] newArr = new String[n];
		//for(int i=0;i<n;i++) {
			//arr[i] = scan.next();
		//}
		int n = 8;
		String[] arr = {"whisper", "format", "perform", "sonnet", "person", "shopper", "workshop", "network"};
		System.out.println(Arrays.toString(arr));
		// 2
		// start finish
		// 8
		// whisper format perform sonnet person shopper workshop network
		// "whisper", "format", "perform", "sonnet", "person", "shopper", "workshop", "network"
		boolean bool = false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int number = 3;
				while(number<arr[i].length()-1){
					if(arr[i].endsWith(arr[j].substring(0,number))) {
						String temp = arr[i+1];
						arr[i+1] = arr[j];
						arr[j] = temp;
						bool = true;
					}
					number++;
				}
				
			}
		}
		if(bool==false) {
			System.out.println("Not able to sort");
		}
		else {
			System.out.println(Arrays.toString(arr));
		}

		/*
		int index = 0;
		
		while(index<n) {
			for(int i=index+1;i<n;i++) {
				for(int j=i+1;j<n;j++){
					int number = 3;
					while(number<arr[index].length()) {
						System.out.println(arr[index]);
						System.out.println(arr[i].substring(0,3));
						
						System.out.println(arr[i]);
						System.out.println(arr[j].substring(0,3));
						if(arr[index].endsWith(arr[i].substring(0,3)) && arr[i].endsWith(arr[j].substring(0,3))) {
							System.out.println(arr[index]+" "+arr[i]+ " "+ arr[j]);
						}
						number++;
					}

				}
			}
			index++;
		}
	
		System.out.println("Hi");*/

	}
	public static String[] shubd(String[] arr) {
		
		
		
		return arr;
		
	}
}
