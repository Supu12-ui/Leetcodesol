class Solution {
    public int maxProfit(int[] prices) {
        int i=prices.length-2;
        int nums[]=new int[prices.length];
        nums[prices.length-1]=prices[prices.length-1];
        int max=0;
        while(i>=0)
        {
          int val=nums[i+1]-prices[i];
            if(val<=0)
            {
                nums[i]=prices[i];
            }
            else
            {
                nums[i]=nums[i+1];
            }
            System.out.println(nums[i]);
          max=Math.max(max,val);
        i--;
        }
        return max;
    }
}