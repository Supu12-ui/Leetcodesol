class Solution {
    public int partitionString(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put(s.charAt(0),0);
        int ans=0;
        for(int i=1;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                ans++;
                hm.clear();
                hm.put(s.charAt(i),0);
            }
            else
            {
                hm.put(s.charAt(i),0);
            }
        }
        
        return ans+1;
    }
}