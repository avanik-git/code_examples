import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


class Node {
	int val;
	Node left, right;
	public Node(int val) {
		this.val = val;
	}
	public static Node buildTree(Iterator<String> iter) {
		String nxt = iter.next();
		if (nxt.equals("x")) return null;
		Node node = new Node(Integer.parseInt(nxt));
		node.left = buildTree(iter);
		node.right = buildTree(iter);
		return node;
	}
}
public class DFS {


	public DFS(){

	}
	public static Node dfs(Node root,int target){
		if(root == null){
			return null;
		}
		if(root !=null){	
			int nodeVal = root.val;
		
			if(target == nodeVal){
				return root;
			}
		}
	Node left = dfs(root.left,target);
	if(left!=null){
		return left;
	}
	Node right = dfs(root.right,target);
	if(right!=null){
		return right;
	}
	return null;
	}

	public static void main(String args[]){

	String[] inputs = {"5 4 3 x x 8 x x 6 x x", "-100 x -500 x -50 x x", "9 8 11 x x 20 x x 6 x x"};
		int[] target = { 8, -50, 11 };
		int[] expected_outputs = { 8, -50, 11 };
		for (int i = 0; i<inputs.length; i++) {
			Node root = Node.buildTree(Arrays.stream(inputs[i].split(" ")).iterator());
			System.out.println("DFS right node : " + dfs(root, target[i]));
			System.out.println("DFS left node : " + dfs(root, target[i]));
		}


	}
}
