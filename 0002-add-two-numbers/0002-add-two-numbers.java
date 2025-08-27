class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode first = head;
        int carry = 0;

        while (l1 != null && l2 != null) {
            head.val = l1.val + l2.val + carry;
            carry = 0;
            if (head.val >= 10) {
                head.val -= 10;
                carry = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null || l2 != null) {
                head.next = new ListNode();
                head = head.next;
            }
        }

        while (l1 != null) {
            head.val = l1.val + carry;
            carry = 0;
            if (head.val >= 10) {
                head.val -= 10;
                carry = 1;
            }
            l1 = l1.next;
            if (l1 != null) {
                head.next = new ListNode();
                head = head.next;
            }
        }

        while (l2 != null) {
            head.val = l2.val + carry;
            carry = 0;
            if (head.val >= 10) {
                head.val -= 10;
                carry = 1;
            }
            l2 = l2.next;
            if (l2 != null) {
                head.next = new ListNode();
                head = head.next;
            }
        }
        if (carry != 0) {
            head.next = new ListNode(carry);
        }

        return first;
    }
}
