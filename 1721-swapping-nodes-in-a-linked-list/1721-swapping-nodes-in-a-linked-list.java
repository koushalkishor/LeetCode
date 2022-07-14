/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode nthNode=head;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<k;i++){
            fast=fast.next;
            nthNode=nthNode.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int tem=nthNode.val;
        nthNode.val=slow.val;
        slow.val=tem;
        return temp.next;
    }
}