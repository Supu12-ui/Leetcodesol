/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     void cal(TreeNode root,HashMap<TreeNode,TreeNode> hm)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0)
        {
            TreeNode temp=q.poll();
            if(temp.left!=null)
            {
                q.add(temp.left);
                hm.put(temp.left,temp);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
                hm.put(temp.right,temp);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> hm=new HashMap<>();
        cal(root,hm);
        Queue<TreeNode> q=new LinkedList<>();
       HashSet<TreeNode> vist=new HashSet<>();
        q.add(target);
        vist.add(target);
           int dist=0;
        while(q.size()!=0)
        {
            int size=q.size();
         
            if(dist==k)
            {
                break;
            }
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
               if(temp.left!=null && !vist.contains(temp.left))
               {
                  q.add(temp.left);
                  vist.add(temp.left);
               }
                if(temp.right!=null && !vist.contains(temp.right))
                {
                    q.add(temp.right);
                    vist.add(temp.right);
                }
                TreeNode check=hm.get(temp);
                if( check!=null &&!vist.contains(check))
                {
                    q.add(check);
                    vist.add(check);
                }
            }
            dist++;
        }
       List<Integer> l=new ArrayList<>();
        while(q.size()>0)
        {
            TreeNode temp=q.poll();
            int value=temp.val;
            l.add(value);
            
        }
        return l;


    }
}