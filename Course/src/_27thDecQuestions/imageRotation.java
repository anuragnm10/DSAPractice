package _27thDecQuestions;

public class imageRotation {
	
	public static void main(String[] args) {
		
		int[][] image = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		
		int[][] ans = rotate(image);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans.length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
		}

	private static int[][] rotate(int[][] image) {
		
		int n = image.length;
		
		for(int i=0;i<(n+1)/2;i++) {
			for(int j=0;j<n/2;j++) {
				int temp = image[n-1-j][i];
				image[n-1-j][i] = image[n-1-i][n-1-j];
				image[n-1-i][n-1-j] = image[j][n-1-i];
				image[j][n-1-i] = image[i][j];
				image[i][j] = temp;
			}
		}
		
		return image;
		
	}
	

}
