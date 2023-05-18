
class ListNode{
        int val;
        ListNode next;
    
        public ListNode(){};
        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val, ListNode nexNode){
            this.val = val;
            this.next = nexNode;
        }    
}


public class Solution{
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;

        if (head == null){
            return head;
        }

        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
           
            cur = cur.next;
        }

        return dummy.next;
    }

}