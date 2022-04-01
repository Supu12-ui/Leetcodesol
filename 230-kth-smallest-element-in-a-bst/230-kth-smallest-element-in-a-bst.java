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
       cal(root,k);
       int val= ans.get(k-1);
        return val;
    
    }
   void cal(TreeNode root,int k)
   {
       if(root==null)
       {
           return;
       }
       cal(root.left,k);
       ans.add(root.val);
     
       cal(root.right,k);
      
   }
}