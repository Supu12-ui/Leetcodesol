class Solution {
    int dp[][]=new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
     int m=obstacleGrid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=-1;
            }
        }
     
      int val=solve(0,0,n,m,obstacleGrid);
        return val;
         
        
    }
    int solve(int i,int j,int n,int m,int mat[][])
    {
       if(i<0||j<0||i>=n||j>=m||mat[i][j]==1)
       {
           return 0;
       }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if((i==n-1&&j==m-1) && mat[i][j]==0)
        {
            return 1;
        }
        int count=0;
        count+=solve(i+1,j,n,m,mat);
        count+=solve(i,j+1,n,m,mat);
        return dp[i][j]=count;
        
    }
    
}