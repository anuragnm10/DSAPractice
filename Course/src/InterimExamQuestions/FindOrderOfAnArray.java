package InterimExamQuestions;
import java.util.*;

public class FindOrderOfAnArray {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3,1};
		
		System.out.println(findOrder(nums));
		
	}

	private static int findOrder(int[] nums) {
		
		Map<Integer, Integer> start = new HashMap<>(), end = new HashMap<>(), count = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int val = nums[i];
			if(start.get(val) == null) {
				start.put(val, i);
			}
			
			end.put(val, i);
			count.put(val, count.getOrDefault(val, 0)+1);
		}
		
		int ans = nums.length;
		int order = Collections.max(count.values());
		for(int x:count.keySet()) {
			if(count.get(x) == order) {
				ans = Math.min(ans, end.get(x)-start.get(x)+1);
			}
		}
		
		return ans;
	}

}
