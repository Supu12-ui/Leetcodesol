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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root!=null&& root.val==key&&root.left==null && root.right==null)
        {
            return null;
        }
        
        return cal(root,key);
        
    }
    TreeNode cal(TreeNode node,int key)
    {
        if(node==null)
        {
            return node;
        }
        if(node.val==key)
        {
           return helper(node);
        }
        TreeNode root=node;
        while(root!=null)
        {
            if(root.val>=key)
            {
                if(root.left!=null && root.left.val==key)
                {
                  root.left= helper(root.left);
                    break;
                }
                else
                {
                    root=root.left;
                }
            }
            else if(root.val<key)
            {
                if(root.right!=null && root.right.val==key)
                {
                    root.right=helper(root.right);
                    break;
                }
                else
                {
                    root=root.right;
                }
            }
        }
        return node;
    }
    TreeNode helper(TreeNode root)
    {
        if(root.right==null)
        {
            return root.left;
        }
        else if(root.left==null)
        {
            return root.right;
        }
        else
        {
            TreeNode dummy=root.right;
            TreeNode lastNode=last(root.left);
            lastNode.right=dummy;
            return root.left;
            
            
        }
    }
    TreeNode last(TreeNode root)
    {
        if(root.right==null)
        {
            return root;
        }
        return last(root.right);
    }
}