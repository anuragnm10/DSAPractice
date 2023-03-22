package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListAddition {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		ll1.add(2);
		ll1.add(9);
		ll1.add(3);
		
		ll2.add(7);
		ll2.add(5);
		ll2.add(5);
		
		findsum(ll1,ll2);
	}

	private static void findsum(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
		
		int valuell1 = convertllnum(ll1);
		int valuell2 = convertllnum(ll2);
		LinkedList<Integer> SumResult = new LinkedList<>();
		Stack<Integer> stk = new Stack<>();
		int result = valuell1+valuell2;
		
		while(result!=0) {
			stk.push(result%10);
			result = result/10;
		}
		
		while(!stk.isEmpty()) {
			SumResult.add(stk.peek());
			stk.pop();
		}
		
		for(int i=0;i<SumResult.size();i++) {
			System.out.print(SumResult.get(i));
		}
		
	}

	private static int convertllnum(LinkedList<Integer> ll1) {
		int val = 0;
		if(ll1.isEmpty())
			return 0;
		else {
			for(int i=0;i<ll1.size();i++) {
				if(val==0) {
					val = ll1.get(i);
				}else {
					val = (val*10)+ll1.get(i);
				}
			}
		}
		return val;
	}

}
