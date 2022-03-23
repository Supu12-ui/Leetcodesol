class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        Stack<pair> st=new Stack<>();
        st.push(new pair(intervals[0][0],intervals[0][1]));
        for(int i=1;i<intervals.length;i++)
        {
            if(st.peek().end>=intervals[i][0])
            {
                st.peek().end=Math.max(st.peek().end,intervals[i][1]);
            }
            else
            {
                st.push(new pair(intervals[i][0],intervals[i][1]));
            }
        }
        int arr[][]=new int[st.size()][2];
        for(int i=st.size()-1;i>=0;i--)
        {
              arr[i][0]=st.peek().start;
               arr[i][1]=st.peek().end;
            st.pop();
            
        }
        return arr;
        
    }
}
class pair
{
    int start;
    int end;
    public pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}