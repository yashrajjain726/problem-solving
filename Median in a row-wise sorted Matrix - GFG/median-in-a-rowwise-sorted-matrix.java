// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int arr[][], int r, int c) {
        // code here    
        int start = arr[0][0];
        int end = arr[0][c-1];
        for(int i=0;i<r;i++)
        {
            if(arr[i][0]<start)
                start = arr[i][0];
            if(arr[i][c-1]>end)
                end = arr[i][c-1];
        }
        int medianPos = ((r*c)+1)/2;
        while(start<end)
        {
            int mid = (start+end)/2;
            int midPos = 0;
            for(int i=0;i<r;i++)
             {
                int pos = Arrays.binarySearch(arr[i],mid);
                if(pos<0)
                    pos = Math.abs(pos) - 1;
                else{
                    while(pos<arr[i].length && arr[i][pos]==mid)
                        pos++;
                }
                midPos += pos;
             }
            if(midPos<medianPos)
                start = mid + 1;
            else
                end = mid;
        }
        return start;
        
        
    }
}