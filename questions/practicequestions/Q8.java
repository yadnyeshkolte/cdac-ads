package questions.practicequestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
        int n = 5;
        System.out.println("Input: " + n);
        System.out.print("Output: ");
        printBinaryNumbers(n);
        System.out.println();
		
	}
	
	   public static List<String> generateBinaryNumbers(int n) {
	        List<String> result = new ArrayList<>();
	        
	        if (n <= 0) {
	            return result;
	        }
	        
	        Queue<String> queue = new LinkedList<>();
	        

	        queue.offer("1");

	        for (int i = 0; i < n; i++) {

	            String current = queue.poll();
	            result.add(current);
	            
	            queue.offer(current + "0");
	            queue.offer(current + "1");
	        }
	        
	        return result;
	    }
	    

	    public static void printBinaryNumbers(int n) {
	        List<String> binaryNumbers = generateBinaryNumbers(n);
	        System.out.println(String.join(" ", binaryNumbers));
	    }
}
