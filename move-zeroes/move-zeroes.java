class Solution {
    public void moveZeroes(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                swap(arr,i,count);
                count++;
            }
        }
    }
    public void swap(int arr[],int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}