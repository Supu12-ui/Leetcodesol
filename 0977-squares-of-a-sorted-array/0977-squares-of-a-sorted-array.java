class Solution {
    public int[] sortedSquares(int[] nums) {
        int end=nums.length-1;
        int start=0;
        int result[]=new int[nums.length];
        for(int i=end;i>=0;i--)
        {
            if(Math.abs(nums[start])<Math.abs(nums[end]))
            {
                result[i]=nums[end]*nums[end];
                end--;
            }
            else
            {
                result[i]=nums[start]*nums[start];
                start++;
            }
        }
        return result;
    }
    
}