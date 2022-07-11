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
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        
        int ans=solve(root);
        return max;
    }
    int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=solve(root.left);
        int rh=solve(root.right);
        max=Math.max(max,lh+rh);
        int val=1+Math.max(lh,rh);
        return val;
    }
}