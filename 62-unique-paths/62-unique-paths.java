class Solution {
    public int uniquePaths(int m, int n) {
        return dir(n,m);
    }
    
    boolean inrange(int i,int j,int n,int m)
    {
        if(i>=n || j>=m)
        {
           return false; 
        }
        return true;
    }
    int vis(int n,int m,int i,int j,int dir[][],int dp[][])
    {
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        int count=0;
        for(int d=0;d<dir.length;d++)
        {
            int r=i+dir[d][0];
            int c=j+dir[d][1];
            if(inrange(r,c,n,m))
            {
                count+=vis(n,m,r,c,dir,dp);
            }
        }
        return dp[i][j]=count;
    }
    int dir(int n,int m)
    {
        int d[][]={{0,1},{1,0}};
        int dp[][]=new int[n][m];
        return vis(n,m,0,0,d,dp);
    }
}