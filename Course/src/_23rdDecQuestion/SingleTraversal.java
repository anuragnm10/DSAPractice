package _23rdDecQuestion;
import java.util.*;

public class SingleTraversal {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		List<Integer> preOrder = new ArrayList<>();
		List<Integer> inOrder = new ArrayList<>();
		List<Integer> postOrder = new ArrayList<>();
		
		allTraversal(root, preOrder, inOrder, postOrder);
	}

	private static void allTraversal(Node root, List<Integer> preOrder, List<Integer> inOrder,
			List<Integer> postOrder) {
		
		Stack<Pair> st = new Stack<>();
		st.push(new Pair(root, 1));
		
		while(!st.isEmpty()) {
			Pair p = st.pop();
			
			if(p.num == 1) {
				preOrder.add(p.node.data);
				p.num++;
				st.push(p);
				
				if(p.node.left!=null) {
					st.push(new Pair(p.node.left, 1));
				}
			}else if(p.num == 2) {
				inOrder.add(p.node.data);
				p.num++;
				st.push(p);
				
				if(p.node.right!=null) {
					st.push(new Pair(p.node.right, 1));
				}
			}else {
				postOrder.add(p.node.data);
			}
		}
		
		System.out.println("PreOrder : "+preOrder);
		System.out.println("InOrder : "+inOrder);
		System.out.println("PostOrder : "+postOrder);
	}

}
