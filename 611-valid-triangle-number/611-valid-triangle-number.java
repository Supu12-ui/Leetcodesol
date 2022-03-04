class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int m=1000000007;
     int count=0;
        int n=nums.length;
        for(int i=n-1;i>1;i--)
        {
            int start=0;
            int end=i-1;
            while(start<end)
            {
                if(((nums[start]+nums[end])>nums[i]))
                {
                 
                    
                    count+=end-start;
                    count=count%m;
                    end--;
                }
                else
                {
                   
                start++;
                }
            }
           
        }
        return count;
    }
}