package _1stJanQuestion;
import java.util.*;

public class BoundaryTraversal {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.left = new Node(3);
		root.right.right = new Node(8);
		root.left.left.right = new Node(4);
		root.right.right.left = new Node(9);
		root.left.left.right.left = new Node(5);
		root.left.left.right.right = new Node(6);
		root.right.right.left.left = new Node(10);
		root.right.right.left.right = new Node(11);
		
		System.out.println(boundary(root));
	}
	
	public static boolean isLeaf(Node root) {
		Node curr = root;
		if(curr.left == null && curr.right == null) {
			return true;
		}else {
			return false;
		}
	}

	private static List<Integer> boundary(Node root) {
		
		List<Integer> ans = new ArrayList<>();
		if(isLeaf(root) == false) ans.add(root.data);
		addleft(root, ans);
		addleaves(root, ans);
		addright(root, ans);
		return ans;
		
	}
	
	private static void addright(Node root, List<Integer> ans) {
		Node cur = root.right;
		Stack<Integer> st = new Stack<>();
		
		while(cur!=null) {
			if(isLeaf(cur) == false) st.push(cur.data);
			if(cur.right != null) cur = cur.right;
			else cur = cur.left;
		}
		
		while(!st.isEmpty()) {
			ans.add(st.pop());
		}
		
	}

	private static void addleaves(Node root, List<Integer> ans) {
		if(isLeaf(root)) {
			ans.add(root.data);
			return;
		}
		
		if(root.left!=null) addleaves(root.left, ans);
		if(root.right!=null) addleaves(root.right, ans);
		
	}

	private static void addleft(Node root, List<Integer> ans) {
		Node cur = root.left;
		while(cur != null) {
			if(isLeaf(cur) == false) ans.add(cur.data);
			if(cur.left!=null) cur=cur.left;
			else cur = cur.right;
		}
	}

}
