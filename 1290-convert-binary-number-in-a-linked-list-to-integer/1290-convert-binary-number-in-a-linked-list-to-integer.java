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
// class Solution {
//     public int getDecimalValue(ListNode head) {
//         if(head==null){
//             return 0;
//         }
//         String str="";
//         int dec=0;
        
//         ListNode temp=head;
//         while(temp!=null){
//             str+=temp.val;
//             temp=temp.next;
//         }
//         int num=Integer.parseInt(str,2);
//         // int temp=num;
//         // while(num>0)
//         return num;
//     }
    class Solution {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;    
        }
        return num;
    }
}
