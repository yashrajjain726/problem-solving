class Solution {
    public int minimumDifference(int[] arr, int k) {
        Arrays.sort(arr);
        int minDiff = arr[k-1] - arr[0];
        for(int i=1;i+k-1<arr.length;i++)
        {
            minDiff = Math.min(minDiff,arr[i+k-1]-arr[i]);
            System.out.println(minDiff);
        }
        return minDiff;
    } // 1 4 7 9
}