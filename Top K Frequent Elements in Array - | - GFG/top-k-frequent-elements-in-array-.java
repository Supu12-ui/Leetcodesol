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
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class pair implements Comparable<pair>
{
 int key;
 int value;
 public pair(int key,int value)
 {
   this.key=key;
   this.value=value;
 }
 public int compareTo(pair p)
 {
   if(this.value!=p.value)
   {
   return p.value-this.value;
   }
   else
   {
       return p.key-this.key;
   }
 
   
 }
}
class Solution {
    public int[] topK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int key:hm.keySet())
        {
          pair p=new pair (key,hm.get(key));
          pq.add(p);
        }
        int ans[]=new int[k];
        int idx=0;
         while(pq.size()+k>=k&&idx<ans.length)
         {
         
           pair p=pq.poll();
           ans[idx]=p.key;
          // System.out.println(p.key);
           idx++;
           
         }
        return ans;
    }
}