class KthLargest {
    private PriorityQueue<Integer> pq;
    private int size;
    public KthLargest(int k, int[] nums) {
        this.pq=new PriorityQueue<>();
        this.size=k;
       // System.out.println(size);
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        while(pq.size()>size)
        {
            pq.poll();
        }
        
    }
    
    public int add(int val) {
        pq.add(val);
        //System.out.println(size);
        while(pq.size()>size)
        {
            pq.poll();
            //System.out.println(pq);
        }
        
        int value=pq.peek();
        return value;
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */