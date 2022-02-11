class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        subsets(list,innerList,nums,0);
        return list;
    }
    public void subsets(List<List<Integer>>list, List<Integer> innerList,int arr[],int ind)
    {
        list.add(new ArrayList<>(innerList));
        for(int i=ind;i<arr.length;i++)
        {
            if((i!=ind)&&(arr[i]==arr[i-1]))
                continue;
            innerList.add(arr[i]);
            subsets(list,innerList,arr,i+1);
            innerList.remove(innerList.size()-1);
        }
    }
}