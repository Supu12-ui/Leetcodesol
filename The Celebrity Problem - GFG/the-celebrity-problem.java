// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<n;i++)
     {
         st.push(i);
     }
     while(st.size()!=1)
     {
         int val1=st.pop();
         int val2=st.pop();
         if(M[val1][val2]==0)
         {
             st.push(val1);
         }
         else 
         {
             if(M[val2][val1]==0)
             {
                 st.push(val2);
             }
             else
             {
                 continue;
             }
         }
     }
     int val=st.peek();
     for(int i=0;i<n;i++)
     {
         if(val!=i)
         {
         if(M[val][i]==1||M[i][val]==0)
         {
           return -1;
          }
         }
      }
      return val;
    }
    
    
    
}