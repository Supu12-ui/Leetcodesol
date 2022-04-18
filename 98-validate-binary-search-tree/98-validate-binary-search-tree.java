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
    public boolean isValidBST(TreeNode root) {
        
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean check(TreeNode root,long min,long max)
    {
        if(root==null)
        {
            return true;
        }
      
        boolean l=check(root.left,min,root.val);
        if(root.val>=max||root.val<=min)
        {
            return false;
        }
        
        boolean r=check(root.right,root.val,max);
        // if(root.val<=min)
        // {
        //     return false;
        // }
        
        return l&&r;
    }
}