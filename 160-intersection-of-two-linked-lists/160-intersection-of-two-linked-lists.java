/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a =length(headA);
        int b=length(headB);
        int k=Math.abs(a-b);
        if(a>b){
            while(k>0){
                headA=headA.next;
                k--;
            }
        }
        else{
            while(k>0){
                headB=headB.next;
                k--;
            }
        }
        while(headA!=headB && headA.next!=null && headB.next!=null){
            headA=headA.next;
            headB=headB.next;
        }
        if(headA!=headB){
            return null;
        }
        return headA;
    }
    public static int length(ListNode ead){
        int l=0;
        ListNode temp=ead;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
        
    }
}