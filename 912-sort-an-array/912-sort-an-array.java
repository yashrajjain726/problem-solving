class Solution {
    public int[] sortArray(int[] nums) {
        int index = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums)
            pq.add(num);
        while(pq.size()!=0)
            nums[index++] = pq.remove();
        return nums;
            
    }
}