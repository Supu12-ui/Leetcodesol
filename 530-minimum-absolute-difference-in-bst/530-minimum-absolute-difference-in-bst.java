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
    int temp=Integer.MAX_VALUE;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        
        cal(root);
        return min;
        
    }
    public void cal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        cal(root.left);
        if(temp!=Integer.MAX_VALUE)
        {
        min=Math.min(min,Math.abs(root.val-temp));
        }
        temp=root.val;
        cal(root.right);
        
    }
}