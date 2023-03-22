package LinkedList;


public class LL {
	
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node {
		
		int data;
		Node next;

		
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
		
	}
	
	public static void main(String[] args) {
		
		LL list = new LL();
		
		list.addFirst(1);
		list.printList();
		list.addMiddle(5,0);
		list.printList();
		System.out.println(list.getSize());
	}

	private int getSize() {
		return size;
		
	}

	private void addMiddle(int i, int j) {
		
		if(j>size ||  j<0) {
			System.out.println("Invalid Index");
			return;
		}
		Node node = new Node(i);
		
		if(head==null || j==0) {
			node.next = head;
			head = node;
			return;
		}
		
		Node currNode = head.next;
		Node preNode = head;
		int idx = 1;
		while(idx!=j) {
			currNode = currNode.next;
			preNode = preNode.next;
			idx++;
		}
		
		node.next = currNode;
		preNode.next = node;
	}

	private void printList() {
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+"-->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

	private void removeLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head  = null;
			return;
		}
		Node curr = head;
		Node last = head.next;
		
		while(last.next!=null) {
			last = last.next;
			curr = curr.next;
		}
		
		curr.next = null;
		
	}

	private void removeFirst() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		head = head.next;
		size--;
	}

	private void addLast(int i) {
		Node node = new Node(i);
		if(head == null) {
			head = node;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		
		curr.next = node;
		
	}

	private void addFirst(int i) {
		Node node = new Node(i);
		
		node.next = head;
		head = node;
		
	}
	
	
}

