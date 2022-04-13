// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character,Integer> hm= new HashMap<>();
        
        Queue<Character> q=new LinkedList<>();
        q.add(A.charAt(0));
        String ans=""+A.charAt(0);
        hm.put(A.charAt(0),1);
        for(int i=1;i<A.length();i++)
        {
            char ch=A.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            else
            {
                hm.put(ch,1);
            }
            if(q.size()!=0 && hm.get(q.peek())>1)
            {
            while(q.size()!=0 && hm.get(q.peek())>1)
            {
                q.poll();
            }
            }
            else if(hm.get(ch)<=1)
            {
                q.add(ch);
            }
            if(q.size()==0)
            {
                ans+='#';
            }
            else
            {
                ans+=q.peek();
            }
            
            
        }
        return ans;
    }
}