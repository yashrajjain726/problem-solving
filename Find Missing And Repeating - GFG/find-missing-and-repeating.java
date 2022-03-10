// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[] = new int[2];
        int xor = 0;
        int res1 = 0;
        int res2 = 0;
        for(int i=0;i<n;i++)
        {
            xor ^= arr[i];
        }
        
        for(int i=1;i<=n;i++)
        {
            xor ^= i;
        }
        int rightMostBit = xor & -xor;
        for(int i=0;i<n;i++)
        {
            if((arr[i]&rightMostBit)==0)
                res1 ^= arr[i];
            else
                res2 ^= arr[i];
        }
        for(int i=1;i<=n;i++)
        {
            if((i&rightMostBit)==0)
                res1 ^= i;
            else
                res2 ^= i;
        }
        for(int i=0;i<n;i++)
        {
           if(arr[i]==res1)
           {
               ans[0] = res1;
               ans[1] = res2;
           }
           else if(arr[i]==res2)
           {
               ans[0] = res2;
               ans[1] = res1;
           }
        }
        return ans;
        
    }
}