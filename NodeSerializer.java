/**
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s),
 * which deserializes the string back into the tree.
 *
 * For example, given the following Node class
 *
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 * The following test should pass:
 *
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 */
public class NodeSerializer {

    public static class Node {
        String value;
        Node left;
        Node right;

        public Node(String value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args){
        Node node =
                new Node("root",
                        new Node("left",
                                new Node("left.left", null, null), null),
                        new Node("right", null, null));

        String serialized = serialize(node);
        System.out.println("Result of serialization : " + serialized);
        if(deserialize(serialized).left.left.value.equals("left.left")){
            System.out.println("All good");
        }
        else{
            System.out.println("Test failed");
        }

    }

    private static Node deserialize(String serialized){
        return deserializeRecursively(serialized, 0);
    }

    private static Node deserializeRecursively(String serialized, int depth) {
        if(serialized == null || serialized.isEmpty()){
            return null;
        }
        String nodeContent = serialized.substring(serialized.indexOf('(') + 1, serialized.lastIndexOf(')'));
        String depthSeparator = "#" + depth + "#";
        String[] elements = nodeContent.split(depthSeparator);
        String value = elements[0];
        String leftNodeInString = elements[1];
        String rightNodeInString = elements[2];
        Node leftNode = (leftNodeInString.equals("null")) ? null : deserializeRecursively(leftNodeInString, depth + 1);
        Node rightNode = (rightNodeInString.equals("null")) ? null : deserializeRecursively(rightNodeInString, depth + 1);
        return new Node(value, leftNode, rightNode);
    }

    private static String serialize(Node node){
        return serializeRecursively(node, 0);
    }

    private static String serializeRecursively(Node node, int depth) {

        String depthSeparator = "#" + depth + "#";

        String result = "Node(" + node.value + depthSeparator;

        if(node.left!=null){
            result = result + serializeRecursively(node.left, depth + 1);
        }
        else{
            result = result + "null";
        }

        result = result + depthSeparator;

        if(node.right!=null){
            result = result + serializeRecursively(node.right, depth + 1);
        }
        else{
            result = result + "null";
        }

        result = result + ")";

        return result;
    }
}
