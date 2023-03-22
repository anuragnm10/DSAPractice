package _22ndDecQuestions;
import java.util.*;

public class NextGreatestElement {
	public static void main(String[] args) {
		int[] arr = {1,2,12,2,3,10,6,7};
		
		int[] ans = findNextGreatest(arr);
		for(int j=0;j<ans.length;j++) {
			System.out.print(ans[j]+" ");
		}
		
	}

	private static int[] findNextGreatest(int[] arr) {
		int n = arr.length;
		int[] res = new int[n];
		
		Stack<Integer> st = new Stack<>();
		for(int i=2*n-1;i>0;i--) {
			while(!st.isEmpty() && arr[i%n]>=st.peek()) {
				st.pop();
			}
			
			if(!st.isEmpty()) {
				res[i%n]=st.peek();
			}else {
				res[i%n]=-1;
			}
			
			st.push(arr[i%n]);
		}
		
		
		return res;
		
	}
}
