class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return   search2dmatrix(matrix,target);
        
    }
    boolean search2dmatrix(int a[][],int target)
    {
        int n=a.length;
        int m=a[0].length;
        int top=0;
        int down=m-1;
        while(true)
        {
            if(target==a[top][down])
            {
                return true;
               
            }
            else if(a[top][down]<target)
            {
                top++;
            }
            else if(a[top][down]>target)
            {
                down--;
            }
            if(top>=n||down>=m||top<0||down<0)
            {
                return false;
            }
            
        }
    }
}