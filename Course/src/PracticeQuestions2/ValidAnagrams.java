package PracticeQuestions2;

import java.util.Arrays;

public class ValidAnagrams {
	
	public static void main(String[] args) {
		String s = "anurag";
		String t = "nuraag";
		
		System.out.println(isAnagrams(s,t));
	}

	private static boolean isAnagrams(String s, String t) {
		char[] char1 = s.toCharArray();
		char[] char2 = t.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		String sortedS = new String(char1);
		String sortedtT = new String(char2);
		if(sortedS.equals(sortedtT))return true;
		return false;
		
	}
	

}
