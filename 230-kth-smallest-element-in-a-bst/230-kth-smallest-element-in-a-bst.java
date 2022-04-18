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
    ArrayList<Integer> ans=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
        {
            return -1;
        }
        solve(root,k);
        return ans.get(k-1);
    }
    public void solve(TreeNode root,int k)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left,k);
        ans.add(root.val);
        solve(root.right,k);
    }
}