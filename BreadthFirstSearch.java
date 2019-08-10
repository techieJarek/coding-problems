import java.util.LinkedList;

/*
Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.

  1
 / \
2   3
   / \
  4   5

 */
public class BreadthFirstSearch {
    public static void main(String[] args) {
        Node rootNode = new Node(
                "1",
                new Node("2", null, null),
                new Node(
                        "3",
                        new Node("4", null, null),
                        new Node("5", null, null)
                )
        );

        printNodeValuesLevelWise(rootNode);
    }

    private static void printNodeValuesLevelWise(Node rootNode) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            Node nextNodeToBeProcessed = queue.removeFirst();
            System.out.println("Node value: " + nextNodeToBeProcessed.value);

            if(nextNodeToBeProcessed.leftChild != null) {
                queue.add(nextNodeToBeProcessed.leftChild);
            }
            if(nextNodeToBeProcessed.rightChild != null) {
                queue.add(nextNodeToBeProcessed.rightChild);
            }
        }
    }

    private static class Node {
        private String value;
        private Node leftChild;
        private Node rightChild;
        private Node(String value, Node leftChild, Node rightChild) {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }
}
