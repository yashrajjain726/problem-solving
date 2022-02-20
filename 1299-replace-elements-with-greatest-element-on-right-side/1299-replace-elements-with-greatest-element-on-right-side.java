class Solution {
       int largestInSubArray(int arr[],int index)
    {
        int max =0;
      for(int i=index;i<arr.length;i++)
      {
          
          if(arr[i]>max)
          {
              max = arr[i];
          }
      }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int res[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i] = largestInSubArray(arr,i+1);
        }
        res[arr.length-1]=-1;
        return res;
    }
}