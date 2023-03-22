package PracticeQuestions2;

public class isPerfectSquare {
	public static void main(String[] args) {
		int num = 625;
		System.out.println(checkPerfectSquare(num));
	}

	private static boolean checkPerfectSquare(int num) {
		
		int count = 1 ;
		for(int i=1;i<=num;i=i+2) {
			if(i==num)
				return true;
			else if(num > i){
				num = num - i;
				count++;
			}
		}
		
		return false;
	}
}
