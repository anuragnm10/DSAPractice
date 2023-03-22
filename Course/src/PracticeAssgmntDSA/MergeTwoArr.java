package PracticeAssgmntDSA;

public class MergeTwoArr {
	
	public static void main(String[] args) {
		
		int[] arr1 = {0,0,0,1,2,3};
		int[] arr2 = {2,5,6};
		int len1 = arr1.length;
		int len = arr1.length+arr2.length;
		merge(arr1,arr2,len,len1);
		
		
		
	}

	private static void merge(int[] arr1, int[] arr2, int len, int len1) {
		int[] arr3 = new int[len];
		
		for(int n=0;n<len1;n++) {
			arr3[n] = arr1[n]; 
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[len1] = arr2[i];
			len1++;
		}
		
		for(int j=1;j<arr3.length;j++) {
			int index = j;
			int val = arr3[j];
			
			while(index>=1 && arr3[index-1]>val) {
				arr3[index] = arr3[index-1];
				index--;
			}
			
			arr3[index] = val;
		}
		
		for(int m=0;m<arr3.length;m++) {
			System.out.print(arr3[m]+" ");
		}
	}

}
