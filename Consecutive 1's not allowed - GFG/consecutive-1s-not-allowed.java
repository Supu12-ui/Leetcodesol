// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        long m=1000000007;
        // code here
        long dp[]=new long[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n+1;i++)
        {
            dp[i]=(dp[i-1]%m+dp[i-2]%m)%m;
        }
        return dp[n];
    }
}