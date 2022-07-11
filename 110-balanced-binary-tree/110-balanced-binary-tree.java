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
    public boolean isBalanced(TreeNode root) {
      int val =solve(root);
        if(val==-1)
        {
            return false;
        }
        return true;
    }
    public int solve(TreeNode root)
    {
        if(root==null)
        {
          return 0;   
        }
        
        int l=solve(root.left);
        if(l==-1) return -1;
          
        int r=solve(root.right);
        if(r==-1) return -1;
        if(Math.abs(l-r)>1)
        {
           return -1; 
        }
        int ans=Math.max(l,r)+1;
        return ans;
        
    }
}