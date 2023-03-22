package PracticeAssgmntDSA;

public class MatrixSearch {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {10,11,16,20};
		int[] arr3 = {23,30,34,60};
		int target = 13;
		
		
		System.out.println(search(arr1,arr2,arr3,target));
	}

	private static boolean search(int[] arr1, int[] arr2, int[] arr3, int target) {
		if(target<arr1[arr1.length-1]) {
			for(int i=0;i<arr1.length;i++) {
				if(target == arr1[i])
					return true;
			}
		}else if(target<arr2[arr2.length-1]) {
			for(int j=0;j<arr2.length;j++) {
				if(target == arr2[j])
					return true;
			}
		}else if(target<arr3[arr3.length-1]){
			for(int m=0;m<arr3.length;m++) {
				if(target == arr3[m])
					return true;
			}
		}
		
		return false;
	}

}
