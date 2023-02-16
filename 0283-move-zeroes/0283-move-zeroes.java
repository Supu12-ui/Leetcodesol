class Solution {
    public void moveZeroes(int[] nums) {
       int end=nums.length;
        int start=0;
        int temp=1;
        while(temp<end && start<end)
        {
            if(nums[start]==0 && nums[temp]==0)
            {
                temp++;
            }
            else if(nums[start]==0 && nums[temp]!=0)
            {
                int temp1=nums[start];
                nums[start]=nums[temp];
                nums[temp]=temp1;
                start++;
                temp++;
            }
            else if(nums[start]!=0)
            {
                start++;
                temp++;
            }
        }
    }
}