package problem3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyNumbers {
	static int iter = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//7 (7^2 = 49 , 49 (4^2+9^2) = 97 , 97 (9^2+7^2) = 130, 130 (1^2+3^2) = 10, (1^2) = 1 , so 7 is a happy number, which reaches 1 on 6 iterations.
		// 7 11
		HashMap<Integer, Integer> hp = new HashMap<>();
		for(int i=44;i<=68;i++) {
			iter = 10;
			int number = happy(i);
			if(number!=-1) {
				hp.put(i, number);
			}
		}
		for(Map.Entry<Integer, Integer> p: hp.entrySet()) {
			System.out.println(p.getKey()+" "+p.getValue());
		}
	}
	public static int happy(int n) {
		if(iter==0) {
			return -1;
		}
		if(n==1) {
			return 10-iter+1;
		}
		int number = n;
		int square1 = 0;
		while(number>0) {
			int num = (number%10);
			square1 += num*num;
			number = number/10;
		}
		System.out.println(square1);
		iter--;
		return happy(square1);
	}
}
