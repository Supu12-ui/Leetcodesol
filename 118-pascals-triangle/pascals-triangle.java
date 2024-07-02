class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> ans =new ArrayList<>();
     
      for(int i=0;i<numRows;i++)
      {
          List<Integer> res = new ArrayList<>();
          if(i==0)
          {
              res.add(1);
          }
          else if (i==1)
          {
             res.add(1);
              res.add(1);
          }
          else{
              int size = ans.get(i-1).size();
              res.add(1);
              for(int j=1;j<size;j++)
              {
                  int k = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                  res.add(k);
              }
              res.add(1);
             
          }
          ans.add(res);
      }
        return ans;
    }
}