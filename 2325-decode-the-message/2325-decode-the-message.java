class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        char normal_char = 'a'; // for having a mapping structure as shown in example
        String res = ""; // the result we want to return
        for(char ch:key.toCharArray()) // looping through the key array
        {   if(ch==' ') continue; // if a space occurs, leave it.
            if(map.containsKey(ch)==false) // check it satisfies the condition of one occurence only
                map.put(ch,normal_char++); // if yes, map it will the normal alapahbet structure
        }
        for(char ch:message.toCharArray())
        {
            if(ch==' ')
                res+=" "; // add the spaces according to the message word
            else
                res += map.get(ch); // add the alphabetic mapping that we odded
        }
        return res;
    }
}