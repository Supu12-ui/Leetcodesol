/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
     TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        solve(original,cloned,target);
        return ans;
    }
    public final void solve(final TreeNode original,final TreeNode cloned,final TreeNode target)
    {
     if(original==null && cloned==null)
     {
         return;
     }
     if(original.val==target.val && cloned.val==target.val)
     {
         ans=cloned;
         return;
     }
     solve(original.left,cloned.left,target);
        solve(original.right,cloned.right,target);
        return;
        
        
        
    }
}