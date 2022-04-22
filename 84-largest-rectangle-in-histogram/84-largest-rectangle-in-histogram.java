class Solution {
    public int[] previousSmallerFunc(int heights[],int n)
    {
        int previousSmaller[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i=0;i<n;i++)
        {
            while(stack.isEmpty()==false && heights[stack.peek()]>=heights[i])
                stack.pop();
            int ele = stack.isEmpty()?-1:stack.peek();
            previousSmaller[index] = ele;
            index++;
            stack.push(i);
        }
        return previousSmaller;
        
    }
     public int[] nextSmallerFunc(int heights[],int n)
    {
        int nextSmaller[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(stack.isEmpty()==false && heights[stack.peek()]>=heights[i])
                stack.pop();
            int ele = stack.isEmpty()?n:stack.peek();
            nextSmaller[i] = ele;
            stack.push(i);
        }
        return nextSmaller;
        
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int previousSmaller[] = previousSmallerFunc(heights,n);
        int nextSmaller[] = nextSmallerFunc(heights,n);
        int max = 0;
        for(int i=0;i<n;i++)
        {
            int currMax = (nextSmaller[i] - previousSmaller[i] - 1) * heights[i];
            max = Math.max(currMax,max);
        }
        return max;
        
    }
}