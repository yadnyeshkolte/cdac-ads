package adsDay3;

public class FactoraiQuestion {
	public static void main(String[] args) {
		int number = 5;
		int fac = factorial(number);
		System.out.println(fac);
	}
	public static int factorial(int n) {
		if(n == 1){
			return 1;
		}
		return n*factorial(n-1);
	}
	
}
