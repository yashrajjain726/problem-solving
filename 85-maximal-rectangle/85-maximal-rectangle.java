class Solution {
    public int[] previousSmallerFunc(int arr[])
    {
        int ans[] = new int[arr.length];
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(stack.isEmpty()==false && arr[stack.peek()]>=arr[i])
                stack.pop();
            int span = stack.isEmpty()?-1:stack.peek();
            ans[i] = span;
            stack.push(i);
        }
        return ans;
    }
    public int[] nextSmallerFunc(int arr[])
    {
        int ans[] = new int[arr.length];
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(stack.isEmpty()==false && arr[stack.peek()]>=arr[i])
                stack.pop();
            int span = stack.isEmpty()?arr.length:stack.peek();
            ans[i] = span;
            stack.push(i);
        }
        return ans;
    }
    public int largestHistogramFunc(int arr[])
    {
        int res = 0;
        int prevSmaller[] = previousSmallerFunc(arr);
        int nextSmaller[] = nextSmallerFunc(arr);
        for(int i=0;i<arr.length;i++)
        {
            int curr = (nextSmaller[i]-prevSmaller[i]-1)*arr[i];
            res = Math.max(res,curr);
        }
        return res;
    }
    public int maximalRectangle(char[][] matrix) {
       if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int histogram[] = new int[n];
        int maxRectangle = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){ 
                if(matrix[i][j] == '0') histogram[j] = 0;
                else histogram[j] += (matrix[i][j]-'0');
            }
            maxRectangle = Math.max(maxRectangle, largestHistogramFunc(histogram)); 
        }
        
        return maxRectangle;
    }
}