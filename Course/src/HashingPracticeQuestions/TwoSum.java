package HashingPracticeQuestions;
import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		
		int[] input = {2,5,3,6,8,1};
		int target = 14;
		
		findIndices(input, target);
	}

	private static int[] findIndices(int[] input, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			map.put(input[i], i);
		}
		
		for(int j=0;j<input.length;j++) {
			int compliment = target - input[j];
			if(map.containsKey(compliment)&&map.get(compliment)!=j) {
				return new int[] {j, map.get(compliment)};
			}
		}
		
		return null;
	}
}
