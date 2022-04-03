class Solution {
    void swap(int arr[],int l,int h)
    {
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
    }
    void reverse(int arr[],int l,int h)
    {
        while(l<h)
        {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(nums,0,nums.length-1);
        }
        else
        {
        int prev=index;
        for(int i=index+1;i<nums.length;i++)
        {
            if(nums[i]>nums[index-1]&&nums[i]<=nums[prev])
            {
                prev=i;
            }
        }
        
            swap(nums,index-1,prev);
            reverse(nums,index,nums.length-1);
        
        }
    }
}