package LinkedList;

public class RemoveValue {
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head.next.next = new Node(3);
		
		Node newhead = removeEle(head, 1);	
		
		TraversalLL t4 = new TraversalLL();
		t4.traversal(newhead);
		
	}

	private static Node removeEle(Node head, int val) {
		Node ans = new Node();
		Node temp = ans;
		Node curr = head;
		
		
		while(curr!=null){
			if(curr.data!=val) {
				temp.next = new Node(curr.data);
				temp = temp.next;
			}
			
			curr = curr.next;
		
		}
		
		return ans.next;
		
	}

}
