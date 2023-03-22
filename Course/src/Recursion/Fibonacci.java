package Recursion;

import java.util.Arrays;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n = 25;
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		int ans = fib(n, dp);
		System.out.println(ans);
	}

	private static int fib(int n, int[] dp) {
		if(n<2) {
			return n;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		
		dp[n] =  fib(n-1, dp)+fib(n-2, dp);
		
		return dp[n];
		
	}

}
