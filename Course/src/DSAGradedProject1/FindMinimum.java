package DSAGradedProject1;

public class FindMinimum {
	
	public static void main(String[] args) {
		int[] arr = {6, 1, 2, 3, 4, 5};
		System.out.println(findMin(arr));
		}
		public static int findMin(int[] a) {
		//write your code here
			int min = a[0];
			
			for(int i=1;i<a.length;i++) {
				if(a[i]<min) {
					min = a[i];
				}
			}
			return min;
		}


}
