package PracticeQuestionsTrees;

public class SumOfNodes {
	
	public int sumOfnodes(Node root) {
		if(root==null) {
			return 0;
		}
		
		int leftsum = sumOfnodes(root.left);
		int rightsum = sumOfnodes(root.right);
		
		return leftsum+rightsum+root.data;
	}

}
