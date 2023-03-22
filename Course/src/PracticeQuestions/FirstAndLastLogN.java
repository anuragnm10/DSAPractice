package PracticeQuestions;

public class FirstAndLastLogN {
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2};
		int target = 1;
		int first = findFirst(arr, target);
		int last = findLast(arr, target);
		System.out.println("First position :"+first);
		System.out.println("Last position :"+last);
	}
	static int findFirst(int[] arr, int target) {
		int idx = -1;
		int start = 0;
		int end = arr.length - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			if(arr[mid] >= target){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
			if(arr[mid] == target) idx = mid;
		}
		return idx;
	}
	
	static int findLast(int[] nums, int target){
		int idx = -1;
		int start = 0;
		int end = nums.length - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			if(nums[mid] <= target){
				start = mid + 1;
			}else{
				end = mid - 1;
			}
			if(nums[mid] == target) idx = mid;
		}
		return idx;
		
	
	}
}
