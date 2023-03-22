package PracticeQuestionsTrees;

public class LeastCommonAncestor {
	
	public Node loc(Node root, int p, int q) {
		if(root == null) {
			return null;
		}
		
		if(p == root.data || q == root.data) {
			return root;
		}
		
		Node left = loc(root.left,p,q);
		Node right = loc(root.right,p,q);
		
		if(left == null) {
			return right;
		}
		
		if(right == null) {
			return left;
		}
		
		
		return root;
		
	}

}
