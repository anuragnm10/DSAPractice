package InterviewQues;

public class TwoDArraySearch {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		int target = 10;
		
		System.out.println(findEle(arr, target));
		System.out.println(findEleBinarySearch(arr, target));
		
	}

	private static boolean findEle(int[][] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==target) {
					return true;
				}	
			}
		}
		return false;
		
	}
	
	public static boolean findEleBinarySearch(int[][] arr, int target) {
		int row = 0;
		int col = arr[row].length-1;
		
		while(row < arr.length && col>=0) {
			if(arr[row][col]==target) {
				return true;
			}else if(target>arr[row][col]) {
				row++;
			}else {
				col--;
			}
		}
		
		return false;
	}
	
}
