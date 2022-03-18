class Solution {
    public int maximumTop(int[] nums, int k) {
        int n=nums.length;
        if(k==0)
        {
            if(n==0)
            {
                return -1;
            }
            return nums[0];
        }
        if(k==1)
        {
            if(n>=2){return nums[1];}
            return -1;
        }
        if(n==1)
        {
            if(k%2==0)
            {
              return nums[0];  
            }
            return -1;
        }
        int max=0;
        for(int i=0;i<Math.min(k-1,n);i++)
        {
            max=Math.max(max,nums[i]);
        }
        if(k<n)
        {
            max=Math.max(max,nums[k]);
        }
        return max;
        
    }
}