package Tree;

public class MaxDepthOfaTree {
	
	public static void main(String[] args) {
		
		Node node = new Node(1);
		node.left = new Node(3);
		node.left.left = new Node(2);
		node.right = new Node(5);
		node.left.right = new Node(7);
		
		
		System.out.println(findDepth(node));
		
	}

	private static int findDepth(Node node) {
		
		if(node == null) {
			return 0;
		}
		
		int leftHieght = findDepth(node.left);
		int rightHieght = findDepth(node.right);
		return Math.max(leftHieght, rightHieght)+1;
	}
	
}
