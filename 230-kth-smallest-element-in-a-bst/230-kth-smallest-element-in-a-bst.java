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
    int val=0;
    int a=0;
    public int kthSmallest(TreeNode root, int k) {
       cal(root,k);
        return val;
    
    }
   int  cal(TreeNode root,int k)
   {
       if(root==null)
       {
           return 0;
       }
       cal(root.left,k);
       a++;
       if(a==k)
       {
           val=root.val;
          
       }
     
       cal(root.right,k);
      return val;
   }
}