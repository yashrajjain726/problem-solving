class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            int freqOfA = map.get(a);   
            int freqOfB = map.get(b);
            if(freqOfA==freqOfB)
                return b-a;
            return freqOfA-freqOfB;
        });
        int ans[] = new int[nums.length];
        int index=0;
        for(int num:list){
            for(int j=0;j<map.get(num);j++)
                ans[index++] = num; 
        }
        return ans;
    }
}