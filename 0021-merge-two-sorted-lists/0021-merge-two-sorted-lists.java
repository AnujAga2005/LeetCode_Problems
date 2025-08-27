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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        while(list1!=null && list2!=null){
            ListNode newNode;
            if(list1.val<=list2.val){
                newNode = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                newNode = new ListNode(list2.val);    
                list2 = list2.next;
            }
            newNode.next = head;
            head=newNode;
            
        }
        while(list1!=null){
            ListNode newNode = new ListNode(list1.val);
                newNode.next = head;
                head=newNode;
                list1 = list1.next;
        }
        while(list2!=null){
            ListNode newNode = new ListNode(list2.val);
                newNode.next = head;
                head=newNode;
                list2 = list2.next;
        }
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}