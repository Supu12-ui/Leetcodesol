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
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int lh=leftheight(root);
        int rh=rightheight(root);
        if(lh==rh)
        {
            return (int)Math.pow(2,lh)-1;
        }
        else
        {
            int l=countNodes(root.left);
            int h=countNodes(root.right);
            return 1+l+h;
        }
    }
    public int leftheight(TreeNode root)
    {
        int count=0;
        while(root!=null)
        {
            root=root.left;
            count++;
        }
        return count;
    }
    public int rightheight(TreeNode root)
    {
        int count=0;
        while(root!=null)
        {
            root=root.right;
            count++;
        }
        return count;
    }
}