/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node
 * down to the nearest leaf node.
 */
public class MinimumDepthOfBinaryTree {
    public static void main (String[] args){
        System.out.println("Minimum depth of the tree is : " + getDepth(getTree()));
    }

    private static int getDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return getDepth(root.right) + 1;
        if(root.right == null) return getDepth(root.left) + 1;
        return Integer.min(getDepth(root.left), getDepth(root.right)) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode getTree(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(20);
        root.right.right.right = new TreeNode(23);
        return root;
    }
}
