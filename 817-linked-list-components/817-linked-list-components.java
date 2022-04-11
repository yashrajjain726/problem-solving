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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        ListNode curr = head;
        int ans = 0;
        while(curr!=null)
        {   
            boolean totalCount = true;
            while(set.contains(curr.val))
            {
                if(totalCount)
                    ans++;
                totalCount = false;
                if(curr.next!=null)
                    curr = curr.next;
                else break;
            }
            curr = curr.next;
            
        }
        return ans;
        
    }
}