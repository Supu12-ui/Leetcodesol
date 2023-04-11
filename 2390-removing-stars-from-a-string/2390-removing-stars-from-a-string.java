class Solution {
    public String removeStars(String s1) {
      char []s=s1.toCharArray();
      int i=0;
        int j=0;
        int n=s.length;
       
        while(i<n)
        {
           if(s[i]=='*')
            {
                
                i++;
                j--;
            }
            else if(s[i]!='*')
            {
                s[j]=s[i];
                j++;
                i++;
            }
            
        }
       
        
        String ans="";
        for(int m=0;m<j;m++)
        {
           ans=ans+s[m]; 
        }
        return ans;
    }
}