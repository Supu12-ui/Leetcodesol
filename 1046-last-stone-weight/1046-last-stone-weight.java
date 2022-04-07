class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        while(pq.size()>1)
        {
            int val1=pq.remove();
            int val2=pq.remove();
            if(val1!=val2)
            {
                int sub=val1-val2;
                pq.add(sub);
            }
            else
            {
                continue;
            }
        }
        if(pq.size()==1)
        {
        int val=pq.poll();
            return val;
        }
        return 0 ;
        
    }
}