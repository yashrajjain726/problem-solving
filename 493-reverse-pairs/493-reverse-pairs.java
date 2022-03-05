class Solution {
    public int reversePairs(int[] nums) {
        int res =  merge(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
        return res;
    }
    public int merge(int nums[],int l, int r)
    {
       if (l >= r) return 0;    
        int m = l + (r - l) / 2;
        int res = merge(nums, l, m) + merge(nums, m+1, r);
        int[] tmp = new int[r-l+1];
        int i = l, j = m+1, k = 0;
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }
        while (i <= m) tmp[k++] = nums[i++];
        while (j <= r) tmp[k++] = nums[j++];
        for (i = l, j = m+1; i <= m; i++) {
            while (j <= r && nums[i] / 2.0 > nums[j]) j++;
            res += j - m - 1;
        }
        for (i = l, j = 0; i <= r; i++, j++) nums[i] = tmp[j];
        return res;
    }
}