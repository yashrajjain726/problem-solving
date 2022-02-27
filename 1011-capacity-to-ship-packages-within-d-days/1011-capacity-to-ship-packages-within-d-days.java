class Solution {
    public boolean isFeasible(int arr[], int days, int ans)
    {
        int kNeed = 1;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>ans)
            {
                kNeed++;
                sum = arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (kNeed<=days);
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxInWeights = Integer.MIN_VALUE;
        int sumOfWeights = 0;
        int res = 0;
        for(int i=0;i<weights.length;i++)
        {
            sumOfWeights+=weights[i];
            if(weights[i]>maxInWeights) maxInWeights = weights[i];
        }
        int low = maxInWeights;
        int high = sumOfWeights;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isFeasible(weights,days,mid))
            {
                res = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
}