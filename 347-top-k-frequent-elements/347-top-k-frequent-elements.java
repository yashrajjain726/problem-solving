class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> temp_map = new HashMap<>();
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
            temp_map.put(nums[i],temp_map.getOrDefault(nums[i],0)+1);
        temp_map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEachOrdered(x->map.put(x.getKey(),x.getValue()));
        int ans[] = new int[k];
        int index = 0;
        System.out.println(temp_map);
        for(Map.Entry<Integer,Integer> es: map.entrySet())
        {
            if(index==k)
                break;
            ans[index] = es.getKey();
            index++;
        }
        return ans;
            
    }
}