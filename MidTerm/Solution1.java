package MidTerm;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution1 {
    public boolean areConverging(ListNode n1, ListNode n2){
        int lenA = length(n1);
        int lenB = length(n2);
        while (lenA > lenB) {
            n1 = n1.next;
            lenA--;
        }
        while (lenA < lenB) {
            n2 = n2.next;
            lenB--;
        }

        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }

        if (n1 == null){
            return false;
        }else {
            return true;
        }
    }
    private int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(6);

        ListNode n1a = new ListNode(2);
        ListNode n1b = new ListNode(3);

        ListNode n2a = new ListNode(7);
        ListNode n2b = new ListNode(8);
        ListNode n2c = new ListNode(9);

        ListNode nd = new ListNode(100);

        n1.next = n1a;
        n1a.next = n1b;
        n1b.next = nd;

        n2.next = n2a;
        n2a.next = n2b;
        n2b.next = n2c;
        n2c.next = nd;

        Solution1 s = new Solution1();
        Boolean b = s.areConverging(n1,n2);
        System.out.println(b);

    }
}
