// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N+1][N+1];
        return solve(arr,1,N-1,dp);
        
    }
  static  int solve(int a[],int i,int j,int dp[][])
    {
        if(i>=j)
        {
            return dp[i][j]=0;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        int Min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int tempans=solve(a,i,k,dp)+solve(a,k+1,j,dp)+a[i-1]*a[k]*a[j];
            Min=Math.min(Min,tempans);
            dp[i][j]=Min;
            
        }
        return dp[i][j];
    }
}