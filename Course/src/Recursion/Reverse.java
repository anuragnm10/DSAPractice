package Recursion;

public class Reverse {
	public static void main(String[] args) {
		int num = 12345;
		
		rev(num);
		System.out.println(r);

	}
	static int r;
	public static void rev(int num) {
		if(num == 0) {
			return;
		}
		
		int val = num%10;
		r = r * 10 + val;
		
		rev(num/10);
	}
	
}
