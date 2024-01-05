class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && dp[j]+1>dp[i])
                {
                    dp[i]=dp[j]+1;
                }
            }
            System.out.println(dp[i]);
            max=Math.max(max,dp[i]);
        }
        return max;
        
    }
}