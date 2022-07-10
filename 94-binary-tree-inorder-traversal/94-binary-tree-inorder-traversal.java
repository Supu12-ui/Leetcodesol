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
    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> ans=new ArrayList<>();
     
     Stack<TreeNode> st=new Stack<>();
        TreeNode temp=root;
     while(st.size()>0||temp!=null)
     {
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.left;
        }
        temp=st.pop();
         ans.add(temp.val);
        
            
            temp=temp.right;
        
         
         
     }
        return ans;
    }
}