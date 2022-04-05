class Solution {
    public int lengthOfLongestSubstring(String s) {
       int arr[] =  new int[256];
        Arrays.fill(arr,-1);
        int i = 0;
        int res = 0;
        for(int j=0;j<s.length();j++)
        {
            i =  Math.max(i,arr[s.charAt(j)]+1);
           int maxEnd  =  j - i + 1;
            res =  Math.max(maxEnd,res);
            arr[s.charAt(j)] = j;
        }
        return res;
    }
}