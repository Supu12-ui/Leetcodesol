class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
      ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         int start=intervals[0][0];
        int end=intervals[0][1];
        ArrayList<Integer> a1=new ArrayList<>();
        ans.add(a1);
        a1.add(start);
        a1.add(end);
        int k=1;
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0]<=end)
            {
              int max=Math.max(intervals[i][1],end);
                ans.get(k-1).set(1,max);
                end=max;
            }
            else if(end<intervals[i][0])
            {
                ArrayList<Integer> a2=new ArrayList<>();
                ans.add(a2);
                 a2.add(intervals[i][0]);
                a2.add(intervals[i][1]);
                end=intervals[i][1];
                k++;
            }
        }
        System.out.println(ans);
        int a[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            
            for(int j=0;j<2;j++)
            {
                int val1=ans.get(i).get(j);
               
                a[i][j]=val1;
                
            }
        }
        return a;
    }
}