class Solution {
    public int[] intersect(int[] a, int[] b) {
        
        int n = a.length;
        int m = b.length;
        int min = n>m?m:n;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else{
                list.add(a[i]);
                i++;
                j++;
            }
        }
        int ans[] = new int[list.size()];
        for(int z=0;z<list.size();z++)
            ans[z] = list.get(z);
        return ans;
    }
}