package PracticeAssgmntDSA;

public class LongestSubArray {
	
	public static void main(String[] args) {
		
		int[] arr = {5,6,3,5,7,8,9,1,2};
		
		System.out.println(calSub(arr));
		
	}

	private static int calSub(int[] arr) {
		
		int count = 1;
		int temp = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr.length>1) {
				if(arr[i-1]<arr[i]) {
					temp++;
				}else {
					if(count<temp) {
						count = temp;
					}
					temp = 1;
				}
			}
		}
		
		return count;
		
	}

}
