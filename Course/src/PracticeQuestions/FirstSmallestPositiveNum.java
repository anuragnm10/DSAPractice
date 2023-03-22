package PracticeQuestions;

import java.util.Arrays;

public class FirstSmallestPositiveNum {
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(find(nums));
		
		
	}

	private static int find(int[] nums) {
		if(nums.length<1 || nums.length==1) {
			if(nums[0]<1)
				return 1;
			return 1;
		}else {
			Arrays.sort(nums);
			boolean flag = false;
			
			if(nums[0]<=1) {
				for(int i=0;i<nums.length;i++) {
					if(nums[0]==1) {
						if(nums[i]==i+1)
							continue;
						else {
							return i+1;
						}
					}
					if(nums[i]>=1 && nums[i]!=i) {
						
						flag = true;
						return i;
					}
				}
				if(!flag)
					return nums[nums.length-1]+1;
			}
		}
		return 1;
	}

}
