package PracticeAssgmntDSA;

public class search {
	public static void main() {
		
		int[] arr = {1,3,4,6,2,8,9};
		int target = 2;
		
		find(arr, target);
	}

	private static boolean find(int[] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
		
	}
}
