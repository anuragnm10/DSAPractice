package dsaClass;

public class SumCloseToX {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 4, 7, 10};
		
		int x = 15;
		
		int result = findSum(arr1, x);
		
		System.out.println(result);
		
	}

	private static int findSum(int[] arr, int x) {
		int val = 0;
		int val1 = 0;
		int val2 = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]<=x) {
					if(val<arr[i]+arr[j]) {
						val1 = arr[i];
						val2 = arr[j];
						val = arr[i]+arr[j];
					}
				}
				
			}
		}
		System.out.println(val1+" "+val2);
		
		return val;
	}

}
