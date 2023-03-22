package LinkedList;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		
		Node head1 = new Node(9);
		
		
		Node head2 = new Node(1);
		head2.next = new Node(9);
		head2.next.next = new Node(9);
		head2.next.next.next = new Node(9);
		head2.next.next.next.next = new Node(9);
		head2.next.next.next.next.next = new Node(9);
		head2.next.next.next.next.next.next = new Node(9);
		head2.next.next.next.next.next.next.next = new Node(9);
		head2.next.next.next.next.next.next.next.next = new Node(9);
		head2.next.next.next.next.next.next.next.next.next = new Node(9);
		
		
		Node output = addTwo(head1, head2);
		TraversalLL t = new TraversalLL();
		t.traversal(output);
		
	}

	private static Node addTwo(Node head1, Node head2) {
		
		Node curr1 = head1;
		Node curr2 = head2;
		long num1 = 0;
		long num2 = 0;
		
		while(curr1!=null) {
			num1 = (num1*10)+curr1.data;
			curr1 = curr1.next;
		}
		
		while(curr2!=null) {
			num2 = (num2*10)+curr2.data;
			curr2 = curr2.next;
		}
		
		long revNum1 = reverse(num1);
		long revNum2 = reverse(num2);
		long total = revNum1 + revNum2;
		
		
		Node ans = new Node();
		Node temp = ans;
		
		while(total!=0) {
			temp.next = new Node(total%10);
			temp = temp.next;
			total = total/10;
		}
		
		return ans.next;
	}
	
	public static long reverse(int num) {
		long reverseTotal = 0;
		while(num!=0) {
			reverseTotal = (reverseTotal*10) + (num%10);
			num = num/10;
		}
		
		return reverseTotal;
	}
	
}
