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
    public boolean findTarget(TreeNode root, int k) {
      inorder(root);
       int start=0;
        int end=ans.size()-1;
        while(start<end)
        {
            int sum=ans.get(start)+ans.get(end);
            if(sum==k)
            {
                return true;
            }
            else if(sum>k)
            {
                end--;
            }
            else
            {
                start++;
            }
            
            
                
        }
        return false;
        
    }
    void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
   
    
}