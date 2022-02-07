// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int nearestPowerOfTwo(int n)
    {
        int count = 0;
        while((1<<count)<=n)
            count++;
        return count-1;
    }
    public static int countSetBits(int n){
    
        // Your code here
        if(n==0)
            return 0;
        int pow = nearestPowerOfTwo(n);
        int tillPowerOfTwo = pow * (1<<(pow-1));
        int AfterPowerOfTwo = n - (1<<pow) + 1;
        int remainingRes = n - (1<<pow);
        int res = tillPowerOfTwo + AfterPowerOfTwo + countSetBits(remainingRes);
        return res;
        
    }
}

// { Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}
  // } Driver Code Ends