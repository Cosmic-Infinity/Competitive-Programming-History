//0ms 42.26mb

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
        ListNode l3 = null, start = null;
        
        while(list1!=null && list2!= null){
            ListNode newnode = new ListNode();
            newnode.val = 0;
            newnode.next = null;
            if(list1.val <= list2.val){
                newnode.val=list1.val;
                list1 = list1.next;
            }
            else{
                newnode.val = list2.val;
                list2 = list2.next;
            }
            if(start==null){
                l3 = start = newnode;
            }
            else{
                l3.next = newnode;
                l3 = l3.next;
            }
        }
        while(list1!=null){
            ListNode newnode = new ListNode();
            newnode.val = list1.val;
            newnode.next = null;
            list1 = list1.next;

            if(start==null){
                l3 = start = newnode;
            }
            else{
                l3.next = newnode;
                l3 = l3.next;
            }
        }
        while(list2!=null){
            ListNode newnode = new ListNode();
            newnode.val = list2.val;
            newnode.next = null;
            list2 = list2.next;
            
            if(start==null){
                l3 = start = newnode;
            }
            else{
                l3.next = newnode;
                l3 = l3.next;
            }
        }
        return start;
    }
}