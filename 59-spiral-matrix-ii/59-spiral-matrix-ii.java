class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int mat[][]=new int[n][n];
        int minrow=0,mincol=0,maxrow=n-1,maxcol=n-1;
        while(k<=(n*n))
        {
            for(int i=minrow;i<=maxcol&&k<=(n*n);i++)
            {
                mat[minrow][i]=k;
                k++;
            }
            minrow++;
             for(int i=minrow;i<=maxcol&&k<=(n*n);i++)
            {
                mat[i][maxcol]=k;
                k++;
            }
           maxcol--;
             for(int i=maxcol;i>=mincol&&k<=(n*n);i--)
            {
                mat[maxrow][i]=k;
                k++;
            }
            maxrow--;
             for(int i=maxrow;i>=minrow&&k<=(n*n);i--)
            {
                mat[i][mincol]=k;
                k++;
            }
            mincol++;
            
            
        }
        return mat;
        
        
    }
}