package PracticeQuestions2;

import java.util.*;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		String input = "aabbcccddddefgh";
		System.out.println(findLenOfPalindrome(input));
	}

	private static int findLenOfPalindrome(String input) {
		Map<Character, Integer> map = new HashMap<>();
		int length = 0;
		boolean flag = true;
		char[] ch = input.toCharArray();
		if(ch.length==0) {
			return length;
		}
		for(char val : ch) {
			if(map.containsKey(val)) {
				int temp = map.get(val);
				map.put(val, temp+1);
			}else {
				map.put(val, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> vals : map.entrySet()) {
			if(vals.getValue()%2!=0) {
				if(flag) {
					length += vals.getValue();
					flag = false;
				}else {
					length += vals.getValue()-1;
				}
			}else {
				length += vals.getValue();
			}
		}
		
		return length;
		
	}

}
