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
    public boolean isPalindrome(ListNode head) {
        if(head==null ){
            return true;
        }
        ListNode temp=head;
        ListNode middle=middlelist(head);
        ListNode reverse=reverseList(middle);
        while(reverse!=null){
            if(temp.val!=reverse.val){
                return false;
            }
            temp=temp.next;
            reverse=reverse.next;
            
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        ListNode headnext=head.next;
        headnext.next=head;
        head.next=null;
        return newHead;
    }
    public static ListNode middlelist(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}