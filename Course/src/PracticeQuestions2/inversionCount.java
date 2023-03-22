package PracticeQuestions2;
import java.util.*; 

public class inversionCount {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(calInversionCount(arr));
		
	}

	private static int calInversionCount(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
		}
		return count;
	}
}
