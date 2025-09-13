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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        int l1=0,l2=0;
        while(a!=null){
            a=a.next;
            l1++;
        }
        while(b!=null){
            b=b.next;
            l2++;
        }
        int jump = Math.abs(l2-l1);
        
        if(l1>l2){
            a = headA;
            b= headB;
            int i=0;
            while(i<jump){
                a = a.next;
                i++;
            }
            while (a != null && b != null) {
                if (a == b) return a;
                a = a.next;
                b = b.next;
            }
            return a;
        }else{
            a = headA;
            b= headB;
            int i=0;
            while(i<jump){
                b = b.next;
                i++;
            }
            while (a != null && b != null) {
                if (a == b) return a;
                a = a.next;
                b = b.next;
            }
            return a;
        }
        
    }
}