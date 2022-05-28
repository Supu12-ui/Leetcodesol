class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int temp=n*(n+1);
        temp=temp/2;
        int temp1=0;
        for(int i=0;i<nums.length;i++)
        {
            temp1=temp1+nums[i];
        }
        int ans=temp-temp1;
        return ans;
    }
}