class Solution {
    public int maxProduct(String[] words) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<words.length;i++)
        
        {
            String str1=words[i];
            for(int j=i+1;j<words.length;j++)
            {
              String str2=words[j];
                if(check(str1,str2))
                {
                    int val1=str1.length()*str2.length();
                    max=Math.max(max,val1);
                    
                }
            }
        }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max;
    }
    boolean check(String str1,String str2)
    {
      HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(hm.containsKey(ch))
            {
                return false;
            }
        }
        return true;
    }
}