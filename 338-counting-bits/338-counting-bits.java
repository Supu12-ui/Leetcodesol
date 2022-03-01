class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        int offset=1;
        for(int i=1;i<dp.length;i++)
        {
            if((2*offset)==i)
            {
                offset=2*offset;
            }
            dp[i]=dp[i-offset]+1;
        }
        return dp;
    }
}