class Solution {
    public int countSubstrings(String s) {
        if(s.length()==1)
        {
            return 1;
        }
        int n=s.length()+1;
        int m=s.length()+1;
        int dp[][]=new int[n][m];
        int row=1;
        int col=1;
        while(row<n && col<m)
        {
            dp[row][col]=1;
            row++;
            col++;
        }
        row=1;
        col=2;
        while(col<m)
        {
            if(s.charAt(col-1)==s.charAt(row-1))
            {
            dp[row][col]=1;
            
            }
            row++;
            col++;
        }
        row=1;
        col=3;
        while(col<m)
        {
            int k=col;
            row=1;
            while(k<m)
            {
                if(s.charAt(k-1)==s.charAt(row-1))
                {
                    if(dp[row+1][k-1]==1)
                    {
                        dp[row][k]=1;
                    }
                }
                k++;
                row++;
            }
            col++;
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(dp[i][j]==1)
                {
                    count++;
                }
            }
            
        }
        return count;
    }
}