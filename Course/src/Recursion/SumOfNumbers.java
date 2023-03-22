package Recursion;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		int num = 12345;
		
		int ans = sum(num);
		System.out.println(ans);
	}

	private static int sum(int num) {
		if(num == 0) {
			return 0;
		}
		
		return num%10 + sum(num/10);
		
	}

}
