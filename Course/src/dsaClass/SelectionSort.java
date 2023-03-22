package dsaClass;

public class SelectionSort {
	
	private static void selSort(int[] arr) {
		
		int size = arr.length;
		
		if(size>1) {
			for(int i=0;i<size;i++) {
				int index = i;
				for(int j=i+1;j<size;j++) {
					if(arr[j]<arr[index]){
						index = j;
					}
				}
				
				int smallest = arr[index];
				arr[index] = arr[i];
				arr[i] = smallest;
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,4,3,5,8,6,7};
		
		selSort(arr);
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}

	

}
