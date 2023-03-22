package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LLIntersection {
	
	public static void main(String[] args) {
		
		Node head1 = new Node(4);
		head1.next = new Node(1);
		head1.next.next = new Node(8);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		
		Node head2 = new Node(5);
		head2.next = new Node(6);
		head2.next.next = new Node(1);
		head2.next.next.next = head1.next.next;
		
		
		findIntersection(head1, head2);
	}

	private static void findIntersection(Node head1, Node head2) {
		
		int len1 = 0;
		int len2 = 0;
		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1!=null) {
			len1++;
			curr1 = curr1.next;
		}
		
		while(curr2!=null) {
			len2++;
			curr2 = curr2.next;
		}
		
		if(len1>len2) {
			for(int i=0;i<len1-len2;i++) {
				head1 = head1.next;
			}
		}else {
			for(int j=0;j<len2-len1;j++) {
				head2 = head2.next;
			}
		}
		
		while(head1!=null || head2!=null) {
			if(head1 == head2) {
				System.out.println("Intersection at : "+head1.data);
				break;
			}
			
			head1 = head1.next;
			head2 = head2.next;
		}
		if(head1==null || head2==null) {
			System.out.println("No intersection");
		}
		
	}
	

}
