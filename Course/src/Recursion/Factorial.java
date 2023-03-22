package Recursion;

import java.util.Arrays;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n = 25;
		
		long[] dp = new long[n+1];
		Arrays.fill(dp, -1);
		long ans = fact(n, dp);
		System.out.println(ans);
		
	}

	private static long fact(int n, long[] dp) {
		if(n==1) {
			return n;
		}
		if(dp[n] != -1) {
			return dp[n];
		} 
		dp[n] =  n*fact(n-1, dp);
		
		return dp[n];
	}

}
