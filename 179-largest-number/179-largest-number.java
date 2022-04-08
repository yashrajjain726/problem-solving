class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0)
            return "";
        String sorted[] = new String[nums.length];
        for(int i=0;i<nums.length;i++)
            sorted[i] = String.valueOf(nums[i]);
        Arrays.sort(sorted,(s1,s2)->(s2+s1).compareTo(s1+s2));
        if(sorted[0].charAt(0)== '0')
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String s:sorted)
            sb.append(s);
        return sb.toString();
        
    }
}