package dsaClass;

public class InsertionSort {
	
	private static void insertSort(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			int val = arr[i];
			int index = i;
			
			while(index>=1 && arr[index-1]>val) {
				arr[index] = arr[index-1];
				index--;
			}
			
			arr[index] = val;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,3,5,1};
		
		insertSort(arr);
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
		
	}

	

}
