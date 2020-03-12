import java.util.*;

public class SerializeDeserializeBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode getValidTree(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(20);
        return root;
    }

    public static void main(String args[]){
        System.out.println("Serialize : " + serialize(getValidTree()));
        TreeNode node = deserialize(serialize(getValidTree()));
        System.out.println("deserialize : " + node.val);
    }

    private static String serialize(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        serialize(root, q);
        String result = "";
        while (!q.isEmpty()){
            result += (result.isEmpty()) ? q.poll() : "#" + q.poll();
        }
        return result;
    }

    private static void serialize(TreeNode root, Queue<Integer> q) {
        if(root == null) return;
        q.add(root.val);
        serialize(root.left, q);
        serialize(root.right, q);
    }

    private static TreeNode deserialize(String serialized) {
        String[] array = serialized.split("#");
        Queue<Integer> q = new LinkedList<>();

        for(String str : array){
            q.add(Integer.valueOf(str));
        }

        return deserialize(q, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static TreeNode deserialize(Queue<Integer> q, int min, int max) {
        if(q.isEmpty()) return null;
        int next = q.peek();
        if(next<min || next>max) return null;
        q.poll();
        TreeNode root = new TreeNode(next);
        root.left = deserialize(q, min, next);
        root.right = deserialize(q, next, max);
        return root;
    }
}
