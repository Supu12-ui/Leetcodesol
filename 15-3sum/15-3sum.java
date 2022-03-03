class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        HashSet<List<Integer>> hs=new HashSet<>();
      Arrays.sort(a);
        for(int i=0;i<a.length-2;i++)
        {
            int start=i+1;
            int end=a.length-1;
            
            while(start<end)
            {
                long sum=(long)a[i]+(long)a[start]+(long)a[end];
                if(sum==0)
                {
                    List<Integer> arr=new ArrayList<>();
                    arr.add(a[i]);
                    arr.add(a[start]);
                    arr.add(a[end]);
                    hs.add(new ArrayList<>(arr));
                    start++;
                    end--;
                }
                
               else  if(sum<0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }
       List<List<Integer>> ans=new ArrayList<>(hs);
       return ans;   
        
    }
}