class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE-1;
        for(int i=0;i<nums.length-2;i++)
        {
            int start=i+1;
            int end=nums.length-1;
          while(start<end)
          {
              int sum=nums[i]+nums[start]+nums[end];
              if(Math.abs(target-sum)<Math.abs(target-ans))
              {
                  ans=sum;
              }
              if(sum<target)
              {
                  start++;
              }
              else
              {
                  end--;
              }
          }
            
        }
        return ans==Integer.MIN_VALUE||ans==Integer.MAX_VALUE-1?target:ans;
       
        
    }
}