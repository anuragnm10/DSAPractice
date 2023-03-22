package PracticeQuestions;

public class RotatedArraySearch {
	
	public static void main(String[] args) {
		int left = 0;
		int[] arr = {3,4,5,6,7,0,1,2};
		int right = arr.length-1;
		int target = 4;
		findNum(arr, target);
		findPivot(left, right, arr);
		
	}

	private static int findPivot(int left, int right, int[] arr) {
		
		if(arr[left]<arr[right]) {
			return 1;
		}
		
		while(left<=right) {
			int pivot = (left + right) / 2;

            if (arr[pivot] > arr[pivot + 1]) {
                return pivot + 1;
            } else {
                if (arr[pivot] < arr[left]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return 0;
		
		
	}

	private static void findNum(int[] arr, int target) {
		
		
		
	}
	
	

}
