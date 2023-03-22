package LinkedList;

public class InsertData {
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		
		insert(head, 3, 25);
		
		TraversalLL t1 = new TraversalLL();
		t1.traversal(head);
		
	}

	private static void insert(Node head, int pos, int dataToAdd) {
		Node curr = head;
		Node prev = head;
		Node toadd = new Node(dataToAdd);
		if(pos==0) {
			toadd.next = head;
			head = toadd;
		}else {
			for(int i=0;i<pos-1;i++) {
				prev = prev.next;
			}
			toadd.next = prev.next;
			prev.next = toadd;
			
		}
	}

}
