package PracticeQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstSmallesrPosNum {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		System.out.println(findMissing(arr));
	}

	private static int findMissing(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int i:arr) {
			if(i>0) {
				set.add(i);
			}
		}
		int idx = 1;
		while(true) {
			if(!set.contains(idx))return idx;
			idx++;
		}
	}

}
