class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2=revers(s);
        System.out.println(s2);
        int n=s.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
        
    }
    public String revers(String s)
    {
        int start=0;
        int end=s.length()-1;
        char c[]=s.toCharArray();
        while(start<=end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
        String str=String.valueOf(c);
        return str;
    }
}