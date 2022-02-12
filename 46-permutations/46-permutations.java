class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        permutation(list,innerList,nums);
        return list;
    }
    public void permutation(List<List<Integer>> list, List<Integer>innerList,int nums[])
    {
        if(innerList.size()==nums.length)
        {
            list.add(new ArrayList<>(innerList));
            return;
        }
        else
        {
            for(int j=0;j<nums.length;j++)
            {
                if(innerList.contains(nums[j])) continue;
                innerList.add(nums[j]);
                permutation(list,innerList,nums);
                innerList.remove(innerList.size()-1);
            }
        }
    }
}