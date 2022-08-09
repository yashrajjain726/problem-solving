class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
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