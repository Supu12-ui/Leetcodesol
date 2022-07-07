class Solution {
    Boolean dp[][]=new Boolean[101][101];
    public boolean isInterleave(String s1, String s2, String s3) {
       int n=s1.length();
        int m=s2.length();
        int nm=s3.length();
        if((n+m)!=nm)
        {
            return false;
        }
        if(s1.length() ==0&& s2.length()==0 && s3.length()==0)
        {
            return true;
        }
        boolean ans=solve(s1,s2,s3,0,0,0);
        return ans;
    }
    public boolean solve(String s1,String s2,String s3,int i,int j,int k)
    {
        if(i>=s1.length() &&j>=s2.length()&&k>=s3.length())
        {
            return dp[i][j]=true;
        }
        if(i<s1.length() && j<s2.length() && dp[i][j]!=null)
        {
            return dp[i][j];
        }
if(i<s1.length()  && j<s2.length() && k<s3.length()&& s1.charAt(i)==s3.charAt(k) && s2.charAt(j)== s3.charAt(k))
{
  return   dp[i][j]=solve(s1,s2,s3,i+1,j,k+1)||solve(s1,s2,s3,i,j+1,k+1);
  
}
        else if(i<s1.length() && k<=s3.length() &&s1.charAt(i)==s3.charAt(k))
        {
            return dp[i][j]=solve(s1,s2,s3,i+1,j,k+1);
           
        }
        else if(j<s2.length() && k<s3.length()&&s2.charAt(j)==s3.charAt(k))
        {
           return dp[i][j]=solve(s1,s2,s3,i,j+1,k+1);
            
        }
        
        else
        {
            return dp[i][j]=false;
        }
        
        
        
        
        
        
        
        
    }
}