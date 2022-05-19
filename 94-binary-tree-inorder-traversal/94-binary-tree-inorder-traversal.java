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
     TreeNode cur=root;
     while(st.size()!=0 || cur!=null)
     {
         while(cur!=null)
         {
             st.push(cur);
             cur=cur.left;
         }
         cur=st.pop();
         ans.add(cur.val);
         cur=cur.right;
     }
        return ans;
    }
}


class solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        solve(root,ans);
        return ans;
        
    }
    void solve(TreeNode root,List<Integer> ans)
    {
      if(root==null)
      {
          return;
      }
      solve(root.left,ans);
      ans.add(root.val);
      solve(root.right,ans);
        
    }
}