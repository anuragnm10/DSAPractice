package InterQuestions;
import java.util.*;

public class question1 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},
						{2,3,1},
						{3,1,2}};

		
		if(validateRow(arr) && validateCol(arr)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

	private static boolean validateCol(int[][] arr) {
		if(arr.length == 0) {
			return false;
		}
		
		
		Set<Integer> set = new HashSet<>();
		int m = 1;
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			set.clear();
			for(int j=0;j<arr.length;j++) {
				if(!(arr[j][i] >= m && arr[j][i] <= n)) {
					return false;
				}
				set.add(arr[j][i]);
			}
			if(set.size() != n) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean validateRow(int[][] arr) {
		int m = 1;
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.clear();
			for(int j=0;j<arr.length;j++) {
				if(!(arr[i][j] >=m && arr[i][j]<=n)) {
					return false;
				}
				set.add(arr[i][j]);
			}
			if(set.size() != n) {
				return false;
			}
		}
		
		
		return true;
	}

}
