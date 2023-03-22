package GreedyApproach;

import java.util.*;

public class MaxMeetings {
	
	public static void main(String[] args) {
		int N = 5;
		int[] S = {1,4,12,15,7};
		int[] F = {13,6,14,19,13};
		
		
		System.out.println(findMaxIntervals(N, S, F));
	}

	private static List<Integer> findMaxIntervals(int N, int[] S, int[] F) {
		List<Integer> ans = new ArrayList<>();
		int[][] a = new int[N][3];
		
		for(int i=0;i<N;i++) {
			a[i][0] = i+1;
			a[i][1] = S[i];
			a[i][2] = F[i];
		}
		
		Arrays.sort(a, Comparator.comparingInt(o->o[2]));
		int r = a[0][2];
		ans.add(a[0][0]);
		for(int i=1;i<a.length;i++) {
			if(a[i][1]>r) {
				ans.add(a[i][0]);
				r = a[i][2];
			}
		}
		
		Collections.sort(ans);
		return ans;
		
		
	}

}
