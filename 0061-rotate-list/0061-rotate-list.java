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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode start = head;
        ListNode temp = head;
        int size = 1;
        while(temp.next!=null){
            temp = temp.next;
            size++;
        }
        temp.next = start;
        temp = head;
        k = k%size;
        int idx = size-k-1;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
}