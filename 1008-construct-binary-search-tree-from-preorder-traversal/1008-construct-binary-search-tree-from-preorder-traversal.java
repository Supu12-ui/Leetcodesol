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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            int key=preorder[i];
            cal(key,root);
        }
        return root;
      
    }
     TreeNode cal(int key,TreeNode root)
    {
         if(root==null)
         {
             root=new TreeNode(key);
             return root;
         }
         if(root.val>key)
         {
             root.left=cal(key,root.left);
         }
         else
         {
             root.right=cal(key,root.right);
         }
       return root;
    }
}