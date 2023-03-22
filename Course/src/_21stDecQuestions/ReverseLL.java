package _21stDecQuestions;

public class ReverseLL {
	
	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(7);
		
		Node ans = reverse(head);
		while(ans!=null) {
			System.out.print(ans.data+"-->");
			ans = ans.next;
		}
		
		System.out.print("null");
	}

	private static Node reverse(Node head) {
		Node prev = head;
		Node curr = head;
		Node temp = null;
		while(curr.next!=null) {
			curr = curr.next;
			prev.next = temp;
			temp = prev;
			prev = curr;
		}
		
		curr.next = temp;
		
		return curr;
	}
	

}
