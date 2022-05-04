class Solution {
    public int maxOperations(int[] nums, int k) {
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
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
          int val=k-nums[i];
            if(val==nums[i])
            {
               if(hm.containsKey(val) && hm.get(val)>=2)
               {
                int a=hm.get(nums[i]);
                a=a-2;
                hm.put(nums[i],a);
                count++;
               }
            }
          else if(hm.get(nums[i])>0 && hm.containsKey(val) && hm.get(val)>0)
           {
               int b= hm.get(nums[i]);
               b=b-1;
               hm.put(nums[i],b);
              
               int a=hm.get(val);
                a=a-1;
               hm.put(val,a);
               count++;
               
           }
           
        }
        return count;
    }
}