package ExamQuestion;
import java.util.*;

public class MaxSubstrings {
	
	public static void main(String[] args) {
		
		String s = "annebella";
		int k = 2;
		
		System.out.println(constructPal(s, k));
	}

	private static boolean constructPal(String s, int k) {
		Map<Character, Integer> map = new HashMap<>();
		int temp = 0;
		
		if(s.length()==k) {
			return true;
		}
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		if(k>s.length()) {
			return false;
		}else {
			for(int m:map.values()) {
				if(m%2 != 0) {
					temp = temp+1;
				}
			}
		}
		
		if(k<temp) {
			return false;
		}
		
		return true;
		
	}

}
