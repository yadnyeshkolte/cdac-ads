```java

public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter the String 1: ");
		String s1 = scan.next();
		System.out.print("Please Enter the String 2: ");
		String s2 = scan.next();
		System.out.println("");
		
	   String[][] matrix = new String[s1.length()][s2.length()];
	   for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = "*";
           }
       }
	   int indexr = 0;
	   int indexc = 0;
	   
	   boolean bool = false;
	   for(int i=0;i<s1.length();i++) {
		   for(int j=0;j<s2.length();j++) {
			   if(s1.charAt(i)==s2.charAt(j)) {
				   indexr = i; //0
				   indexc = j; 
				   bool = true;
				   break;
			   }
		   }
	   }
	   if(bool == false) {
		   System.out.println("Cannot have similer");
	   }
	   
	   for(int i=0;i<s1.length();i++) {
		   matrix[i][indexc] = s1.charAt(i)+"";
	   }
	   
	   for(int i=0;i<s2.length();i++) {
		   matrix[indexr][i] = s2.charAt(i)+"";
	   }

	   for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println(); // Move to next line after each row
       }
	}
}

```
