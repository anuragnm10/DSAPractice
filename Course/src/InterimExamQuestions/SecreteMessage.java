package InterimExamQuestions;

public class SecreteMessage {
	
	public static void main(String[] args) {
		
		String message = "annnnssss";
		encriptMessage(message);
		
	}

	private static void encriptMessage(String message) {
		
		char[] input = message.toCharArray();
		int count = 1;
		char temp = input[0];
		if(input.length==1) {
			System.out.println(message);
		}else {
			for(int i=1;i<input.length;i++) {
				if(input[i] == temp) {
					count++;
				}else {
					if(count==1) {
						System.out.print(temp);
					}else {
						System.out.print(count+""+temp);
					}
					count = 1;
					temp = input[i];
				}
				
			}
			System.out.print(count+""+temp);
		}
		
	}

}
