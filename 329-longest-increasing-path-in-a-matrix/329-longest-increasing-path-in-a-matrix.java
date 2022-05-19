class Solution {
    int dp[][]=new int[201][201];
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=-1;            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int val=solve(i,j,matrix,-1);
                ans=Math.max(ans,val);
            }
        }
        return ans;
        
    }
    int solve(int i,int j,int matrix[][],int prev)
    {
        if(i<0 || j<0||i>=matrix.length||j>=matrix[0].length||prev>=matrix[i][j])
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=1;
        ans=Math.max(ans,1+solve(i+1,j,matrix,matrix[i][j]));
        ans=Math.max(ans,1+solve(i-1,j,matrix,matrix[i][j]));
        ans=Math.max(ans,1+solve(i,j+1,matrix,matrix[i][j]));
        ans=Math.max(ans,1+solve(i,j-1,matrix,matrix[i][j]));
        dp[i][j]=ans;
        return dp[i][j];
    }
}