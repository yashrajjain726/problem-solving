class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0)
            return ans;
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(1);
            for(int j=1;j<i;j++)
            {
                innerList.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            innerList.add(1);
            ans.add(innerList);
        }
        return ans;
    }
}