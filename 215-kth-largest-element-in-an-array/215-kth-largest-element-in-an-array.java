class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int j=0;
        for(;j<nums.length;j++)
        {
            a[j] = pq.poll();
        }
        return a[j-k];
    }
}