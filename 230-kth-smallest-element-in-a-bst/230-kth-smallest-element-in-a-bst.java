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
    int count=0;
    int val=0;
    public int kthSmallest(TreeNode root, int k) {
    return solve(root,k);
    }
   
    public int solve(TreeNode root,int k)
    {
        if(root==null)
        {
            return 0;
        }
        
        solve(root.left,k);
        count++;
        if(count==k)
        {
           val=root.val;
            return val;
        }
        solve(root.right,k);
       return val;
    }
}