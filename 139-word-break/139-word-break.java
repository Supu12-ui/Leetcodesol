class Solution {
    int dp[]=new int[300+2];
    public boolean wordBreak(String s, List<String> wordDict) {
        Arrays.fill(dp,-1);
        int val=cal1(s,wordDict,0);
       if(val==1)
       {
           return true;
       }
       return false;
    }
    
    //memoization
  
     int cal1(String str,List<String> arr,int index)
    {
       if(str.length()==index)
       {
           return 1;
       }
         if(dp[index]!=-1)
         {
             return dp[index];
         }
        
        for(int i=index;i<str.length();i++)
        {
            if(check(str.substring(index,i+1),arr)&&cal1(str, arr, i+ 1)==1)
            {
               dp[i]=1;

                 return dp[i];
            }
        }
         dp[index]=0;
        return dp[index];
    }
    
     boolean check(String str,List<String> arr)
    {
      
        for(int i=0;i< arr.size();i++)
        {

            if(arr.contains(str))
            {
                return true;
            }

        }
        return false;
    }
    //recursive way:
    boolean cal(String str,List<String> arr,int index)
    {
       if(str.length()==index)
       {
           return true;
       }
        for(int i=index;i<str.length();i++)
        {
            if(check(str.substring(index,i+1),arr)&&cal(str, arr, i + 1))
            {


                 return true;
            }
        }
        return false;
    }
    
}