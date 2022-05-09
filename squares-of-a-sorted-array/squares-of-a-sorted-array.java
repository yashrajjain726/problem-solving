class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
            pq.add((int)Math.pow(nums[i],2));
        for(int i=0;i<nums.length;i++)
            nums[i] = pq.remove();
        return nums;
    }
}