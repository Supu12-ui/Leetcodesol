class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int n=intervals.length;
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(n==1)
        {
            return intervals;
        }
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);
        ans.add(new ArrayList<>(temp));
        int j=1;
        for(int i=1;i<n;i++)
        {
            if(ans.get(j-1).get(1)<intervals[i][0])
            {
               ArrayList<Integer> t=new ArrayList<>();
                t.add(intervals[i][0]);
                t.add(intervals[i][1]);
                ans.add(new ArrayList<>(t));
                j++;
            }
            else
            {
                if(ans.get(j-1).get(1)>intervals[i][1])
                {
                    continue;
                }
                else
                {
                ans.get(j-1).add(1,intervals[i][1]);
                }
            }
        }
        int val[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            for(int k=0;k<2;k++)
            {
                val[i][k]=ans.get(i).get(k);
            }
        }
        return val;
    }
}