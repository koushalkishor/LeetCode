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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        while(l1!=null || l2!=null || carry!=0){
            int x=0;
            if(l1!=null){
                x=l1.val;
            }
            int y=0;
            if(l2!=null){
                y=l2.val;
            }
            int sum=x+y+carry;
            int digit=sum%10;
            carry=sum/10;
            curr.next=new ListNode(digit);
            curr=curr.next;
            
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return temp.next;
    }
}