class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int minAppear = nums.length/3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(Map.Entry<Integer,Integer> innerMap: map.entrySet())
        {
            if(innerMap.getValue()>minAppear)
                list.add(innerMap.getKey());
        }
        return list;
        
    }
}