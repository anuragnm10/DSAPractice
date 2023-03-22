package PracticeQuestionsTrees;

public class SumOfLeftLeaves {
	
	public int sum(Node root) {
		
		if(root == null) {
			return 0;
		}
		int ans = 0;
		if(root.left!=null) {
			if(root.left.left==null && root.left.right==null) {
				ans += root.left.data;
			}else {
				ans += sum(root.left);
			}
		}
		
		ans += sum(root.right);
		
		return ans;
	}

}
