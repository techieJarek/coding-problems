import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

NOTE: BigInteger slows down performance but was used here to pass the test on very large numbers

 */
public class AddTwoNumbersAsLinkedLists {
    public static void main(String args[]){
        addTwoNumbers(getListNode(new BigInteger("342")), getListNode(new BigInteger("465")));
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger result = getInteger(l1).add(getInteger(l2));
        return getListNode(result);
    }

    private static ListNode getListNode(BigInteger number) {
        if(number.compareTo(BigInteger.ZERO) == 0){
            return new ListNode(0);
        }
        List<ListNode> nodes = new ArrayList<>();
        ListNode previousNode = null;
        while(number.compareTo(BigInteger.ONE) == 1 || number.compareTo(BigInteger.ONE) == 0){
            BigInteger remainder = number.mod(BigInteger.TEN);
            ListNode node = new ListNode(remainder.intValue());
            if(previousNode != null){
                previousNode.next = node;
            }
            nodes.add(node);
            number = number.divide(BigInteger.TEN);
            previousNode = node;
        }
        Collections.reverse(nodes);
        nodes.forEach(node -> System.out.print(node.val));
        System.out.print("\n");
        return nodes.get(nodes.size()-1);
    }

    public static BigInteger getInteger(ListNode l){
        ListNode node = l;
        BigInteger multiplier = BigInteger.valueOf(1);
        BigInteger returnValue = BigInteger.valueOf(0);
        while(node!=null){
            returnValue = returnValue.add(multiplier.multiply(BigInteger.valueOf(node.val)));
            multiplier = multiplier.multiply(BigInteger.valueOf(10));
            node = node.next;
        }
        return returnValue;
    }


}
