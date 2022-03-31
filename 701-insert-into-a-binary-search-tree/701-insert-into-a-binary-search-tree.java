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
    public TreeNode insertIntoBST(TreeNode node, int val) {
        if(node==null)
        {
            node=new TreeNode(val);
            return node;
        }
        TreeNode root=node;
        while(true)
        {
            if(root.val>=val)
            {
                if(root.left!=null)
                {
                    root=root.left;
                }
                else
                {
                    root.left=new TreeNode(val);
                    break;
                }
            }
            else
            {
                if(root.right!=null)
                {
                    root=root.right;
                }
                else
                {
                    root.right=new TreeNode(val);
                    break;
                }
            }
        }
        return node;
        
    }
}
//  public TreeNode insertIntoBST(TreeNode root, int val) {
//         if(root==null)
//         {
//             root=new TreeNode(val);
//             return root;
//         }
//         if(val<root.val)
//         {
//             root.left=insertIntoBST(root.left,val);
            
//         }
//         else
//         {
//             root.right=insertIntoBST(root.right,val);
//         }
//         return root;
        
//     }