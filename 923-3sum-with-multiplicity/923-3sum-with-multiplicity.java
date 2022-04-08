class Solution {
    static final double mod = 1e9+7;
    public int threeSumMulti(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long ans = 0;
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(int i=0;i<nums.length;i++)
        {
            int count[] = new int[101];
            for(int j=i+1;j<nums.length;j++)
            {
                int res = target - nums[i] - nums[j];
                if(res>=0 && res<=100 && count[res]>0)
                {
                    ans += count[res];
                    ans %= mod;
                }
                count[nums[j]]++;
            }
        }
        return (int)ans;
    }
}