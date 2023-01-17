class Solution {
    public boolean isHappy(int n) {
     if(n<10)
       {
           if(n==1||n==7)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
      int temp=pow(n);
      return isHappy(temp);
       
        
    }
    int pow(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            sum+=rem*rem;
        }
        return sum;
    }
    
}