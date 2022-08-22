class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        char normal_char = 'a';
        String res = "";
        for(char ch:key.toCharArray())
        {   if(ch==' ') continue;
            if(map.containsKey(ch)==false)
                map.put(ch,normal_char++);
        }
        System.out.println(map);
        for(char ch:message.toCharArray())
        {
            if(ch==' ')
                res+=" ";
            else
                res += map.get(ch);
        }
        return res;
    }
}