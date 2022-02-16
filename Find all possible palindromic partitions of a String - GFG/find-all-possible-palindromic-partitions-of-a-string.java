// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
       ArrayList<ArrayList<String>> myans=new ArrayList<>();
       ArrayList<String> ans=new ArrayList<>();
       solved(S,ans,myans,0);
       return myans;
    }
    static void solved(String S,ArrayList<String> ans,ArrayList<ArrayList<String>> myans,int index)
    {
        if(index==S.length())
        {
           myans.add(new ArrayList<>(ans));
           return;
        }
        for(int i=index;i<S.length();i++)
        {
            if(palindrome(S,index,i))
            {
                ans.add(S.substring(index,i+1));
                solved(S,ans,myans,i+1);
                ans.remove(ans.size()-1);
            }
        }
    }
    static boolean palindrome(String S,int start,int end)
    {
     while(start<=end)
     {
         if(S.charAt(start)!=S.charAt(end))
         {
             return false;
         }
         start++;
         end--;
     }
     return true;
    }
};