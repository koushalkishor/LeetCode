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
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int a;
        int b;
        int carry=0;
        int sum;
        while(l1!=null || l2!=null){
            if(l1!=null){
                a=l1.val;
            }
            else{
                a=0;
            }
            if(l2!=null){
                b=l2.val;
            }
            else{
                b=0;
            }
            sum=carry+a+b;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry>0){
            temp.next=new ListNode(carry);
        }
        return dummy.next;
    }
}