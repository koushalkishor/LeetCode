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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||  head.next==null){
            return head;
        }
        ListNode temp=head;
        int count=0;
        while( temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp.next=head;
        count++;
        k=k%count;
        int rotate=count-k;
        temp=head;
        while(rotate-->1){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}