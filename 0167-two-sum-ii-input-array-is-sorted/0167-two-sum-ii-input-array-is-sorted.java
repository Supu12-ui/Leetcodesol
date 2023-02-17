class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            hm.put(numbers[i],i+1);
        }
        for(int i=0;i<numbers.length;i++)
        {
            int check=target-numbers[i];
            if(hm.containsKey(check))
            {
                ans[0]=i+1;
                ans[1]=hm.get(check);
                break;
            }
        }
        return ans;
    }
}