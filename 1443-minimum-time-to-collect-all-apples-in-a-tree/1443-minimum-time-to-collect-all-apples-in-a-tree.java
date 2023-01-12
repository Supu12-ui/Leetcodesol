class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
      create(arr,n,edges);
        int val=solve(0,arr,hasApple,0);
        return val;
    }
    void create(ArrayList<ArrayList<Integer>> arr,int n,int [][]edges)
    {
        int size=edges.length-1;
        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++)
        {
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(arr);
    }
    int solve(int index,ArrayList<ArrayList<Integer>> arr,List<Boolean> hasApple,int parent)
    {
        int total=0;
        for(int nbr:arr.get(index))
        {
            if(nbr==parent)
                continue;
            total+=solve(nbr,arr,hasApple,index);
        }
        if(index!=0 && (hasApple.get(index)==true || total>0))
            total+=2;
            return total;
    }

}