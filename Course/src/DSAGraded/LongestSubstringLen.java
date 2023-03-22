package DSAGraded;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLen {
	
	public static void main(String[] args) {
		
		
		String input = "asbhbchd";
		
		System.out.println(findlen(input));
		
	}

	private static int findlen(String input) {
		Set<Character> charac = new HashSet<>();
		
		for(int i=0;i<input.length();i++) {
			charac.add(input.charAt(i));
		}
		
		return charac.size();
		
	}

}
