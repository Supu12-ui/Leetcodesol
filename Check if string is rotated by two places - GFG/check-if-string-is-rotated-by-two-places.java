// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length()!=str2.length())
        {
            return false;
        }
        int n=str2.length();
        String st1=str2.substring(n-2,n);
        String ch1=str1.substring(0,2);
        if(ch1.equals(st1))
        {
        String st2=str2.substring(0,n-2);
        String ans=st1+st2;
        //System.out.print(ans);
        if(ans.equals(str1))
        {
            return true;
        }
        }
        String st2=str1.substring(n-2,n);
        String ch2=str2.substring(0,2);
        if(ch2.equals(st2))
        {
         st2=str2.substring(2,n);
        String ans=st2+ch2;
        //System.out.print(ans);
        if(ans.equals(str1))
        {
            return true;
        }
        }
        
        return false;
    }
    
}