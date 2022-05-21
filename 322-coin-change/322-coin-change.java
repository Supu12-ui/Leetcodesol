class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n=coins.length;
        if(n==1 && amount%coins[0]!=0)
        {
            return -1;
        }
        else if(n==1 && amount%coins[0]==0)
        {
         return amount/coins[0];
        }
        if(amount<=0)
        {
            return 0;
        }
      int dp[][]=new int[n+1][amount+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<amount+1;j++)
        {
            dp[0][j]=Integer.MAX_VALUE-1;
        }
        for(int i=1,j=0;j<amount+1;j++)
        {
          if(j%coins[0]==0)
          {
              dp[i][j]=j/coins[0];
          }
            else
            {
                dp[i][j]=Integer.MAX_VALUE-1;
            }
        }
        for(int i=2;i<n+1;i++)
        {
           for(int j=0;j<amount+1;j++)
           {
               if(coins[i-1]<=j)
               {
                 dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
               }
               else
               {
                   dp[i][j]=dp[i-1][j];
               }
           }
        }
        if(dp[n][amount]==Integer.MAX_VALUE-1)
        {
            return -1;
        }
       return dp[n][amount] ;
        
    }
    
    
}