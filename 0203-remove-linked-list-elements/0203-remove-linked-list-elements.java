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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode curr = head;
        while(temp!=null){
            if(head.val == val){
                head = head.next;
                temp = head;
                continue;
            }
            if(temp.val == val){
                curr.next = curr.next.next;
                temp = temp.next;
                continue;
            }
            curr = temp;
            temp = temp.next;
        }
        return head;
        
    }
}