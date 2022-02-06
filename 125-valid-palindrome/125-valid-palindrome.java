class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                res = res + (s.charAt(i));
            }
        }
        int start = 0;
        int end = res.length() -1;
        while(start<end)
        {
            if(res.charAt(start)!=res.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}