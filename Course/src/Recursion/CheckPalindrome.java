package Recursion;

public class CheckPalindrome {
	public static void main(String[] args) {
		
		int n = 1212121;
		System.out.println(checkPal(n));
	}

	private static boolean checkPal(int n) {
		Reverse r = new Reverse();
		r.rev(n);
		return n == r.r;
		
	}
}
