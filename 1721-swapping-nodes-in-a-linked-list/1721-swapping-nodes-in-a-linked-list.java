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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode lastLen = head;
        int length = 0;
        while(lastLen!=null)
        {
            lastLen = lastLen.next;
            length++;
        }
        System.out.println(length);
        int kth = length-k;
        ListNode kthLast =  head;
        ListNode kthBegin = head;
        while(kth-->0)
            kthLast = kthLast.next;
        System.out.println(kthLast.val);
        while(k-->1)
            kthBegin = kthBegin.next;
        System.out.println(kthBegin.val);
        if(kthLast.val!=kthBegin.val)
        {
            int temp = kthBegin.val;
            kthBegin.val = kthLast.val;
            kthLast.val = temp;
        }
        return head;
        
    }
}