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
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
        
    }
    boolean check(TreeNode rleft,TreeNode rright)
    {
        if(rleft==null &&rright==null)
        {
            return  true;
        }
         if(rleft==null || rright==null)
        {
            return false;
        }
        if(rleft.val!=rright.val)
        {
            return false;
        }
       
        boolean check1=check(rleft.left,rright.right);
        boolean check2=check(rleft.right,rright.left);
        if(check1&&check2)
        {
            return true;
        }
        return false;
    }
}