class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxheap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxheap.addAll(map.keySet());
        String ans="";
        while(maxheap.size()>1)
        {
            char current=maxheap.remove();

            char prev=maxheap.remove();
            ans=ans+current;
            ans=ans+prev;
            map.put(current,map.get(current)-1);
                map.put(prev,map.get(prev)-1);
            if(map.get(current)>0)
            {
                maxheap.add(current);
                
            }
            if(map.get(prev)>0)
            {
                maxheap.add(prev);
            }
            
        }
        if(!maxheap.isEmpty())
        {
            char last=maxheap.remove();
            if(map.get(last)>1)
            {
                return "";
            }
            ans=ans+last;
        }
        return ans;
        
        
    }
}