class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int start = 1;
        for(int i=0;i<target.length;)
        {
            if(target[i]==start)
            {
                list.add("Push");
                i++;
            }
            else{
                list.add("Push");
                list.add("Pop");  
            }
            start++;
            
        }
        return list;
    }
}