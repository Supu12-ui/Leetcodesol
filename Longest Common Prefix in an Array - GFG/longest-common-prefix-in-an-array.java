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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i].length())
            {
                max=arr[i].length();
                index=i;
                
            }
            
        }
        String ans="";
        for(int i=0;i<max;i++)
        {
            char ch1=arr[index].charAt(i);
            for(int j=0;j<arr.length;j++)
            {
                if(i>=arr[j].length())
                {
                    return ans;
                }
                char ch2=arr[j].charAt(i);
               // System.out.println(ch1+" "+ch2);
                if(ch1!=ch2)
                {
                if(ans.length()==0)
                {
                    return "-1";
                }
                else
                {
                    return ans;
                }
                }
            }
            ans+=ch1;
        }
        return ans;
    }
}