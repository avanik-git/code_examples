

public class BFS{





	public static void main(String[] args) {

        String[] inputs = {"1 2 4 x 7 x x 5 x x 3 x 6 x x","0 x x"};
	for (int i = 0; i<inputs.length; i++) {
            Node root = Node.buildTree(Arrays.stream(inputs[i].split(" ")).iterator());
            List<List<Node>> actual_output = levelOrderTraversal(root);
            String[] result = new String[inputs.length];
            String actualData = "";
            for (int j = 0; j< actual_output.size() ;j++) {
                List<Node> level = actual_output.get(j);
                actualData  += "["+level.stream().map(node -> Integer.toString(node.val)).collect(Collectors.joining(","))+"]";
            }
			System.out.println("Binary tree level order traversal : [" +actualData+"]");
		}
	}

}
