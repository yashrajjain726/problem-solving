class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if(n==0)
            return 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(i));
                count++;
            }
            else
                set.add(s.charAt(i));
        }
        if(set.isEmpty()==false)
            return count*2+1;
        return count*2;
        
    }
}