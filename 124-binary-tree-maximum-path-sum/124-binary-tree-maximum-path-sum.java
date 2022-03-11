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
    public int maxPathSum(TreeNode root) {
          int sum[]=new int[1];
        if(root.left==null && root.right==null)
        {
            return root.val;
        }
        sum[0]=Integer.MIN_VALUE;
         check(root,sum);
        return sum[0];
        
    }
    int check(TreeNode root,int sum[])
    {
        if(root==null)
        {
            return 0;
        }
        int lh=Math.max(0,check(root.left,sum));
        int rh=Math.max(0,check(root.right,sum));
        sum[0]=Math.max(sum[0],lh+rh+root.val);
        int ans=Math.max(lh,rh)+root.val;
        return ans;
        
    }
}