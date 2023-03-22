package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LLPalindrome {
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		
		
		System.out.println(checkPal(head));
	}

	private static boolean checkPal(Node head) {
		Node curr = head;
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		while(curr!=null) {
			list1.add(curr.data);
			curr = curr.next;
		}
		
		LLReverse rev = new LLReverse();
		Node newhead = rev.reverse(head);
		
		while(newhead!=null) {
			list2.add(newhead.data);
			newhead = newhead.next;
		}
		
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)!=list2.get(i)) {
				return false;
			}
		}
		
		return true;
	}

}
