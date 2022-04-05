class Solution {
    public int maxArea(int[] arr) {
        int res =0;
        int i=0;
        int j = arr.length -1;
        while(i<j)
        {
            res = Math.max(res,(j-i) * Math.min(arr[i],arr[j]));
            if(arr[i]>arr[j])
                j--;
            else
                i++;
        }
        return res;
    }
}