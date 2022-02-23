class Solution {
    public int firstOccurence(int arr[],int x)
    {
         int n = arr.length;
        int low=0;
        int high = n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<x)
                low=mid+1;
            else if(arr[mid]>x)
                high=mid-1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    public int lastOccurence(int arr[],int x)
    {
        
        int n = arr.length;
        int low=0;
        int high = n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<x)
                low=mid+1;
            else if(arr[mid]>x)
                high=mid-1;
            else{
                if(mid==n-1 || arr[mid+1]!=arr[mid])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] arr, int target) {
         int n = arr.length;
        int low =0;
        int high = n-1;
        int ans[] = new int[2];
        int firstOcc =firstOccurence(arr,target);
        if(firstOcc==-1)
        {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int lastOcc = lastOccurence(arr,target);
        ans[0] = firstOcc;
        ans[1] =  lastOcc;
        return ans;
    }
}