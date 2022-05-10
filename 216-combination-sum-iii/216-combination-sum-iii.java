class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]=new int[9];
        for(int i=0;i<9;i++)
        {
            arr[i]=i+1;
        }
        boolean vis[]=new boolean[9+1];
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> temp=new ArrayList<>();
        combination(arr,0,vis,ans,temp,n,k);
        return temp;
        
    }
    void combination(int arr[],int index,boolean [] vis,List<Integer> temp,List<List<Integer>> ans,int n,int k)
    {
      
        if(n==0 && temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(index>=arr.length || temp.size()>k || n<=0)
        {
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            int val=arr[i];
            if(vis[val]==false)
            {
          temp.add(arr[i]);
         vis[val]=true;
          combination(arr,i+1,vis,temp,ans,n-arr[i],k);
        temp.remove(temp.size()-1);
                vis[val]=false;
            }
        }
    }
}