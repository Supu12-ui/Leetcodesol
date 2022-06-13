class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int two=nums.length-1;
        int temp=0;
        while(temp<=two)
        {
            if(nums[temp]==0)
            {
              swap(nums,temp,zero);
                temp++;
                zero++;
            }
            else if(nums[temp]==2)
            {
                swap(nums,temp,two);
                //temp++;
                two--;
            }
            else
            {
                temp++;
            }
        }
    }
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}