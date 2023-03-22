package PracticeQuestions;

public class ValidateParentheses {
	
	public static void main(String[] args) {
		
		String input = "()))";
		
		System.out.println(validatePara(input));
	}

	private static int validatePara(String input) {
		int opening = 0;
		int closing = 0;
		char[] arrPara = input.toCharArray();
		for(char para : arrPara) {
			if(para == '(') {
				opening++;
			}else {
				opening--;
			}
			
			if(opening == -1) {
				opening++;
				closing++;
			}
			
			
		}
		
		return opening+closing;
		
	}

}
