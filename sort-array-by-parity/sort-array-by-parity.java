class Solution {
    public void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int evenPush = 0;
        for(int i=0;i<nums.length;i++){
            if(evenPush<nums.length && nums[i]%2==0)
            {       
                swap(nums,i,evenPush++);
            }
            
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}