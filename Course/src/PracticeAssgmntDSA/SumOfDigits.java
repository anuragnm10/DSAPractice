package PracticeAssgmntDSA;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int num = 123;
		System.out.print(sum(num));
		
	}

	private static int sum(int no) {
		
		if(no==0) {
			return 0;
		}else {
			return no%10 + sum(no/10);
		}
		
	}

}
