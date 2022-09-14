class Solution {
    public int search(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)>>1;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]>=arr[low])
            {
                if(x>=arr[low] && arr[mid]>x)
                    high = mid-1;
                else
                    low = mid+1;
            }
            else
            {
                if(x>arr[mid] && x<=arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}