package DSAGradedProject1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcdbb"));
		}
		public static int lengthOfLongestSubstring(String str) {
		//write your code here
			Set<Character> charac = new HashSet<>();
			
			for(int i=0;i<str.length();i++) {
				charac.add(str.charAt(i));
			}
			
			return charac.size();
		}


}
