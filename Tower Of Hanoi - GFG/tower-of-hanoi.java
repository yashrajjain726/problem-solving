// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}





// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {

    public long toh(int n, int a, int b, int c) {
        // Your code here
        towerOfHanoi(n,a,b,c);
       return (long)Math.pow(2,n)-1;
    }
    public void towerOfHanoi(int n,int a,int b, int c)
    {
         if(n==1)
        {
            System.out.println("move disk 1 from rod "+a+" to rod "+b);
            return;
        }
         towerOfHanoi(n-1, a, c, b);
        System.out.println("move disk "+n+" from rod "+a+" to rod "+b);
        towerOfHanoi(n-1,c,b,a);
    }
}
