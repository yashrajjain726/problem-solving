class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    void reverse(char s[],int low, int high)
    {
        while(low<high)
        {
            char character = s[low];
            s[low] = s[high];
            s[high] = character;
            low++;
            high--;
        } 
    }
}