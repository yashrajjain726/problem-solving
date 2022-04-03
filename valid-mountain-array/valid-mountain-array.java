class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3)
            return false;
        int low = 0;
        int high = n-1;
        while(low+1<n-1 && arr[low]<arr[low+1])
            low++;
        while(high-1>0 && arr[high]<arr[high-1])
            high--;
        return low==high;
    }
}