package LinkedList;

public class TraversalLL {
	
	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		
		traversal(head);
	}

	public static void traversal(Node head) {
		Node curr = head;
		
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		
	}
	
	
	
}
