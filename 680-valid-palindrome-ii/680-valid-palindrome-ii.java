class Solution {
    public boolean checkPalindrome(String s, int start,int end,boolean isCharDeleted)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                if(isCharDeleted)
                    return false;
                return checkPalindrome(s,start+1,end,true) || checkPalindrome(s,start,end-1,true);
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        return checkPalindrome(s,0,s.length()-1,false);
    }
}