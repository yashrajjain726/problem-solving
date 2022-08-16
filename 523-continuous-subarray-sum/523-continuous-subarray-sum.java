class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int total_sum = 0;
        map.put(0,-1); //edge case for zero
        for(int i=0;i<nums.length;i++)
        {
            total_sum += nums[i];
            int rem = total_sum%k;
            if(map.containsKey(rem))
            {
                if(i-map.get(rem)>1)
                    return true;
                else 
                    continue; // because we should not update the index in case of [5,0,0,0]
            }
            map.put(rem,i);
              
        }
        return false;
    }
}