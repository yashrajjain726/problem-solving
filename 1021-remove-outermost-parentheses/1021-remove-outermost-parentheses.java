class Solution {
    public String removeOuterParentheses(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==')')
                stack.pop();
            else
                stack.push(ch);
            if(stack.isEmpty())
            {
                sb.append(s.substring(index+1,i));
                index = i+1;
            } 
        }
        return sb.toString();
    }
}