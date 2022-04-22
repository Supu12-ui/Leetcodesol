// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[V];
       for(int i=0;i<V;i++)
       {
           if(vis[i]==false)
           {
           Queue<pair> pq=new LinkedList<>();
           vis[i]=true;
            pair p=new pair(i,-1);
            pq.add(p);
          if(check(adj,vis,pq))
          {
              return true;
          }
           }
           
       }
       return false;
    }
    boolean check(ArrayList<ArrayList<Integer>> adj,boolean vis[],Queue<pair> pq)
    {
      while(pq.size()>0)
      {
         pair p=pq.poll();
         for(int j=0;j<adj.get(p.cur).size();j++)
         {
             int val=adj.get(p.cur).get(j);
             if(vis[val]==true && val!=p.prev)
             {
                 return true;
             }
            else if(vis[val]==false) 
             {
                 vis[val]=true;
                 pair p1=new pair(val,p.cur);
                 pq.add(p1);
             }
         }
        
      }
       return false;
    }
    class pair
    {
        int cur;
        int prev;
        public pair(int cur,int prev)
        {
          this.cur=cur;
          this.prev=prev;
        }
    }
}