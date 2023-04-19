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
    public int longestZigZag(TreeNode root) {
        int res=0;
         boolean left=true;
        rec(root,left,res);
        rec(root,false,res);
        return max;
    }
    public void rec(TreeNode root,boolean left,int res)
    {
        if(root==null)
        {
            return;
        }
        max=Math.max(max,res);
        if(left==true)
        {
            rec(root.left,false,res+1);
            rec(root.right,true,1);
        }
        else{
            rec(root.right,true,res+1);
            rec(root.left,false,1);
        }
        
        
    }
}