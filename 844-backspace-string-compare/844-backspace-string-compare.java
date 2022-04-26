class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder();
        Stack<Character> stackOne = new Stack<>();
        Stack<Character> stackTwo = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!='#')
                stackOne.push(ch);
            else if(stackOne.isEmpty()==false)
                stackOne.pop();
        }
           for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(ch!='#')
                stackTwo.push(ch);
            else if(stackTwo.isEmpty()==false)
                stackTwo.pop();
        }
        while(stackOne.isEmpty()==false)
            sbOne.append(stackOne.pop());
        while(stackTwo.isEmpty()==false)
            sbTwo.append(stackTwo.pop());
        return sbOne.reverse().toString().equals(sbTwo.reverse().toString());
        
        
    }
}