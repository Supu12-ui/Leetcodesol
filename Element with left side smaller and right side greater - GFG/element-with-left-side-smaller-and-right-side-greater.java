// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}// } Driver Code Ends


//User function Template for Java

class Compute {
    public int findElement(int arr[], int n){
      int maxl[]=new int[n];
      int minr[]=new int[n];
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
          max=Math.max(arr[i],max);
          maxl[i]=max;
      }
      for(int j=n-1;j>=0;j--)
      {
          min=Math.min(arr[j],min);
          minr[j]=min;
      }
      int ans=-1;
      for(int i=0;i<n;i++)
      {
          if(maxl[i]<=arr[i] && minr[i]>=arr[i] && i!=0 && i!=n-1 && ans==-1)
          {
              ans=arr[i];
              return ans;
          }
      }
      return -1;
    }
}