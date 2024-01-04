class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int val=hm.get(nums[i]);
                val++;
                hm.put(nums[i],val);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int temp=0;
        int min1=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> enjoy: hm.entrySet())
        {
          int key=enjoy.getKey();
          int value=enjoy.getValue();
          int ans=0;
          if(value==1)
          {
              return -1;
          }
          int count=value/3;
          if(value%3!=0)
          {
              count++;
          }
          temp+=count;
        }
        return temp;
    }
}