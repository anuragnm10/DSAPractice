package PracticeQuestionsTrees;

public class CountNodes {
	
	public int countNodes(Node root){
		if(root==null) {
			return 0;
		}
		
		int countleft = countNodes(root.left);
		int countright = countNodes(root.right);
		
		return countleft+countright+1;
	}

}
