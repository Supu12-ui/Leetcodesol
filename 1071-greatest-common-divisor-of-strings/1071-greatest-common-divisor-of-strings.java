class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String temp1=str1+str2;
        String temp2=str2+str1;
        if(!temp1.equals(temp2))
        {
          return "";  
        }
        int a=str1.length();
        int b=str2.length();
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        String ans="";
        for(int i=0;i<a;i++)
        {
            ans=ans+str2.charAt(i);
        }
       return ans;
    }
}