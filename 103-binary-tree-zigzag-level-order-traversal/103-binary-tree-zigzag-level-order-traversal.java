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
      post(root,ans,0);
      return ans;
    
        
    }
    void post(TreeNode root, List<List<Integer>> ans,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level>=ans.size())
        {
            List<Integer> temp=new ArrayList<>();
            ans.add(new ArrayList<>(temp));
        }
        if(level%2!=0)
        {
           ans.get(level).add(0,root.val);
        }
        else
        {
            ans.get(level).add(root.val);
        }
        post(root.left,ans,level+1);
        post(root.right,ans,level+1);
        
    }
    
    
    
}