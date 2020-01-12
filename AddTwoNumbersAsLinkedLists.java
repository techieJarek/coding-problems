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
        
        // Alternative, cleaner approach
        ListNode n1 = new ListNode(2);
        ListNode n11 = new ListNode(4);
        ListNode n111 = new ListNode(3);
        n1.next = n11;
        n11.next = n111;
        ListNode n2 = new ListNode(5);
        ListNode n22 = new ListNode(6);
        ListNode n222 = new ListNode(4);
        n2.next = n22;
        n22.next = n222;

        printListValues(n1);
        printListValues(n2);
        printListValues(addTwoNumbersAlternativeApproach(n1, n2));

    }
    
    private static void printListValues(ListNode node) {
        while(node!=null){
            System.out.print(node.val);
            if(node.next!=null){
                System.out.print("->");
            }
            node = node.next;
        }
        System.out.println("");
    }

    public static ListNode addTwoNumbersAlternativeApproach(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode first = l1, second = l2, current = dummyHead;
        int carry = 0;
        while (first!=null || second != null){
            int x = (first!=null) ? first.val : 0;
            int y = (second!=null) ? second.val : 0;
            int sum = x + y + carry;
            carry = sum/10;
            current.next = new ListNode(sum % 10);
            if (first!=null) first = first.next;
            if (second!=null) second = second.next;
            current = current.next;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
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
