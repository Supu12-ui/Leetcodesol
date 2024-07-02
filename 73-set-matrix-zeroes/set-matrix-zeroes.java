// brute force approach 
class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m= matrix[0].length;
        boolean row = false;
        boolean col=false;
        for (int i=0;i<n;i++)
        {
         for(int j=0;j<m;j++)
         {
             if (matrix[i][j]==0){
              for(int k=0;k<m;k++)
              {
                  if(matrix[i][k]==0) continue;
                      
                  matrix[i][k]=Integer.MAX_VALUE;
              }
                 for(int k=0;k<n;k++)
                 {
                     if(matrix[k][j]==0) continue;
                     //System.out.println(k);
                     matrix[k][j]=Integer.MAX_VALUE;
                 }
             }
         }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                //System.out.print(matrix[i][j]);
                if(matrix[i][j]==Integer.MAX_VALUE)
                {
                    matrix[i][j]=0;
                }
            }
            //System.out.println();
        }
        
        
    }
}
// better approach 
class Solution {
    public void setZeroes(int[][] matrix) {
      int n= matrix.length;
      int m= matrix[0].length;
      int []row= new int[n];
      int []col= new int[m];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(matrix[i][j]== 0)
              {
                  row[i]=1;
                  col[j]=1;
              }

          }
      }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix[i][j]=0;
                }
                else
                {
                   continue;
                }
            }
        }
    
    }
}

//optimize approach 
class Solution {
    public void setZeroes(int[][] matrix) {
    int n= matrix.length;
    int m = matrix[0].length;
    boolean col=false;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(matrix[i][j]==0)
            {
                if(j!=0)
                {
                matrix[0][j]=0;
                }
                else{
                   col=true; 
                }
                matrix[i][0]=0;
            }
        }
    }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0)
        {
            for(int i=0;i<m;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(col==true)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}
