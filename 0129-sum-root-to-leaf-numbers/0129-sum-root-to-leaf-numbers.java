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
    int sum=0;
    public int sumNumbers(TreeNode root) {
       
        rec(root,"");
        
        return sum;
    }
    public void rec(TreeNode root,String temp)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            temp=temp+Integer.toString(root.val);
            int num=Integer.parseInt(temp);
            sum=sum+num;
            return;
        }
        
        rec(root.left,temp+Integer.toString(root.val));
        rec(root.right,temp+Integer.toString(root.val));
    }
}