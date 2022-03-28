// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans=new ArrayList<>();
        cal(S,0,S.length(),ans);
        Collections.sort(ans);
        return ans;
        
    }
    void cal(String S,int start,int end,List<String> ans)
    {
        if(start>=end)
        {
           
            ans.add(S);
            return;
        }
       
        for(int i=start;i<end;i++)
        {
            S=swap(S,i,start);
            
            cal(S,start+1,end,ans);
            S=swap(S,i,start);
        }
        
    }
    String swap(String S,int start,int end)
    {
        char c[]=S.toCharArray();
        char temp=c[end];
        c[end]=c[start];
        c[start]=temp;
       String str=String.valueOf(c);
       return str;
    }
}