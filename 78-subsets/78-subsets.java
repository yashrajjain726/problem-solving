class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        generateSubset(list,innerList,nums,0);
        return list;
    }
    public void generateSubset(List<List<Integer>> list,List<Integer> innerList, int nums[],int i)
    {
       if(i==nums.length)
       {
           list.add(new ArrayList<Integer>(innerList));
           return;
       }
        innerList.add(nums[i]);
        generateSubset(list,innerList,nums,i+1);;
        innerList.remove(innerList.size()-1);
        generateSubset(list,innerList,nums,i+1);;
        
    }
}