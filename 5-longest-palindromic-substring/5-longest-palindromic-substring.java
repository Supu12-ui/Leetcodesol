class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int m=s.length();
        int dp[][]=new int[n][m];
         int row=0,col=0;
        int max=0;
        int ans_i=0;
        int ans_j=0;
        while(row<n && col<m)
        {
            dp[row][col]=1;
            row++;
            col++;
        }
        row=0;
        col=1;
        while(col<m)
        {
            if(s.charAt(row)==s.charAt(col))
            {
                dp[row][col]=1;
                if(max<(col-row)+1)
                   {
                       max=col-row+1;
                       ans_i=row;
                       ans_j=col;
                   }
            }
            else
            {
                dp[row][col]=0;
            }
            row++;
            col++;
        }
        int k=2;
        while(k<m)
        {
             row=0;
            col=k;
           while(col<n)
           {
               if(s.charAt(row)==s.charAt(col)&& dp[row+1][col-1]==1)
               {
                   dp[row][col]=1;
                   if(max<(col-row)+1)
                   {
                       max=col-row+1;
                       ans_i=row;
                       ans_j=col;
                   }
               }
               else
               {
                   dp[row][col]=0;
               }
               row++;
               col++;
             
           }
        
        k++;
        } 
   
    return s.substring(ans_i,ans_j+1);
    }
}