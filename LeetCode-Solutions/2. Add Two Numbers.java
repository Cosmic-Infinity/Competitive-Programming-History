//1ms 44.46mb

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null, start = null;
        short carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            ListNode newnode = new ListNode();
            newnode.next = null;
            short x = 0;
            if (l1 != null) {
                x += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                x += l2.val;
                l2 = l2.next;
            }
            if (carry != 0) {
                x += carry;
                carry = 0;
            }
            if (x > 9) {
                newnode.val = x % 10;
                carry = 1;
            } else {
                newnode.val = x;
            }
            if (start == null) {
                l3 = newnode;
                start = l3;
            } else {
                l3.next = newnode;
                l3 = newnode;
            }
        }
        return start;
    }
}