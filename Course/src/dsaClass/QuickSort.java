package dsaClass;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {4,5,7,1,3,8};
		int low = 0;
		int high = arr.length-1;
		quickSort(arr,low,high);
		
		//display
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pidx = partition(arr, low, high);
			
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		i++;
		//swap 
		int temp1 = arr[i];
		arr[i] = pivot;
		arr[high] = temp1;
		return i;
	}
	
	
}
