class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k%nums.length;
        rotateRight(nums,0,nums.length-1);
        rotateRight(nums,0,k-1);
        rotateRight(nums,k,nums.length-1);   
    }
    void rotateRight(int arr[],int low,int high)
    {
       
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            ++low;
            --high;
        }
    }
}