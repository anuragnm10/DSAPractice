package dsaClass;

public class KadanesAlgo {
	
	private static int findsum(int[] arr) {
		int local = 0;
		int global = 0;
		
		for(int i=0;i<arr.length;i++) {
			local += arr[i];
			
			if(local > global) {
				global = local;
			}
			
			if(local < 0) {
				local = 0;
			}
		}
		return global;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,-2,-1,3,4};
		
		System.out.println(findsum(arr));
	}


}
