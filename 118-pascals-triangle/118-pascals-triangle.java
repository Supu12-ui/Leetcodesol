class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<>();
        int count=0;
         for(int i=0;i<numRows;i++)
         {
            List<Integer> temp=new ArrayList<>();
           for(int j=0;j<=count;j++)
           {
               if(j==0)
               {
                  temp.add(1); 
               }
               else if(j==count)
               {
                   temp.add(1);
               }
               else
               {
                   int t1=al.get(i-1).get(j-1);
                   int t2=al.get(i-1).get(j);
                   int val=t1+t2;
                   temp.add(val);
                   
               }
           }
             count++;
             al.add(temp);
         }
        return al;
    }
}