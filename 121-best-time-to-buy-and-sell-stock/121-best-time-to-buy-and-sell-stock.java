class Solution {
    public int maxProfit(int[] prices) {
        int i=prices.length-2;
        int nums[]=new int[prices.length];
        nums[prices.length-1]=prices[prices.length-1];
        int max=0;
        int temp=prices[prices.length-1];;
        while(i>=0)
        {
          int val=temp-prices[i];
            if(val<=0)
            {
                temp=prices[i];
            }
            // else
            // {
            //     nums[i]=nums[i+1];
            // }
            // System.out.println(nums[i]);
          max=Math.max(max,val);
        i--;
        }
        return max;
    }
}