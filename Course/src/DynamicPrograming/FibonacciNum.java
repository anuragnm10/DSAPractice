package DynamicPrograming;

import java.util.Arrays;

public class FibonacciNum {
	public static void main(String[] args) {
		int n = 18;
		
		long dp[] = new long[n+1];
		Arrays.fill(dp, -1);
		System.out.println(fib(n, dp));
		
		System.out.println(fibTabulation(5));
	}
	

	private static long fib(int n, long[] dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		
		dp[n] =  fib(n-1, dp)+fib(n-2, dp);
		return dp[n];
	}
	
	private static int fibTabulation(int n) {
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

}
