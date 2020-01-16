/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the
 * depth of the two subtrees of every node never differs by more than 1.
 */
public class BalancedBinaryTree {
    public static void main (String[] args){
        System.out.println("Is tree balanced : " + isBalanced(getTreeRootNode()));
    }

    public static boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    private static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        if(left == -1) return -1;
        int right = maxDepth(root.right);
        if(right == -1) return -1;
        return (Math.abs(left - right) <= 1) ? Math.max(left, right) + 1 : -1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode getTreeRootNode(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(15);
        return root;
    }
}
