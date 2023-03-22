package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(5);
		
		Node head2 = new Node(3);
		head2.next = new Node(4);
		head2.next.next = new Node(6);
		head2.next.next.next=new Node(8);
		
		//Node headAns = mergeTwoLists(head1, head2);
		Node headAns = mergeTwoListsRecursive(head1, head2);
		while(headAns!=null) {
			System.out.print(headAns.data+"-->");
			headAns = headAns.next;
		}
		System.out.println("Null");
		
		
	}

	private static Node mergeTwoListsRecursive(Node head1, Node head2) {
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		
		if(head1.data<head2.data) {
			head1.next = mergeTwoListsRecursive(head1.next,head2);
			return head1;
		}else {
			head2.next = mergeTwoListsRecursive(head1, head2.next);
			return head2;
		}
	}

//	private static Node mergeTwoLists(Node head1, Node head2) {
//		List<Integer> list = new ArrayList<>();
//		
//		if(head1==null) {
//			return head2;
//		}else if(head2 == null) {
//			return head1;
//		}
//		Node head = head1;
//		Node curr = head1;
//		while(curr.next!=null) {
//			curr = curr.next;
//		}
//		curr.next = head2;
//		
//		//pushing all the elements to arraylist
//		Node currele = head;
//		while(currele!=null) {
//			list.add(currele.data);
//			currele = currele.next;
//		}
//		
//		
//		//Sorting arraylist;
//		Collections.sort(list);
//		
//		//pushing all the elements back to LinkedList
//		Node sort = head;
//		for(int i:list) {
//			sort.data = i;
//			sort = sort.next;
//		}
//		
//		return head;
//		
//	}

}
