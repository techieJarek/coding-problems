/**
 * Given a binary tree, determine if it is a valid Binary Search Tree (BST).
 */
public class ValidateBST {
    private static TreeNode previousVisitedNode;
    public static void main(String[] args){
        System.out.println("Tree is valid = " + isValidBST(getValidTree()));
        System.out.println("Tree is valid = " + isValidBST(getInValidTree()));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode getValidTree(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(20);
        return root;
    }

    public static TreeNode getInValidTree(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(20);
        return root;
    }

    public static boolean isValidBST(TreeNode root) {
        return isInIncreasingOrder(root);
    }

    private static boolean isInIncreasingOrder(TreeNode root) {
        if(root == null) return true;

        if(isInIncreasingOrder(root.left)){
            if(previousVisitedNode!=null && previousVisitedNode.val > root.val) return false;
            previousVisitedNode = root;
            return isInIncreasingOrder(root.right);
        } else {
            return false;
        }
    }
}
