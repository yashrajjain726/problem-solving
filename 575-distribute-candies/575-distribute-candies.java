class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> set = new HashSet<>();
        int recommended = n/2;
        for(int i=0;i<n;i++)
        {
            set.add(candyType[i]);
        }
        if(set.size()>=recommended)
            return recommended;
        return set.size();
            
    }
}