class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m_size = nums1.length;
        int n_size = nums2.length;
        if(n_size>m_size)
            merge(nums2,n,nums1,m);
        int index = 0;
        for(int i=0;i<n_size;i++)
            nums1[i+m] =nums2[i];
        insertionSort(nums1);
    }
    public void insertionSort(int nums[])
    {
        for(int i=1;i<nums.length;i++)
        {
            int j = i-1;
            int key = nums[i];
            while(j>=0 && nums[j]>key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}