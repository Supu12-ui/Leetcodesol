class Solution {
    public int countVowelStrings(int n) {
        int dp[][]=new int[n][5];
        for(int i=0;i<5;i++)
        {
            dp[0][i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=4;j>=0;j--)
            {
                if(j==4)
                {
                  dp[i][j]=dp[i-1][j];  
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j+1];
                }
            }
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
           sum+=dp[n-1][i]; 
        }
        return sum;
    }
}