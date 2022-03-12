// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
       Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(c==')' || c=='}'||c==']')
            {
              if(check(st,c)==true)
              {
                  st.pop();
              }
              else
              {
                  return false;
              }
            }
            
        }
        if(st.size()>0)
        {
            return false;
        }
        return true;
    }
    static boolean check(Stack<Character> s,char c)
    {
        if(s.isEmpty())
        {
            return false;
        }
        if(c=='}'&&(s.peek()=='['||s.peek()=='('))
        {
            return false;
        }
        else if(c==']'&& (s.peek()=='('||s.peek()=='{'))
        {
            return false;
        }
        else if(c==')' && (s.peek()=='['||s.peek()=='{'))
        {
            return false;
        }
        else
        {
            return true;
        }
    } 
    
} 