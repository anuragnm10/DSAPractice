package PracticeQuestions;

public class arrayFromPermutation {
	public static void main(String[] args) {
		int[] arr = {0,2,1,5,3,4};
		findPermutation(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	private static int[] findPermutation(int[] arr) {
		
		int l= arr.length;
		for(int i=0; i<l; i++){
			int num = (arr[arr[i]] % l);
			arr[i] = arr[i] + l*num;
		}
		for(int i=0; i<l; i++){
			arr[i] = arr[i]/l;
		}
		return arr;
	}


}
