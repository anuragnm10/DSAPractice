package _27thDecQuestions;

import java.util.*;

public class FindRepeatativeAndMissingNumber {
	
	public static void main(String[] args) {
		
		int[] input = {1};
		
		System.out.println(find(input));
		
	}

	private static List<Integer> find(int[] input) {
		List<Integer> ans = new ArrayList<>();
		
		if(input.length==0 || input.length==1) {
			return ans;
		}
		Arrays.sort(input);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		}
		
		int maxVal = Collections.max(map.values());
		for(Map.Entry<Integer, Integer> key : map.entrySet()) {
			if(key.getValue() == maxVal) {
				ans.add(key.getKey());
				break;
			}
		}
		
		
		int originalSum = 0;
		int arraySum = 0;
		for(int i=1;i<=input.length;i++) {
			originalSum+=i;
		}
		
		for(int j=0;j<input.length;j++) {
			arraySum+=input[j];
		}
		
		if(originalSum>arraySum) {
			ans.add(ans.get(0) + (originalSum-arraySum));
		}else {
			ans.add(ans.get(0) - (arraySum - originalSum));
		}
		
		return ans;
		
		
	}

}
