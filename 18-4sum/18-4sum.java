class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j= i+1;j<n;j++)
            {
                int new_target = target - nums[j] - nums[i];
                int left = j+1;
                int right = n-1;
                while(left<right)
                {
                    int two_sum = nums[left] + nums[right];
                    if(two_sum<new_target)
                        left++;
                    else if(two_sum>new_target)
                        right--;
                    else{
                        List<Integer> four_sum = new ArrayList<>();
                        four_sum.add(nums[i]);
                        four_sum.add(nums[j]);
                        four_sum.add(nums[left]);
                        four_sum.add(nums[right]);
                        list.add(four_sum);
                        
                        while(left<right && nums[left] == four_sum.get(2))
                            left++;
                        while(left<right && nums[right]== four_sum.get(3))
                            right--;
                    }
                    while(j+1<n && nums[j]==nums[j+1])
                        j++;
                }
                while(i+1<n && nums[i]==nums[i+1])
                    i++;
            }
        }
        return list;
    }
}