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
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        size--;
        int ans = 0;
        ListNode tem = head;
        while(tem!=null){
            ans = ans + (tem.val*(int)Math.pow(2,size));
            size--;
            tem =tem.next;
        }
        return ans;
    }
}