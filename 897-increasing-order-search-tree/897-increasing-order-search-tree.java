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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy=new TreeNode(-1);
        TreeNode temp1=dummy;
        Stack<TreeNode> st=new Stack<>();
        
        TreeNode temp=root;
        while(temp!=null || st.size()!=0)
        {
            while(temp!=null)
            {
               st.push(temp);
                temp=temp.left;
               
            }
            temp=st.pop();
            TreeNode node=new TreeNode(temp.val);
            temp1.right=node;
            temp=temp.right;
           temp1=temp1.right;
        }
        return dummy.right;
        
        
    }
  
}