class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }        
        }
        int ans[] = new int[list.size()];
        for(int z=0;z<list.size();z++)
            ans[z] = list.get(z);
        return ans;
    }
}