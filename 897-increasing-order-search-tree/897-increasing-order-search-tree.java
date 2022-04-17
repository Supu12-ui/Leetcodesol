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
    TreeNode prev=null;
    public TreeNode increasingBST(TreeNode root) {
       flatten(root);
       return prev; 
    }
    void flatten(TreeNode root)
    {
         if(root==null)
        {
            return;
        }
       flatten(root.right);
        root.right=prev;
        prev=root;
        flatten(root.left);
         root.left=null;
      
        
    }
 
}