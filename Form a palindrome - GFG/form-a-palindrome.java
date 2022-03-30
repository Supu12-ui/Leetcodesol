// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        // code here
        int dp[][]=new int[str.length()+1][str.length()+1];
        dp[0][0]=0;
        if(check(str))
        {
            return 0;
        }
        String str2=reverse(str);
        for(int i=1;i<str.length()+1;i++)
        {
            for(int j=1;j<str.length()+1;j++)
            {
                if(str.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return str.length()-dp[str.length()][str.length()];
    }
    static boolean check(String str)
    {
        int start=0;
        int end=str.length()-1;
        char ch[]=str.toCharArray();
        
        while(start<end)
        {
            if(ch[start]!=ch[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
   static String reverse(String str)
    {
        int start=0;
        int end=str.length()-1;
        char ch[]=str.toCharArray();
        while(start<end)
        {
         char temp=ch[start];
         ch[start]=ch[end];
         ch[end]=temp;
         start++;
         end--;
        }
        String ans=String.valueOf(ch);
        return ans;
    }
}