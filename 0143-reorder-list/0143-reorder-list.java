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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        
        ListNode first = head;
        ListNode last = head;
        while(last.next!=null && last.next.next!=null){
            first = first.next;
            last = last.next.next;
        }

        ListNode prev = null;
        ListNode curr = first.next;
        first.next = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            ListNode temp1 = left.next;
            ListNode temp2 = right.next;
            left.next = right;
            right.next = temp1;
            left = temp1;
            right = temp2;
        }
    }
}