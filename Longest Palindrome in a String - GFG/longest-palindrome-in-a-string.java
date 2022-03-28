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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        // code here
        int n=s.length();
        int m=s.length();
        int dp[][]=new int[n][m];
         int row=0,col=0;
        int max=0;
        int ans_i=0;
        int ans_j=0;
        while(row<n && col<m)
        {
            dp[row][col]=1;
            row++;
            col++;
        }
        row=0;
        col=1;
        while(col<m)
        {
            if(s.charAt(row)==s.charAt(col))
            {
                dp[row][col]=1;
                if(max<(col-row)+1)
                   {
                       max=col-row+1;
                       ans_i=row;
                       ans_j=col;
                   }
            }
            else
            {
                dp[row][col]=0;
            }
            row++;
            col++;
        }
        int k=2;
        while(k<m)
        {
             row=0;
            col=k;
           while(col<n)
           {
               if(s.charAt(row)==s.charAt(col)&& dp[row+1][col-1]==1)
               {
                   dp[row][col]=1;
                   if(max<(col-row)+1)
                   {
                       max=col-row+1;
                       ans_i=row;
                       ans_j=col;
                   }
               }
               else
               {
                   dp[row][col]=0;
               }
               row++;
               col++;
             
           }
        
        k++;
        } 
   
    return s.substring(ans_i,ans_j+1);
        
    }
}