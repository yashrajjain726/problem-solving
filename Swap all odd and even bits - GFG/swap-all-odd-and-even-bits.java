// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    int oddMask = 0x55555555;
	    int evenMask = 0xAAAAAAAA;
	    int oddPlace = n & oddMask;
	    int evenPlace = n & evenMask;
	    oddPlace= oddPlace<<1;
	    evenPlace = evenPlace >> 1;
	    n = evenPlace | oddPlace;
	    return n;
	}
    
}

// { Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}  // } Driver Code Ends