package InterQuestions;

public class question2 {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		System.out.println(findCount(root));
		
	}

	private static int  findCount(Node root) {
		if(root == null) {
			return 0;
		}
		
		int left = findCount(root.left);
		int right = findCount(root.right);
		
		return Math.max(left, right)+1;
		
	}

}
