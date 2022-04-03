class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0)
        {
            int j = nums.length-1;
            while(j>=0 && nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    public void reverse(int nums[],int start,int end)
    {
        while(start<end)
            swap(nums,start++,end--);
    }
    public void swap(int nums[],int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}