
class ListNode{
    int val;
    ListNode next;

    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class Solution {
    public ListNode sweapListNode(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        ListNode firstNode;
        ListNode secondNode;
        ListNode temp;

        if (cur.next == null || cur.next.next == null) {return dummy.next;}

        while (cur.next != null && cur.next.next != null){
            firstNode = cur.next;
            secondNode = cur.next.next;
            temp = cur.next.next.next;

            cur.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = temp;
            cur = firstNode;
        }

        return dummy.next; //为什么这里返回head会舍去head的第一个元素？？？
    }
}
