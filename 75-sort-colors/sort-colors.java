class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int first =0;
        int temp =0;
        int last=n-1;
        while(temp<=last)
        {
            if(nums[temp]==0)
            {
                int k= nums[temp];
                nums[temp]= nums[first];
                nums[first]=k;
                first++;
                temp++;
            }
            else if(nums[temp]==1)
            {
                temp++;
            }
            else
            {
                int k = nums[temp];
                nums[temp]= nums[last];
                nums[last]=k;
                last--;
               
            }
        }
        
    }
}