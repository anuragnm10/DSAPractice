package ExamQuestion;
import java.util.*;

public class RemoveKPersons {
	
	public static void main(String[] args) {
		String nums = "123456";
		int k = 3;
		
		smallestInt(nums, k);
	}

	private static void smallestInt(String nums, int k) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<nums.length();i++) {
			char ch = nums.charAt(i);
			while(st.size() > 0 && k > 0 && ch < st.peek()) {
				st.pop();
				k--;
			}
			st.push(ch);
		}
		
		while(k>0) {
			st.pop();
			k--;
		}
		
		String smallest = "";
		while(!st.isEmpty()) {
			smallest = st.pop()+smallest;
		}
		
		while(smallest.length()>1 && smallest.charAt(0) == '0') {
			smallest = smallest.substring(1);
		}
		
		System.out.println(smallest);
	}

}
