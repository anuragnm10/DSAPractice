package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		
		String[] strs = {"rat","car","tar"};
		List<List<String>> res = find(strs);
		
		System.out.println(Arrays.deepToString(res.toArray()));
		
	}
	
	
	private static List<List<String>> find(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		for(String s:strs) {
			char[] charArr = s.toCharArray();
			Arrays.sort(charArr);
			String sorted = new String(charArr);
			if(map.get(sorted)!=null) {
				map.get(sorted).add(s);
			}else {
				ArrayList<String> newArraylist = new ArrayList<>();
				newArraylist.add(s);
				map.put(sorted, newArraylist);
			}
		}
		
		for(String s1:map.keySet()) {
			result.add(map.get(s1));
		}
		
		return result;
	}

}
