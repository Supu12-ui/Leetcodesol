class Solution {
    public void setZeroes(int[][] matrix) {
     int n=matrix.length;
        int m=matrix[0].length;
        boolean row=false;
        boolean col=false;
       
        for(int i=0;i<n;i++)
        {
            // if(matrix[0][i]==0)
            // {
            //     col=true;
            // }
            if(matrix[i][0]==0)
            {
               row=true;
                
            
             
                //continue;
            }
            
            
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
            
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=1;j--)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                {
                    matrix[i][j]=0;
                }
            }
            if(row==true)
            {
                matrix[i][0]=0;
            }
            // if(col==true)
            // {
            //     matrix[0][i]=0;
            // }
        }
    }
}