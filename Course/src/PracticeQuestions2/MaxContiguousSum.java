package PracticeQuestions2;

public class MaxContiguousSum {
	
	public static void main(String[] args) {
		int arr[] = {10,5,2,7,1,9};
		int target = 15;
		
		findLength(arr, target);
	}

	private static void findLength(int[] arr, int target) {
		int maxCount=0;
		int currSum=0;
		
		for(int i=0;i<arr.length;i++) {
			currSum += arr[i];
			maxCount++;
			if(currSum==target) {
				currSum = 0;
				i++;
				
			}
			
			
		}
		
	}
	

}
