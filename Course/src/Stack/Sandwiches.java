package Stack;

import java.util.Queue;
import java.util.Stack;



public class Sandwiches {
	
	public static int countStudent(int[] student, int[] sandwiches) {
		
		int ones = 0;
		int zeroes = 0;
		
		for(int stud : student) {
			if(stud == 0) {
				zeroes++;
			}else {
				ones++;
			}
		}
		
		for(int sand : sandwiches) {
			if(sand == 0) {
				if(zeroes == 0) {
					return ones;
				}else {
					zeroes--;
				}
			}else if(sand == 1) {
				if(ones==0) {
					return zeroes;
				}else {
					ones--;
				}
			}
		}
		
		return 0;
		
		
	}
	
	
	public static void main(String[] args) {
		int[] std = {1,1,1,0,0,1};
		int[] sand = {1,0,0,0,1,1};
		
		System.out.println(countStudent(std, sand));
	}

	
}


