/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
    
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        int count=1;
        while(pq.size()>0)
        {
          int size=pq.size();
          List<Integer> temp=new ArrayList<>();
          for(int i=0;i<size;i++)
          {
              TreeNode t=pq.remove();
              
              if(count%2==0)
              {
                temp.add(0,t.val); 
              }
              else
              {
               temp.add(t.val);   
              }
              if(t.left!=null)
              {
                  pq.add(t.left);
              }
              
              if(t.right!=null)
              {
                  pq.add(t.right);
              }
             
          }
            count++;
            ans.add(new ArrayList<>(temp));
            
        }
        return ans;
    }
    
    
}