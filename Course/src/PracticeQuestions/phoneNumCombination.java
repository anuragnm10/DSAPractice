package PracticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class phoneNumCombination {
	public static void main(String[] args) {
		
		String input = "23";
		
		find(input);
		
	}

	private static void find(String input) {
		ArrayList<String> arr1 = new ArrayList<>();
		HashMap<String, String> map = new HashMap<>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		
		
		if(input.isBlank()) {
			return;
		}else if(input.length()==1) {
			String res = map.get(input);
			for(int i=0;i<res.length();i++) {
				System.out.println(res.charAt(i));
			}
		}else if(input.length()>1) {
			for(Map.Entry<String, String> currele : map.entrySet()) {
				if(input.contains(currele.getKey())) {
					arr1.add(currele.getValue());
				}
			}
			for()
			
		}
		
		
		
		
		
		
	}
}
