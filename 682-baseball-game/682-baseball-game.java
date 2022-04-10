class Solution {
    public int calPoints(String[] ops) {
         ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<ops.length;i++)
        {
         if(ops[i].equals("D"))
         {
            int value=ans.get(ans.size()-1);
             value=value*2;
             ans.add(value);
             
         }
            else if(ops[i].equals("C"))
            {
                int value=ans.remove(ans.size()-1);
            }
            else if(ops[i].equals("+"))
            {
                int val1=ans.get(ans.size()-1);
                int val2=ans.get(ans.size()-2);
                int sum=val1+val2;
                ans.add(sum);
            }
            else 
            {
                int value=Integer.valueOf(ops[i]);
                ans.add(value);
            }
        }
        int sum=0;
        for(int i=0;i<ans.size();i++)
        {
            sum=sum+ans.get(i);
        }
        return sum;
        
    }
}