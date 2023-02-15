class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        if(nums[0]>target)
        {
            return 0;
        }
        if(nums[end]<target)
        {
            return end+1;
        }
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else 
            {
                if(nums[mid-1]<target)
                {
                    return mid;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return end;
    }
}