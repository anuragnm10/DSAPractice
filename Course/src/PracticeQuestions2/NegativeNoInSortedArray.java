package PracticeQuestions2;

public class NegativeNoInSortedArray {
	public static void main(String[] args) {
		int[] arr = {-1,-2,-3,-4,-5,-6,3, 4, 6};
		System.out.println(findNegative(arr));
		
	}

	private static int findNegative(int[] arr) {
		int count = 0;
		if(arr[0]>0) {
			return count;
		}else {
			int low = 0;
			int high = arr.length-1;
			count = findCount(low, high, arr);	
		}
		return count;
	}
	
	private static int findCount(int low, int high, int[] arr) {
		int mid = (low+high)/2; 
		if(arr[mid]<0 && arr[mid+1]>=0) {
			return mid+1;
		}else if(arr[mid]>0 && arr[mid+1]>0) {
			return findCount(low,mid,arr);
		}else {
			return findCount(mid+1,high,arr);
		}
		
	}
}
