package dsaClass;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,2,8,5,7};
		int left = 0;
		int right = arr.length-1;
		mergeSort(arr, left, right);
		display(arr);
	}

	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if(left>=right) {
			return;
		}
		int mid = left+(right-left)/2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr,left,mid,right);
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right-left+1];
		int i = left;
		int j = mid+1;
		int k = 0;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temp[k]=arr[i];
				i++;
				k++;
			}else {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		if(i>mid) {
			while(j<=right) {
				temp[k]=arr[j];
				j++;k++;
			}
		}else {
			while(i<=mid) {
				temp[k]=arr[i];
				i++;k++;
			}
		}
		
		for(int m=0,n=left;m<temp.length;m++,n++) {
			arr[n] = temp[m];
		}
		
	}

}
