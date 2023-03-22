package PracticeQuestionsTrees;

public class BinaryTree {
	
	public static void main(String[] args) {
		
		int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Node root = buildTree(node);
//		PreOrder p1 = new PreOrder();
//		p1.preOrder(root);
//		System.out.println();
//		InOrder i1 = new InOrder();
//		i1.inorder(root);
//		System.out.println();
//		PostOrder p2 = new PostOrder();
//		p2.postOrder(root);
//		System.out.println();
//		LevelOrder l1 = new LevelOrder();
//		l1.levelorder(root);
//		CountNodes c1 = new CountNodes();
//		System.out.println(c1.countNodes(root));
//		SumOfNodes s1 = new SumOfNodes();
//		System.out.println(s1.sumOfnodes(root));
//		Height h1 = new Height();
//		System.out.println(h1.heightOfTree(root));
//		SumOfLeftLeaves sol = new SumOfLeftLeaves();
//		System.out.println(sol.sum(root));
		
		LeastCommonAncestor loc1 = new LeastCommonAncestor();
		Node ans = loc1.loc(root, 4, 5);
		System.out.println(ans.data);
	}
	
	static int idx = -1;
	private static Node buildTree(int[] node) {
		idx++;
		if(node[idx] == -1) {
			return null;
		}
		
		Node newNode = new Node(node[idx]);
		newNode.left = buildTree(node);
		newNode.right = buildTree(node);
		
		return newNode;
		
	}

}
