class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int ans[][]=new int[n][m];
        int dx[]={-1,-1,0,1,1,1,0,-1};
        int dy[]={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int count=0;
                for(int k=0;k<8;k++)
                {
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=n || ny>=m||nx<0||ny<0||board[nx][ny]==0)
                    {
                        continue;
                    }
                    else 
                    {
                       count++; 
                    }
                }
                if(board[i][j]==1)
                {
                    if(count==2||count==3)
                    {
                       ans[i][j]=1; 
                    }
                    else if(count<2||count>3)
                    {
                        ans[i][j]=0;
                    }
                }
                else
                {
                    if(count==3)
                    {
                        ans[i][j]=1;
                    }
                }
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                board[i][j]=ans[i][j];
            }
           
        }
        
    }
}