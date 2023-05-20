
class ListNode{
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) {this.val = val;}
}


public class Solution{
    public ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        
        return pre;
    }
}