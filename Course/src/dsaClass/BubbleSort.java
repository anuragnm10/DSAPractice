package dsaClass;

public class BubbleSort {
	
	private static int[] sort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		if(size>1) {
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[j-1]>arr[j]) {
						temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
				
				size--;
			}
			
			
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,4,5,6,3,8,7};
		 
		sort(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}

	
}
