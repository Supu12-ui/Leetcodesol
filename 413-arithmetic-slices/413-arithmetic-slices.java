class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
       int slices = 0;
	for (int i = 2, prev = 0; i < nums.length; i++)
		slices += (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) ? 
				  ++prev : 
				  (prev = 0);
	return slices;
        
    }
    void cal(int nums[],ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> myans,int index)
    {
        if(index==nums.length)
        {
            return;
        }
        ans=new ArrayList<>();
        for(int k=index;k<nums.length;k++)
        {
            ans.add(nums[k]);
            if(ans.size()>=3)
            {
                int val=Math.abs(ans.get(1)-ans.get(0));
                for(int i=2;i<ans.size();i++)
                {
                  if(Math.abs(ans.get(i-1)-ans.get(i))==val)
                  {
                      myans.add(new ArrayList<>(ans)); 
                  }
                }
               
            }
           
           // ans.remove(ans.size()-1);
        }
         cal(nums,ans,myans,index+1);
    }
}