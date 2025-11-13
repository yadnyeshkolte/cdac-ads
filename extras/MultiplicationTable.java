package extras;

public class MultiplicationTable {
	public static void main(String[] args) {
		int end = 10;
		for(int i=1;i<=end;i++) {
			for(int j=2;j<=end;j++) {
				if(i*j<10) {
					System.out.print(" "+i*j+" ");
				}
				else {
					System.out.print(i*j+" ");
				}
			}
			System.out.println("");
		}
	}
}
