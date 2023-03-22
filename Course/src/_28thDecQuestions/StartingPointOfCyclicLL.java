package _28thDecQuestions;
import java.util.*;
public class StartingPointOfCyclicLL {
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next;
		
		int ans = findStart(head);
		if(ans == -1) {
			System.out.println("No cycle");
		}else {
			System.out.println("tail connects to node index : "+ans);
		}
	}

	private static int findStart(Node head) {
		Node curr = head;
		
		if(curr==null) {
			return -1;
		}
		Map<Integer, Node> map = new HashMap<>();
		int idx = 0;
		while(!map.containsValue(curr)) {
			if(curr.next == null) {
				return -1;
			}
			map.put(idx++, curr);
			curr = curr.next;
		}
		
		for(Map.Entry<Integer, Node> set : map.entrySet()) {
			if(set.getValue() == curr) {
				return set.getKey();
			}
		}
		
		return -1;
		
	} 

}
