public class MaximumDepthOfBinaryTree {
    public static void main(String[] args){
        System.out.println("Maximum depth of the tree is : " + getDepth(getTree()));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private static int getDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Integer.max(getDepth(root.left), getDepth(root.right)) + 1;
    }

    public static TreeNode getTree(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(20);
        root.right.right.right = new TreeNode(23);
        return root;
    }
}
