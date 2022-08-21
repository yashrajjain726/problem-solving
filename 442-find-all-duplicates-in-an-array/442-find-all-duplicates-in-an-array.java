class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            int value = nums[index];
            if(value>0)
                nums[index] = -nums[index];
            else
                list.add(index+1);
        }
        return list;
    }
}