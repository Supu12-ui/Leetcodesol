class Solution {
    public int findSubstringInWraproundString(String p) {
        int count[]=new int[26];
        int len=1;
        for(int i=0;i<p.length();i++)
        {
            if(i>0 &&(p.charAt(i)-p.charAt(i-1)==1||p.charAt(i-1)-p.charAt(i)==25))
               {
                   len++;
               }
               else
               {
                   len=1;
               }
               int index=p.charAt(i)-'a';
               count[index]=Math.max(count[index],len);
        }
          
               int sum=0;
               for(int ele:count)
               {
                   sum=sum+ele;
               }
               return sum;
               
    }
}