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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
        {
           return l; 
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(q.size()>0)
        {
           List<Integer> temp=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp1=q.remove();
                 temp.add(temp1.val);
                if(temp1.left!=null)
                {
                    q.add(temp1.left);
                
                }
                if(temp1.right!=null)
                {
                    q.add(temp1.right);
                }
            }
           l.add(new ArrayList<>(temp));
            
        }
        return l;
    }
}