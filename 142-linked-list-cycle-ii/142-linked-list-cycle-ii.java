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
        // Find the collision point if the list has a cycle
        if (head == null) return null;
         
        ListNode slow = head;
        ListNode fast = head;
         
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
             
            if (slow == fast) break;
        }
         
        // check if the list has no cycle
        if (fast == null || fast.next == null) 
            return null;
         
        // find the entrance of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
