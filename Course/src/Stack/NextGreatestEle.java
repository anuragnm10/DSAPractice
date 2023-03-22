package Stack;

import java.util.Stack;

public class NextGreatestEle {

	public static void main(String[] args) {
		
		int[] arr = {4,3,5,2,25,10};
		
		int[] arr1 = findNextGreatest(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}

	private static int[] findNextGreatest(int[] arr) {
		Stack<Integer> stk = new Stack<>();
		int n = arr.length;
		int[] result = new int[arr.length];
		for(int i=n-1;i>=0;i--) {
			while(!stk.isEmpty() && stk.peek()<=arr[i]) {
				stk.pop();
			}
			
			if(stk.isEmpty()) {
				result[i] = -1;
			}else {
				result[i] = stk.peek();
			}
			
			stk.push(arr[i]);
			
		}
		
		return result;
		
	}
}
