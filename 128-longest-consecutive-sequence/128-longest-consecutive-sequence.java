class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int curr;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(nums[i]);
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]-1)==false)
            {
                curr = 1;
                while(set.contains(nums[i]+curr))
                    curr++;
                max = Math.max(max,curr);
            }
        }
        return max;
    }
}