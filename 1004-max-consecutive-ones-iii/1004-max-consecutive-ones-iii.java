class Solution {
    public int longestOnes(int[] A, int k) {
           int i=0;
        int j=0;
        int max=0;
        int count=0;
        while(i<A.length)
        {
          if(A[i]==0)
          {
             count++;
             while(count>k)
             {
                 if(A[j]==0)
                 {
                     count--;
                 }
                 j++;
             }
          }
          max=Math.max(max,(i-j)+1);
          i++;

        }
        return max;
    }
}