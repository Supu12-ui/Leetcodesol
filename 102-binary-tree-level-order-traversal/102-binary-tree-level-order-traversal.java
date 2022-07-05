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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
            Queue<TreeNode> q=new LinkedList<>();
            TreeNode temp=root;
        q.add(temp);
        while(q.size()!=0)
        {
            int size=q.size();
            List<Integer> t=new ArrayList<>();
            while(size!=0)
            {
               TreeNode value=q.remove();
               t.add(value.val);
              if(value.left!=null)
              {
                  q.add(value.left);
              }
               if(value.right!=null)
                {
                    q.add(value.right);
                }
                size--;
                
                
            }
            ans.add(t);
            
            
        }
        
        return ans;
        
        
    }
    
}