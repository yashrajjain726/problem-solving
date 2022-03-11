class Solution {
    public int minimumDifference(int[] arr, int k) {
        Arrays.sort(arr);
        int minDiff =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(i>=k-1)
                minDiff = Math.min(minDiff,arr[i]-arr[i-(k-1)]);
        }
        return minDiff;
    } // 1 4 7 9
}