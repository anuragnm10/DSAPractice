package dsaClass;

public class SpiralMatrix {
	
	private static void spiralMat(int[] arr, int m, int n) {
		// TODO Auto-generated method stub
		int top = 0; int bottom = m-1;
		int left = 0; int right = n-1;
		
		int[][] mat = new int[m][n];
		
		int index = 1;
		
		while(true) {
			if(left > right) {
				break;
			}
			
			for(int i = left;i<=right;i++) {
				mat[top][arr[left]] = arr[index];
				index++;
			}
			top++;
			
			if(top>bottom) {
				break;
			}
			
			for(int j=top;j<=bottom;j++) {
				mat[arr[top]][right] = arr[index];
				index++;
			}
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5,6,7,8,9};
		int m = 3;
		int n = 3;
		
		spiralMat(input, m, n);
		
	}

	
}
