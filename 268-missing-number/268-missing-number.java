class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int res = arr.length;
         for(int i=0; i<arr.length; i++){
            res ^= i;
            res ^= arr[i];
    }
        return res;
                
    }
}