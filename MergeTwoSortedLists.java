/**
 Merge two sorted linked lists and return it as a new list. The new list should be made by
 splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n11 = new ListNode(2);
        ListNode n111 = new ListNode(4);
        n1.next = n11;
        n11.next = n111;
        ListNode n2 = new ListNode(1);
        ListNode n22 = new ListNode(3);
        ListNode n222 = new ListNode(4);
        n2.next = n22;
        n22.next = n222;

        ListNode node = mergeTwoLists(n1, n2);
        printListValues(node);
    }

    private static void printListValues(ListNode node) {
        while(node!=null){
            System.out.print(node.val);
            if(node.next!=null){
                System.out.print("->");
            }
            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2!=null) return l2;
        if(l2==null && l1!=null) return l1;
        if(l2==null && l1==null) return null;
        ListNode node = (l1.val < l2.val) ? l1 : l2;
        if(l1.val < l2.val){
            l1 = l1.next;
        }
        else{
            l2 = l2.next;
        }

        ListNode parent = node;
        while (l1!=null || l2!=null){
            if(l1!=null && l2==null){
                parent.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l2!=null && l1==null){
                parent.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            else{
                parent.next = new ListNode(Integer.min(l1.val, l2.val));
                if(l1.val < l2.val) {
                    l1 = l1.next;
                } else {
                    l2 = l2.next;
                }
            }
            parent = parent.next;
        }

        return node;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
