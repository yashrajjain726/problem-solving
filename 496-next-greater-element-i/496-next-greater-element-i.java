class Solution {
    public int maxOfSubArray(int nums[],int start,int end)
    {
        int max = nums[start];
        for(int i=start+1;i<end;i++)
        {
            System.out.println(nums[i]);
            if(max<nums[i])
            {
                max = nums[i];
                break;
            }
        }
         System.out.println("max "+max);
        return max;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int index = 0;
        for(int i=0;i<nums1.length;i++)
        { 
            for(int j=0;j<nums2.length;j++)
            { 
                if(nums1[i]==nums2[j])
                {
                    int max = maxOfSubArray(nums2,j,nums2.length);
                    if(j+1<nums2.length && nums2[j]<max)
                        ans[index] = max;  
                    else
                        ans[index] = -1;
                    index++;
                }
            }
        }
        return ans;
    }
}