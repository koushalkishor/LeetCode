/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode t=head;
       ListNode fast=head;
        ListNode  slow=head;
        int flag=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==1){
            
            while(t!=slow){
                t=t.next;
                slow=slow.next;
            }
        }
        else{
            return null;
        }
        return t;
    }
}
