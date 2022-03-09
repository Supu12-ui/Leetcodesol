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
//postorder means left ,right,root
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
            if(root==null)
            {
                    return Collections.emptyList();
            }
        
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
            st1.push(root);
        TreeNode cur=root;
        while(st1.size()>0)
        {
            TreeNode temp=st1.pop();
            st2.push(temp);
            if(temp.left!=null)
            {
                st1.push(temp.left);
                
            }
            if(temp.right!=null)
            {
                st1.push(temp.right);
            }
        }
        ArrayList<Integer> ar=new ArrayList<>();
        while(st2.size()>0)
        {
            TreeNode temp=st2.pop();
            ar.add(temp.val);
            
        }
        return ar;
    }
}