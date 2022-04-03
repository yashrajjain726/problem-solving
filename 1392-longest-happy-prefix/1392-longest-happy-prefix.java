class Solution {
    public String longestPrefix(String s) {
        int length = s.length();
        int i=1;
        int len = 0;
        int lps[] = new int[s.length()];
        lps[0] = 0;
        while(i<length)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len==0)
                {
                    lps[i] = 0;
                    i++;
                }
                else
                    len = lps[len-1];
            }
        }
        return s.substring(0,lps[length-1]);
        
    }
}