class Solution {
    public boolean isIsomorphic(String s,String pat)
    {
        if(s.length()!=pat.length())
            return false;
        Map<Character,Character> mapOne = new HashMap<>();
        Map<Character,Boolean> mapTwo = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sCh = s.charAt(i);
            char pCh = pat.charAt(i);
            if(mapOne.containsKey(sCh))
               {
                   if(mapOne.get(sCh)!=pCh)
                    return false;
               }
            else 
               {
                   if(mapTwo.containsKey(pCh))
                       return false;
                   else{
                       mapOne.put(sCh,pCh);
                       mapTwo.put(pCh,true);
                   }
               }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(isIsomorphic(words[i],pattern))
                list.add(words[i]);
        }
        return list;
    }
}