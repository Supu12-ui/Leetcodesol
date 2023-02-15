class Solution {
    public int[] sortedSquares(int[] nums) {
        int end=nums.length-1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
            pq.add(nums[i]);
           
        }
        int i=0;
        while(pq.size()>0)
        {
            int val=pq.poll();
            nums[i]=val;
            i++;
        }
        
        return nums;
    }
    
}