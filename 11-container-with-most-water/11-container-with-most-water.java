class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            int width=right-left;
            int high=Math.min(height[left],height[right]);
            int area=width*high;
            max=Math.max(max,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
        
    }
}