// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
       ArrayList<String> ans=new ArrayList<>();
       int k=0;
       String str="";
    for(int i=0;i<S.length();i++)
    {
        if(S.charAt(i)!='.')
        {
          str+=S.charAt(i);
          
        }
        else
        {
            str='.'+str;
            ans.add(str);
            str="";
        }
    }
    ans.add(str);
   Collections.reverse(ans);
    str="";
   for(int i=0;i<ans.size();i++)
   {
     str+=ans.get(i);  
   }
   return str;
    }
    
    
}