class pair
{
    int row;
    int col;
    public pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid.length==0)
        {
            return 0;
        }
        Queue<pair> pq=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int emp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    pair p=new pair(i,j);
                    pq.add(p);
                }
                else if(grid[i][j]==0)
                {
                    emp++;
                }
            }
        }
        int non_emp=(n*m)-emp;
        int count_size=0;
        int dx[]={-1,0,0,1};
        int dy[]={0,-1,1,0};
        int min=0;
        while(pq.size()!=0)
        {
            int size=pq.size();
            count_size+=size;
            for(int i=0;i<size;i++)
            {
                pair temp=pq.poll();
                int row=temp.row;
                int col=temp.col;
                for(int j=0;j<4;j++)
                {
                    int nx=row+dx[j];
                    int ny=col+dy[j];
                    if(nx>=n || ny>=m ||nx<0||ny<0||grid[nx][ny]!=1)
                    {
                        continue;
                    }
                    else
                    {
                     pair p=new pair(nx,ny);
                        pq.add(p);
                        grid[nx][ny]=2;
                    }
                }
            }
            if(!pq.isEmpty())
            min++;
            
            
        }
        return (count_size - non_emp)==0?min:-1;
        
        
    }
}