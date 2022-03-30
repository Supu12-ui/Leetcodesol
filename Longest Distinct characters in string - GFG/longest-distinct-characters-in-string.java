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
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        int max=1;
         int count=0;
        for(int i=0;i<S.length();i++)
        {
            int a[]=new int[26];
            count=0;
            for(int j=i;j<S.length();j++)
            {
                char ch=S.charAt(j);
                int index=(int)(ch-'a');
                a[index]=a[index]+1;
                count++;
                if(a[index]>1)
                {
                    count--;
                    break;
                }
               
            }
            max=Math.max(count,max);
        }
        return max;
        
    }
}