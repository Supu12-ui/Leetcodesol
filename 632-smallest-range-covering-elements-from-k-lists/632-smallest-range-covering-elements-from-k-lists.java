class pair implements Comparable <pair>{
    int idx;
    int numidx;
    int val;
    pair(){}
    pair(int idx,int numidx,int val)
    {
        this.idx=idx;
        this.numidx=numidx;
        this.val=val;
    }
    public int compareTo(pair p)
    {
        return this.val-p.val;
    }
}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        
        PriorityQueue<pair> pq1=new PriorityQueue<>(); //min
        PriorityQueue<pair> pq2=new PriorityQueue<>(Collections.reverseOrder()); //max
        int low=0;
        int high=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            pair temp=new pair(i,0,nums.get(i).get(0));
            pq1.add(temp);
            pq2.add(temp);
        }
        while(pq1.size()!=0)
        {
            pair temp1=pq1.remove();
            int min_val=temp1.val;
            pair temp2=pq2.peek();
            int max_val=temp2.val;
             int check=max_val-min_val;
            if(check<min)
            {
                min=check;
                low=min_val;
                high=max_val;
            }
            int new_idx=temp1.idx;
            int nidx=temp1.numidx;
            nidx=nidx+1;
            if(nidx<nums.get(new_idx).size())
            {
                int value=nums.get(new_idx).get(nidx);
                pair temp=new pair(new_idx,nidx,value);
                pq1.add(temp);
                pq2.add(temp);
            }
            else
            {
                break;
            }
            
            
        }
        int ar[]=new int[2];
        ar[0]=low;
        ar[1]=high;
        return ar;
        
    }
}