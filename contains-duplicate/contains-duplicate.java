class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1 || nums==null)
            return false;
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums)
        {
            if(set.contains(ele))
            {
                return true;
            }
            set.add(ele);
        }
        return false;      
    }
}