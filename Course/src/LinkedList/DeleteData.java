package LinkedList;

public class DeleteData {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		delete(head, 2);
		
		TraversalLL t2 = new TraversalLL();
		t2.traversal(head);
	}

	private static void delete(Node head, int pos) {
		
		Node prev = head;
		
		if(pos==0){
			head = head.next;
			return;
		}else {
			
			for(int i=0;i<pos-1;i++) {
				prev = prev.next;
			}
			
			prev.next = prev.next.next;
			
		}
		
	}

}
