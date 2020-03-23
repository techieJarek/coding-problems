/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 *
 * The binary search tree is guaranteed to have unique values.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 * Example 2:
 *
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 *
 *
 * Note:
 *
 * The number of nodes in the tree is at most 10000.
 * The final answer is guaranteed to be less than 2^31.
 */
public class RangeSumOfBST {
    public static void main(String[] args){
        int L = 7, R = 15;
        RangeSumOfBST helper = new RangeSumOfBST();
        System.out.println(
                "Range Sum of [" + L + "," + R + "] is : " + helper.rangeSumBST(helper.getTreeRootNode(), L, R));
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        return getRangeSum(0, root, L, R);
    }

    private int getRangeSum(int currentSum, TreeNode root, int L, int R){
        if(root == null) return 0;
        int sum = getRangeSum(currentSum, root.left, L, R);
        if(root.val >= L && root.val <=R){
            sum += root.val;
        }
        return sum + getRangeSum(sum, root.right, L, R);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode getTreeRootNode(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);
        return root;
    }
}
