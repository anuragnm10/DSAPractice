package Tree;

public class BinarySearchTree {
	
	Node root;
	
	BinarySearchTree(int val){
		this.root = new Node(val);
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree(50);
		tree.insert(30);
		tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorderCall();
		
	}
	
	void insert(int key) {
		insertRec(root, key);
	}
	
	public Node insertRec(Node root, int key) {
		
		if(root == null) {
			root = new Node(key);
			return root;
		}else if(key<root.data) {
			root.left = insertRec(root.left, key);
		}else if(key>root.data) {
			root.right = insertRec(root.right, key);
		}
		
		return root;
		
	}
	
	void inorderCall() {
		inOrderRec(root);
	}
	
	
	void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}

}
