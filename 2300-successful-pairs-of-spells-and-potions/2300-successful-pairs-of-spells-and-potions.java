class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int ans[]=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            int start=0;
            int end=m-1;
            long temp=spells[i];
            while(start<=end)
            {
                int mid=(start+end)/2;
                if((potions[mid]*temp)<success)
                {
                   //ans[i]++; 
                   start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            ans[i]=(m-start);
        }
        return ans;
    }
}