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
//     static int flag;
 public ListNode detectCycle(ListNode head) {
//         ListNode temp=cycle(head);
//         ListNode ram=head;
//        if(flag==1){
//         while(ram!=temp){
//             temp=temp.next;
//             ram=ram.next;
//         }
//        }
//         else{
//             return null;
//         }
//         return ram;
//     }
//     public ListNode cycle(ListNode head){
//         ListNode tem=head;
//         ListNode fast=head;
//         while(fast!=null && fast.next!=null){
//             tem=tem.next;
//             fast=fast.next.next;
//             if(tem==fast){
//                 flag=1;
//                 return tem;
               
//             }
//         }
//         return null;
     
     
     ListNode temp=head;
     ListNode fast=head;
     int flag=0;
     
     while(fast!=null && fast.next!=null){
        temp=temp.next;
         fast=fast.next.next;
         if(temp==fast){
             flag=1;
             break;
         }
     }
     
     ListNode slow=head;
     if(flag==1){
         while(slow!=temp){
             slow=slow.next;
             temp=temp.next;
         }
         return temp;
     }
         else{
             return null;
         }
    
     }
    
}