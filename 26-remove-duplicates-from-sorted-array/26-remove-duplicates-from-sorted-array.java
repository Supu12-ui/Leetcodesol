class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        int temp=0;
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==start && start==temp)
            {
                temp++;
                
            }
            if(nums[i]!=nums[start])
            {
              swap(nums,i,temp);
                temp++;
                start++;
                count++;
            }
        }
        return count;
        
    }
    public void swap(int []nums,int start,int end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}