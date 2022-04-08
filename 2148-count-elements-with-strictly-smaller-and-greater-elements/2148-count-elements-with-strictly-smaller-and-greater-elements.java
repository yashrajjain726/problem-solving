class Solution {
    public int countElements(int[] nums) {
        if(nums.length==1)
            return 0;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int count = 0;
        for(int i=1;i<nums.length-1;i++)
            if(nums[i]!=min && nums[i]!=max)
                count++;
        return count;
    }
    // -89 -89 39 39 39 39
}