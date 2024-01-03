class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> temp= new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();
        int n = nums.length;
        int max=Integer.MAX_VALUE;
       
        int k=0;
        for(int i=0;i<n;i++)
        {
           if(map.containsKey(nums[i]))
           {
               int val=map.get(nums[i]);
               val++;  
               map.put(nums[i],val);
               max=Math.max(val,max);
           }
           else
           {
               map.put(nums[i],1);
           }
        }
     int i=0;
     while(!map.isEmpty())
     {
       temp.add(new ArrayList<>());
        List<Integer> erase=new ArrayList<>();
        for(Map.Entry<Integer,Integer> target: map.entrySet())
        {
         int key=target.getKey();
         int val=target.getValue();
         temp.get(i).add(key);
         val--;
         if(val<=0)
         {
             erase.add(key);
             continue;
         }
         map.put(key,val);
        }
         for(int j=0;j<erase.size();j++)
         {
             int val=erase.get(j);
             map.remove(val);
         }
         i++;
         System.out.println(temp);
         
     }
      return temp;  
    }
}