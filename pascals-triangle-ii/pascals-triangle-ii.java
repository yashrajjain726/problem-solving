class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        
        list.add(new ArrayList<>());
        list.get(0).add(1);
        
        if(rowIndex==0)
            return list.get(0);
        
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(1);
            for(int j=1;j<list.size();j++)
                innerList.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            innerList.add(1);
            list.add(innerList);
        }
        return list.get(rowIndex);
        
        
        
    }
}