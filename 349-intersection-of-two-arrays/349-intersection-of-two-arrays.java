class Solution {
    public int[] intersection(int[] nums, int[] arr) {
        HashSet<Integer> set_nums = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        
        for(int num:nums)
            set_nums.add(num);
        for(int ele:arr)
            if(set_nums.contains(ele))
                ans.add(ele);
        int res[] = new int[ans.size()];
        int index = 0;
        for(int num: ans)
            res[index++] = num;
        return res;
    }
}