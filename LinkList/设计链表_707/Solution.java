package LinkList.设计链表_707;

public class Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        } 
    }
    
    class MyLinkedList {
        int size;
        ListNode head;
    
        public MyLinkedList() {
            this.size = 0;
            head = new ListNode(0);
        }
        
        public int get(int index) {
            if (index < 0 || index > size) {
                return -1;
            }
            ListNode currentNode = head;
            //包含一个虚拟头节点，所以查找第 index+1 个节点
            for (int i = 0; i <= index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.val;
        }
        
        public void addAtHead(int val) {
            addAtIndex(0, val);
        }
        
        public void addAtTail(int val) {
            addAtIndex(size, val);
        }
        
        public void addAtIndex(int index, int val) {
            if (index > size){
                return ;
            }
            if (index < 0 ){
                index = 0;
            }
            // if (index == 0){
            //     ListNode add = new ListNode(val);
            //     add.next = head.next;
            //     head.next = add;
            // } 为什么加上这个if条件判断之后所有的结果都会发生错误？
            ListNode cur = head;
            for (int i = 0; i< index; i++){
                cur = cur.next;
            }
            ListNode addNode = new ListNode(val);
            addNode.next = cur.next;
            cur.next = addNode;
        
            size++;
        }
        
        public void deleteAtIndex(int index) {
            if (index < 0 || index > size){
                return ;
            }
            if(index == 0){
                head = head.next;
            }else{
                ListNode cur = head;
                for (int i = 0; i < index; i++){
                    cur = cur.next;
                }
                cur.next = cur.next.next;
            }
            size--;
        }
    }
}
