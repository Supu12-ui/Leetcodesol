class Solution {
    public int findDuplicate(int[] nums) {
        int min=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int temp[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++)
        {
            int index=nums[i]-min;
            temp[index]=temp[index]+1;
        }
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>1)
            {
                return min+i;
            }
        }
        return -1;
    }
}