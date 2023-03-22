package DynamicPrograming;

public class ZeroOneKnapsack {
	public static void main(String[] args) {
		int profit[] = {1,2,5,6};
		int weights[] = {2,3,4,5};
		int maxWeight = 8;
		int numOfItems = 4;
		System.out.println(knapsackRecursive(weights, profit, maxWeight, numOfItems));
	}
	
	static int knapsackRecursive(int wt[], int pt[], int mw, int n) {
		if(mw==0||n==0) {
			return 0;
		}
		
		if(wt[n-1]<=mw) {
			int reducedmw = mw - wt[n-1];
			int profit = pt[n-1] + knapsackRecursive(wt, pt, reducedmw, n-1);
			return Math.max(profit, knapsackRecursive(wt, pt, mw, n-1));
		}else {
			return knapsackRecursive(wt, pt, mw, n-1);
		}
	}
}
