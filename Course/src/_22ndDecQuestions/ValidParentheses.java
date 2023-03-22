package _22ndDecQuestions;
import java.util.*;

public class ValidParentheses {
	public static void main(String[] args) {
		
		String in = "()[]{";
		boolean result = validPara(in);
		
		if(result) {
			System.out.println("Brackets "+in+" are balanced.");
		}else {
			System.out.println("Brackets "+in+" are not balanced");
		}
		
		
	}

	private static boolean validPara(String in) {
		if(in.length()==0 || in.length()%2!=0) {
			return false;
		}
		
		Stack<Character> st = new Stack<>();
		for(int i=0;i<in.length();i++) {
			char c = in.charAt(i);
			
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
				continue;
			}
			
			if(st.isEmpty()) {
				return false;
			}
			
			char peekval = st.peek();
			if(peekval == '(' && c == ')' || peekval == '{' && c == '}' || peekval == '[' && c == ']') {
				st.pop();
			}else {
				return false;
			}
		}
		
		if(st.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
}
