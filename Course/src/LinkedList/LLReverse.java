package LinkedList;

public class LLReverse {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		Node newhead = reverse(head);	
		
		TraversalLL t3 = new TraversalLL();
		t3.traversal(newhead);
	}

	public static Node reverse(Node head) {
		Node prev = head;
		Node curr = head.next;
		
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		
		head.next = null;
		head = prev;
		return head;
	}

}
