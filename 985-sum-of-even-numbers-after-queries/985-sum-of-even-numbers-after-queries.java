class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int l=queries.length;
    int r[]=new int[l];
    HashMap<Integer,Integer> map=new HashMap<>();
    int i;
    int sum=0;
    for(i=0;i<A.length;i++)
    {
        map.put(i,A[i]);
        if(A[i]%2==0)
            sum=sum+A[i];
    }
    
    
    for(i=0;i<l;i++)
    {
        int val=queries[i][0];
        int in=queries[i][1];
        int y=map.get(in);
        
        int u=y+val;
        map.put(in,u);
        
        if(u%2==0)
        {
            if(y%2==0)
                sum+=val;
            else
                sum+=u;
        }
        else
        {
            if(y%2==0)
            sum=sum-y;
        }
        
        r[i]=sum;
    }
    
    return r;
    }
}