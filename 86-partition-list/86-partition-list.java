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
    public ListNode partition(ListNode head, int x) {
        ListNode beforeN=new ListNode(0);
        ListNode before=beforeN;
        ListNode afterN=new ListNode(0);
        ListNode after=afterN;
        while(head!=null){
            if(head.val<x){
                before.next=head;
                before=before.next;
            }
            else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        before.next=afterN.next;
        after.next = null;
        return beforeN.next;
    }
}