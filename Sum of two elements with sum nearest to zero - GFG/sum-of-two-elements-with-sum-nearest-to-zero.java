// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().closestToZero (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int closestToZero (int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        int i=0,j=n-1;
        int max=arr[i]+arr[n-1];
        while(i<j)
        {
          int  sum=arr[i]+arr[j];
          
             
              if(Math.abs(sum)<Math.abs(max))
              {
                  max=sum;
              }
              if(Math.abs(sum)==Math.abs(max))
              {
                  max=Math.max(sum,max);
              }
          
           if(sum<0)
           {
               i++;
           }
           else
           {
               j--;
           }
          
        }
        return max;
    }
}