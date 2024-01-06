class Job{
    int start_time;
    int end_time;
    int profit;
    Job (int start_time,int end_time,int profit)
    {
        this.start_time=start_time;
        this.end_time=end_time;
        this.profit=profit;
    }
}
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
      List<Job> job=new ArrayList<>();
        int n=startTime.length;
      for(int i=0;i<n;i++)
      {
          job.add(new Job(startTime[i],endTime[i],profit[i]));
      }
        int ans=0;
      Collections.sort(job, (a,b)->(a.end_time-b.end_time));
        TreeMap<Integer,Integer> map=new TreeMap<>();
       for(Job currjob: job)
       {
           Integer start_Time = map.floorKey(currjob.start_time);
           int maxProfit=(start_Time==null?0:map.get(start_Time));
           ans=Math.max(ans,maxProfit+currjob.profit);
           map.put(currjob.end_time,ans);
           
       }
      return ans;
    }
}