package HashingPracticeQuestions;

import java.util.*;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		
		String[] input = {"a"};
		List<List<String>> result = group(input);
		System.out.println(Arrays.deepToString(result.toArray()));
	}

	private static List<List<String>> group(String[] input) {
		List<List<String>> list = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			char[] ch = input[i].toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if(map.containsKey(sorted)) {
				map.get(sorted).add(input[i]);
			}else {
				List<String> temp = new ArrayList<>();
				temp.add(input[i]);
				map.put(sorted, temp);
			}
		}
		
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			list.add(entry.getValue());
		}
		
		return list;
	}

}
