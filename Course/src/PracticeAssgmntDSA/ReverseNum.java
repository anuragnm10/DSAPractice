package PracticeAssgmntDSA;

public class ReverseNum {
	
	public static void main(String[] args) {
		
		int num = 3546;
		reverse(num);
		
	
	}
	

	private static void reverse(int num) {
		if(num < 10) {
			System.out.print(num);
			return;
		}else {
			System.out.print(num%10);
			
			reverse(num/10);
		}
		
		
	}

}
