class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int ans=0;
        int j=m-1;
        for(int i=n-1;i>=0 && j>=0;i--)
        {
           if(s[j]>=g[i])
           {
               ans++;
               j--;
           }
        }
        return ans;
    }
}