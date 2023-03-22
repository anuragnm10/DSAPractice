package DSAGradedProject1;

import java.util.*;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}

public class ReorderList {
	static Node head;
	public void reorderList() {
		if(head==null || head.next==null) {
			return;
		}
		Node head1 = head;
		Node head2 = head;
		while(head2.next!=null && head2.next.next!=null){
			head1 = head1.next;
			head2 = head2.next.next;
		}
		
		Node mid = head1;
		Node curr = head1.next;
		while(curr.next!=null){
			Node temp = curr.next;
			curr.next = temp.next;
			temp.next = mid.next;
			mid.next = temp;
		}
		
		head1 = head;
		head2 = mid.next;
		while(head1!=mid) {
			mid.next = head2.next;
			head2.next = head1.next;
			head1.next = head2;
			head1 = head2.next;
			head2 = mid.next;
		}
		
		
		
	}
	void insert(int value) {
		Node newNode = new Node(value);
		if (head == null) {
		head = newNode;
		return;
		}
		newNode.next = null;
		Node tmp = head;
		while (tmp.next != null)
			tmp = tmp.next;
			tmp.next = newNode;
			return;
	}
	void display() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ReorderList ob = new ReorderList();
		int numberOfNodes = in .nextInt();
		while (numberOfNodes--> 0)
			ob.insert( in .nextInt());
		ob.reorderList();
		ob.display();
	}
}
