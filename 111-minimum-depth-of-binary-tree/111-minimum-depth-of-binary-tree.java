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
    public int minDepth(TreeNode root) {
       
        if (root == null)
            return 0;
		//if there is only right child get depth of it
        if (root.left == null)
            return minDepth(root.right) + 1;
		//similarly if there is only left child  get depth of it
        else if (root.right == null)
            return minDepth(root.left) + 1;
		//in case there are both  get the min of both
        return Math.min(minDepth(root.right), minDepth(root.left)) + 1; 
         
        
    }
 
    
}