class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        generateSubset(list,innerList,nums,0);
        return list;
    }
    public void generateSubset(List<List<Integer>> list,List<Integer> innerList, int arr[],int ind)
    {
       list.add(new ArrayList<>(innerList));
        for(int i=ind;i<arr.length;i++)
        {
            innerList.add(arr[i]);
            generateSubset(list,innerList,arr,i+1);
            innerList.remove(innerList.size()-1);
        }
        
    }
}