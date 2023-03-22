package _21stDecQuestions;

public class MergeTwoSortedLL {
	
	public static void main(String[] args) {
		
		Node head1 = new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(4);
		
		Node head2 = new Node(3);
		head2.next = new Node(5);
		head2.next.next = new Node(7);
		
		Node ans = merge(head1, head2);
		while(ans!=null) {
			System.out.print(ans.data+"-->");
			ans = ans.next;
		}
		
		System.out.print("null");
	}

	private static Node merge(Node head1, Node head2) {
		
		if(head1 == null) {
			return head2;
		}
		
		if(head2 == null) {
			return head1;
		}
		
		if(head1.data<head2.data) {
			head1.next = merge(head1.next, head2);
			return head1;
		}else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
		
	}

}


