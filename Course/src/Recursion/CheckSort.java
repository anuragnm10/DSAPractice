package Recursion;

public class CheckSort {
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,6};
		int idx = 0;
		System.out.println(check(arr, idx));
		
	}
	
	
	private static boolean check(int[] arr, int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		
		return arr[idx]<=arr[idx+1] && check(arr, idx+1);
		
	}

}
