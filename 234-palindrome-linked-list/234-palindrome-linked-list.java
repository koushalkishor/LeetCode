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
        Stack<Integer> stack=new Stack<Integer>();
        ListNode slow=head;
        boolean plaindrome=false;
        while(slow!=null){
            stack.push(slow.val);
            slow=slow.next;
        }
        
        while(head!=null){
            int i=stack.pop();
            if(head.val==i){
                head=head.next;
                plaindrome= true;
            }
            else{
                plaindrome= false;
                break;
            }
        }
        return plaindrome;
    }
}