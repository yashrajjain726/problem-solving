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
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode left_curr = left;
        ListNode right_curr = right;
        ListNode curr = head;
        while(curr!=null)
        {
            if(curr.val>=x)
            {
                right_curr.next = curr;
                right_curr = right_curr.next;
            }
            else
            {
                left_curr.next = curr;
                left_curr = left_curr.next;
            }
            curr = curr.next;
        }
        left_curr.next = right.next;
        right_curr.next = null;  
        return left.next;
    }
}