package DynamicPrograming;

import java.util.Arrays;

public class MaxNonAdjacentSum {
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,3,2,9};
		
		int[] dp = new int[arr.length];
		
		Arrays.fill(dp, -1);
		
		System.out.println("maximum sum : "+maxSum(arr.length-1, arr, dp));
		
	}

	private static int maxSum(int index, int[] arr, int[] dp) {
		
		if(index<0) {
			return 0;
		}
		
		if(index == 0) {
			return arr[index];
		}
		
		if(dp[index] != -1) {
			return dp[index];
		}
		
		int pick = arr[index] + maxSum(index-2, arr, dp);
		int nonPick = arr[index] + maxSum(index-1, arr, dp);
		
		return dp[index] = Math.max(pick, nonPick);
		
	}

}
