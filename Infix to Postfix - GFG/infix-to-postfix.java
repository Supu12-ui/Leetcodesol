// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().infixToPostfix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to convert an infix expression to a postfix expression.
	public static String infixToPostfix(String exp) 
	{
	 ArrayList<Character> ans=new ArrayList<>();
    Stack<Character> opert=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char c=exp.charAt(i);
        if(c=='(')
        {
            opert.push(c);
        }
        else if(c>='0' && c<='9'||c>='a' && c<='z'||c>='A' && c<='Z')
        {
           ans.add(c);
        }
        else if(c==')')
        {
            while(opert.peek()!='(')
            {
                char ch=opert.pop();
               ans.add(ch);
            }
            opert.pop();
        }
        else 
        {
            if(c=='/'||c=='+'||c=='-'||c=='*'||c=='^')
            {
                while(opert.size()>0 && opert.peek()!='('&& c!='^'&& precedence(c)<=precedence(opert.peek()))
                {
                    char ch=opert.pop();
                    ans.add(ch);
                }
                opert.push(c);
            }
        }
    }
    while(opert.size()!=0)
    {
        char ch=opert.pop();
        ans.add(ch);
    }
   String temp="";
   for(int i=0;i<ans.size();i++)
   {
       temp=temp+ans.get(i);
   }
   return temp;
    
 }
 static int precedence(char c)
 {
     if(c=='+'||c=='-')
     {
         return 1;
     }
     else if(c=='*'||c=='/')
     {
     return 2;
     }
     else
     {
         return 3;
     }
 }
 

}