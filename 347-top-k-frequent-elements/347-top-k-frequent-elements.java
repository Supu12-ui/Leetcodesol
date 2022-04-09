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
 
   return p.value-this.value;
 
   
 }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    if(k==nums.length)
    {
    return nums;
    }
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
           System.out.println(p.key);
           idx++;
           
         }
        return ans;
    }
}