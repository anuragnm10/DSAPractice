package DSAGraded;

public class minNumberInRotatedArr {
	
	public static void main(String[] args) {
		
		int[] arr = {4,5,6,2,3};
		
		System.out.println(findmin(arr));
	}

	private static int findmin(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

}
