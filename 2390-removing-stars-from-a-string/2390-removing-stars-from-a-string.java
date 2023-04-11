class Solution {
    public String removeStars(String s1) {
      char []s=s1.toCharArray();
      int i=0;
        int j=0;
        int n=s.length;
        boolean not_star=false;
        while(i<n)
        {
            if(s[i]!='*' && not_star==false)
            {
                i++;
                j++;
            }
            else if(s[i]=='*')
            {
                not_star=true;
                i++;
                j--;
            }
            else if(s[i]!='*' && not_star==true)
            {
                s[j]=s[i];
                j++;
                i++;
            }
            
        }
        if(not_star==false)
        {
            return s1;
        }
        
        String ans="";
        for(int m=0;m<j;m++)
        {
           ans=ans+s[m]; 
        }
        return ans;
    }
}