class Solution {
    public void reverse(StringBuilder sb, int start, int end)
    {
        while(start<=end)
        {
            char ch = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,ch);
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+"," ");; // replacing multiple spaces with single space
        StringBuilder sb = new StringBuilder();
        int start = 0;
        sb.append(s);
        sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==' ')
            {
                reverse(sb,start,i-1);
                start = i+1;
            }
        }
        reverse(sb,start,sb.length()-1);
        return sb.toString();
    }
}