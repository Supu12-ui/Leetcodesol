class Solution {
    public int[] sortedSquares(int[] nums) {
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
            //System.out.println(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int start=i;
            end=nums.length-1;
            while(start<end)
            {
              if(nums[start]>nums[end])
              {
                  int temp=nums[start];
                  nums[start]=nums[end];
                  nums[end]=temp;
                  end--;
              }
              else
              {
                  end--;
              }
            }
        }
        return nums;
    }
    
}