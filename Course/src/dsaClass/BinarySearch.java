package dsaClass;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int start = 0;
		int end = arr.length-1;
		
		int target = 3;
		
		System.out.println(search(arr, start, end, target));
		
	}

	private static int search(int[] arr, int start, int end, int target) {
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target == arr[mid]) {
				return arr[mid];
			}else {
				if(target>arr[mid]) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		return -1;
	}

}
