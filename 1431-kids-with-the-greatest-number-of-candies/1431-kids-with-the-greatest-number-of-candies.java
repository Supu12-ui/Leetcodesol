class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=-1;
         for(int i=0;i<candies.length;i++)
         {
             if(max<candies[i])
             {
                 max=candies[i];
             }
         }
        for(int i=0;i<candies.length;i++)
        {
            int sum=candies[i]+extraCandies;
            if(sum>=max)
            {
                ans.add(true);
                
            }
            else
            {
                ans.add(false);
            }
            
        }
        return ans;
    }
}