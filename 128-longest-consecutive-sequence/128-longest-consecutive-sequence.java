class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)
            {
                count++;
                System.out.println(nums[i]+" "+nums[i-1]+" "+count);
            }
            else if(nums[i]==nums[i-1])
            {
               continue;
            }
            else
            {
                //max=Math.max(max,count+1);
                count=0;
            }
            max=Math.max(max,count+1);
        }
        max=Math.max(max,count+1);
       
        return max;
    }
}