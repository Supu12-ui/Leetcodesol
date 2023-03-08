class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(piles[i],max);
        }
        int ans=Integer.MAX_VALUE;
        int start=1,end=max;
        while(start<end)
        {
            int mid=(start+end)/2;
            int temp=check(piles,mid);
           if(temp<=h)
            {
              
                end=mid;
            }
            else{
        
                start=mid+1;
            }
        }
        return start;
        
    }
    int check(int []piles,int point)
    {
        int count=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]%point==0)
            {
                count=count+(piles[i]/point);
            }
            else if(piles[i]%point==piles[i])
            {
                count++;
            }
            else
            {
                count=count+(piles[i]/point)+1;
            }
            
        }
        return count;
    }
}