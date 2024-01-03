class Solution {
    public int numberOfBeams(String[] bank) {
       List<Integer> ans=new ArrayList<>();
       for(int i=0;i<bank.length;i++)
       {
           int count=0;
          for(int j=0;j<bank[i].length();j++)
          {
              if(bank[i].charAt(j)=='1')
              {
                  count++;
              }
          }
          if(count!=0)
          {
              ans.add(count);
          }
       }
    int ans1=0;
        if(ans.size()==0 || ans.size()==1)
        {
            return 0;
        }
        for(int i=1;i<ans.size();i++)
        {
         ans1+=ans.get(i-1)*ans.get(i);   
        }
        System.out.println(ans);
        return ans1;
    }
}