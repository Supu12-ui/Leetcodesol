class MyHashMap {
ArrayList<pair> ans;
    public MyHashMap() {
     ans=new ArrayList<>();   
    }
    
    public void put(int key, int value) {
       for(int i=0;i<ans.size();i++)
       {
           pair p=ans.get(i);
           if(p.a==key)
           {
               p.b=value;
               return;
           }
       }
      pair p=new pair(key,value);
        ans.add(p);
    }
    
    public int get(int key) {
        for(int i=0;i<ans.size();i++)
        {
            pair p=ans.get(i);
            if(p.a==key)
            {
                return p.b;
            }
        }
        return -1;
        
    }
    
    public void remove(int key) {
        for(int i=0;i<ans.size();i++)
        {
            pair p=ans.get(i);
            if(p.a==key)
            {
                ans.remove(i);
            }
        }
        
    }
}
class pair
{
    int a;
    int b;
    public pair(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */