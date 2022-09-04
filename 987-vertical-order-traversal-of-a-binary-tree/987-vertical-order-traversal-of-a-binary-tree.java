class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        cal c=new cal();
       return c.ver(root);
        
    }
}
class pair  implements Comparable<pair>
{
   int row;
   int col;
   TreeNode root;
   public pair(TreeNode root,int row,int col)
   {
       this.row=row;
       this.col=col;
       this.root=root;
   }
    public int compareTo(pair pq)
    {
         if (this.row == pq.row)
            return this.root.val - pq.root.val;
            
            return this.row - pq.row;
    }

}
class cal
{
    List<List<Integer>> ver(TreeNode root)
    {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        TreeMap<Integer,ArrayList<Integer> > hm=new TreeMap<>();
        pair p=new pair(root,0,0);
      //  System.out.println(p.root.data);
        pq.add(p);
        while(pq.size()>0)
        {
            pair temp=pq.peek();
            pq.poll();
            if(!hm.containsKey(temp.col)) hm.put(temp.col,new ArrayList<>());
            hm.get(temp.col).add(temp.root.val);
            if(temp.root.left!=null)
            {
                pq.add(new pair(temp.root.left,temp.row+1,temp.col-1));

            }
            if(temp.root.right!=null)
            {
                pq.add(new pair(temp.root.right,temp.row+1, temp.col+1));

            }
        }
         List<List<Integer>> ans=new ArrayList<>();
        for(int key:hm.keySet())
        {
            //Collections.sort(hm.get(key));
         ans.add(new ArrayList<>(hm.get(key)));
        }

     return ans;
    }

}