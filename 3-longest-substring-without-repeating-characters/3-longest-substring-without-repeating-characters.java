class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0;
        int length=0;
        int max=Integer.MIN_VALUE;
        HashSet<Character> hs=new HashSet<>();
        while(l<n && r<n)
        {
            char ch1=s.charAt(r);
            if(hs.contains(ch1))
            {
                
                hs.clear();
                
                l++;
                r=l;
                char ch2=s.charAt(l);
                hs.add(ch2);
                
                
            }
            else
            {
                hs.add(ch1);
            }
            int val=r-l+1;
            max=Math.max(max,val);
            r++;
            
            
        }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
       return max; 
    }
}