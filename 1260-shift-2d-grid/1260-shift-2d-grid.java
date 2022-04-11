class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       
        List<List<Integer>> nums=new ArrayList<>();
         
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                temp.add(grid[i][j]);
            }
        }
        //make reverse
        int aux[]=new int[k];
        int n=temp.size();
        k=k%n;
        if(n>=k)
        {
            
        
        for(int i=0;i<k;i++)
        {
            aux[i]=temp.get(n-k+i);
        }
        for(int i=n-k-1;i>=0;i--)
        {
            temp.set(i+k,temp.get(i));
        }
        for(int i=0;i<k;i++)
        {
            temp.set(i,aux[i]);
        }
        }
        int c=grid.length;
        int m=grid[0].length;
        int idx=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<temp.size();i++)
        {
          if(i-idx==m)
          {
              idx=i;
             
              nums.add(new ArrayList<>(ans));
              ans.clear();
              ans.add(temp.get(i));
          }
          else
          {
              ans.add(temp.get(i));
             
          }
        }
        nums.add(new ArrayList<>(ans));
        return nums;
            
        
    }
}