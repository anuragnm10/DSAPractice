package PracticeQuestions2;
import java.util.*;
public class LLOddEven {

	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(6);
		head.next.next.next.next.next = new Node(4);
		head.next.next.next.next.next.next = new Node(7);
		
		reorder(head);
		display(head);
	}
	
	private static void display(Node head) {

		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
		
		
	}

	private static Node reorder(Node head) {
		if(head == null)return null;
		Node odd = head;
		Node even = head.next;
		Node evenHead = head.next;
		while(even!=null && even.next!=null) {
			odd.next = even.next;
			odd = odd.next;
			
			even.next = odd.next;
			even = even.next;
			
		}
		odd.next = evenHead;
		
		return head;
	}

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	
	

}
