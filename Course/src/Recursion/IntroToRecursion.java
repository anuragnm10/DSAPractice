package Recursion;

public class IntroToRecursion {
	
	public static void main(String[] args) {
		int n = 1;
		fun1(n);
		
	}
	
	static void fun1(int n) {
		if(n==6) {
			return;
		}
		System.out.print(n+" ");
		fun1(n+1);
	}
	

}
