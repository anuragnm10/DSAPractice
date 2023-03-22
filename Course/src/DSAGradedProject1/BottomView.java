
package DSAGradedProject1;

import java.util.*;

class Node {
	int data;
	Node left, right;
	public int hd;
	Node(int data) {
		this.data = data;
	}
}

public class BottomView {
	static Node root;
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		ArrayList < Integer > ans = bottomView(root);
		for (Integer tmp: ans)
			System.out.print(tmp+" ");
	}
	static public ArrayList < Integer > bottomView(Node root) {
	
		ArrayList<Integer> ans = new ArrayList<>(); 
        if(root == null) 
        	return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<Node>();
        root.hd = 0;
        q.add(root); 
        while(!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.hd; 
            map.put(hd, temp.data); 
            if(temp.left != null) {
                temp.left.hd = hd - 1; 
                q.add(temp.left); 
            }
            if(temp.right != null) {
                temp.right.hd = hd + 1; 
                q.add(temp.right); 
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue()); 
        }
        return ans; 
	}

}
