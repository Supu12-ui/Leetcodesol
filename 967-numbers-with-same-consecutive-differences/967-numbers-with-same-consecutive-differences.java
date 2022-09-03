class Solution {
    ArrayList<Integer> ans=new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<10;i++)
        {
          dfs(i,n,k);  
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
    void dfs(int num,int n,int k)
    {
        if(countdigit(num)==n)
        {
            ans.add(num);
            return;
        }
        for(int i=0;i<10;i++)
        {
            int val=num%10;
            if(Math.abs(val-i)==k)
            {
                int ans=(num*10)+i;
                dfs(ans,n,k);
            }
        }
    }
    int countdigit(int n)
    {
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            count++;
        }
        return count;
    }
}