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
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int a[][])
    {
        // code here 
        int n=a.length;
        int m=a[0].length;
        ArrayList<Integer> r=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==1)
                 {
                     r.add(i);
                     c.add(j);
                    
                 }
            }
        }
       
        //  System.out.println(r);
        //  System.out.println(c);
        
        
        for(int i=0;i<r.size();i++)
        {
            int k=r.get(i);
            for(int j=0;j<m;j++)
            {
                a[k][j]=1;
            }
        }
        
        for(int i=0;i<c.size();i++)
        {
            int k=c.get(i);
            for(int j=0;j<a.length;j++)
            {
                a[j][k]=1;
            }
        }
         
    }
}