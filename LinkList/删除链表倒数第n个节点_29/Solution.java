
class ListNode{
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        int size = 0;

        while(cur != null){
            size++;
            cur = cur.next;
        }

        for(int i = 0; i < size - n; i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;

        return dummy.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n){
        ListNode dummy = new ListNode(-1, head);
        ListNode fastIdnex = dummy;
        ListNode slowIndex = dummy;

        //想要删除倒数第n个元素，首先让fastIndex向前移动n步
        for (int i = 0; i < n; i++){
            fastIdnex = fastIdnex.next;
        }

        while (fastIdnex.next != null){
            fastIdnex = fastIdnex.next;
            slowIndex = slowIndex.next;
        }

        slowIndex.next = slowIndex.next.next;

        return dummy.next;
    }
    
}