//5ms 45.05mb

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

import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int k = 0; k < lists.length; k++) {
            while (lists[k] != null) {
                pq.offer(lists[k].val);
                lists[k] = lists[k].next;
            }
        }
        ListNode res = null;
        ListNode head = res;
        while (!pq.isEmpty()) {
            if (res == null) {
                res = new ListNode();
                res.val = pq.poll();
                res.next = null;
                head = res;
            } else {
                res.next = new ListNode();
                res = res.next;
                res.val = pq.poll();
                res.next = null;
            }
        }
        return head;
    }
}




/*
//134ms 44.33mb

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        int n = lists.length;
        int available = 0;
        for (int i = 0; i < n; i++) {
            if (lists[i] != null)
                available++;
        }
        ListNode l3 = null, start = null;
        while (available > 0) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    index = i;
                    min = lists[i].val;
                }
            }
            // ListNode newnode = new ListNode();
            // newnode.val = min;
            // newnode.next = null;

            if (start == null) {
                l3 = start = lists[index];
            } else {
                l3.next = lists[index];
                l3 = l3.next;
            }
            if (index > -1) {
                lists[index] = lists[index].next;
                if (lists[index] == null)
                    available--;
            }
        }
        return start;
    }
}
*/
