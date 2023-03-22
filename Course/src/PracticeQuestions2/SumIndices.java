package PracticeQuestions2;

public class SumIndices {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,7};
		int target = 7;
		
		System.out.println(indices(arr, target));
		
	}

	private static int[] indices(int[] arr, int target) {
		int[] ans = new int[2];
		 int i=0;
		 int j=0;
		 int sum=0;
		 
		 while(j<=arr.length-1) {
			 sum = arr[i] + arr[j];
			 if(sum==target) {
				 ans[0] = i;
				 ans[1] = j;
				 return ans;
			 }
		 }
		 
		 return ans;
		
	}
	
	

}
