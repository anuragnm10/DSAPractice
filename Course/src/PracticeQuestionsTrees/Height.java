package PracticeQuestionsTrees;

public class Height {
	
	public int heightOfTree(Node root){
		if(root==null) {
			return 0;
		}
		
		int heightleft = heightOfTree(root.left);
		int heightright = heightOfTree(root.right);
		
		int myHeight = Math.max(heightleft, heightright)+1;
		
		return myHeight;
	}

}
