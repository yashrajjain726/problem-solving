class Solution {
    public int search(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)>>1;
            if(nums[mid]==x)
                return mid;
            if(nums[low]<=nums[mid]){
                if(x>=nums[low]&& x<nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else
            {
                if(x>nums[mid] && x<=nums[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}