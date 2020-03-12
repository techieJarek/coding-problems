import java.util.*;

/** 
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored
 in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or 
 another computer environment.

Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your 
serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be serialized 
to a string and this string can be deserialized to the original tree structure.

The encoded string should be as compact as possible.

Note: Do not use class member/global/static variables to store states. 
Your serialize and deserialize algorithms should be stateless.
 */
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
        if(root == null) return null;
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
        if(serialized == null) return null;
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
