class Solution {
    public int removePalindromeSub(String s) {
       if(s.length()==0)
       {
           return 0;
       }
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return 2;
            }
            i++;
            j--;
        }
        return 1;
    }
    public int rec(String s,int i,int j)
    {
        if(i>=j)
        {
            return 1;
        }
        int count=0;
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);
        if(ch1==ch2)
        {
           count+= rec(s,i+1,j-1);
        }
        else
        {
           
            int val1=rec(s,i+1,j)+1;
            int val2=rec(s,i,j-1)+1;
            int min=Math.min(val1,val2);
            count+=min;
        }
        return count;
    }
}